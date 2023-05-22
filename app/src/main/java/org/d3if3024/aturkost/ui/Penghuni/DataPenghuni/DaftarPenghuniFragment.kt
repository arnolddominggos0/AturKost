package org.d3if3024.aturkost.ui.Penghuni.DataPenghuni

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import org.d3if3024.aturkost.databinding.FragmentDaftarPenghuniBinding
import org.d3if3024.aturkost.ui.Penghuni.DataPenghuni.DaftarPenghuniViewModel
import org.d3if3024.aturkost.ui.PenghuniAdapter
class DaftarPenghuniFragment : Fragment() {

    companion object {
        fun newInstance() = DaftarPenghuniFragment()
    }

    private val viewModel: DaftarPenghuniViewModel by lazy {
        ViewModelProvider(this).get(DaftarPenghuniViewModel::class.java)
    }

    private lateinit var binding: FragmentDaftarPenghuniBinding
    private lateinit var myAdapter: PenghuniAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDaftarPenghuniBinding.inflate(layoutInflater, container, false)
        myAdapter = PenghuniAdapter()
        with(binding.recyclerView) {
            addItemDecoration(
                DividerItemDecoration(
                    context,
                    RecyclerView.VERTICAL
                )
            )
            adapter = myAdapter
            setHasFixedSize(true)
        }
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        myAdapter = PenghuniAdapter()
        with(binding.recyclerView) {
            addItemDecoration(DividerItemDecoration(context, RecyclerView.VERTICAL))
            adapter = myAdapter
            setHasFixedSize(true)
        }
    }
}

