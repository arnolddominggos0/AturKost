import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import org.d3if3024.aturkost.R
import org.d3if3024.aturkost.databinding.FragmentDaftarPenghuniBinding
import org.d3if3024.aturkost.ui.Penghuni.DetailPenghuni.DetailPenghuniFragment
import org.d3if3024.aturkost.ui.Penghuni.DetailPenghuni.DetailPenghuniViewModel
import org.d3if3024.aturkost.ui.PenghuniAdapter

class DaftarPenghuniFragment : Fragment() {

    private lateinit var binding: FragmentDaftarPenghuniBinding
    private lateinit var viewModel: DaftarPenghuniViewModel
    private lateinit var penghuniAdapter: PenghuniAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDaftarPenghuniBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(DaftarPenghuniViewModel::class.java)
        penghuniAdapter = PenghuniAdapter()

        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            addItemDecoration(DividerItemDecoration(requireContext(), LinearLayoutManager.VERTICAL))
            adapter = penghuniAdapter
        }

        viewModel.penghuniList.observe(viewLifecycleOwner, Observer { penghuniList ->
            penghuniAdapter.submitList(penghuniList)
        })

        viewModel.loadPenghuniData()

        binding.floatingActionButton.setOnClickListener {
            findNavController().navigate(R.id.action_daftarPenghuniFragment_to_tambahPenghuniFragment)
        }

        penghuniAdapter.setOnItemClickListener { penghuni ->
            val detailPenghuniFragment = DetailPenghuniFragment()
            val viewModel = ViewModelProvider(requireActivity()).get(DetailPenghuniViewModel::class.java)
            viewModel.setPenghuni(penghuni)

            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.myNavHostFragment, detailPenghuniFragment)
                .addToBackStack(null)
                .commit()
        }
    }
}







