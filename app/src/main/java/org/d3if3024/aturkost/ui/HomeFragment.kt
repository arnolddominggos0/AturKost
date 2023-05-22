package org.d3if3024.aturkost.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import org.d3if3024.aturkost.R
import org.d3if3024.aturkost.databinding.FragmentHomeBinding


class HomeFragment : Fragment () {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_home -> {
                findNavController().navigate(
                    R.id.action_homeFragment_to_daftarPenghuniFragment2

                )
                return true
            }

            R.id.menu_daftarPenghuni -> {
                findNavController().navigate(
                    R.id.action_daftarPenghuniFragment_to_tambahPenghuniFragment)
                return true
            }

            R.id.menu_tagihan -> {
                findNavController().navigate(
                    R.id.action_homeFragment_to_tagihanFragment
                )
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
