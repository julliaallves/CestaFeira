package com.soniaraujo.cestafeiraapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.soniaraujo.cestafeiraapp.databinding.FragmentAdminPainelBinding

class adminPainelFragment : Fragment() {

    private lateinit var binding: FragmentAdminPainelBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentAdminPainelBinding.inflate(layoutInflater, container, false)

        binding.buttonAddProduto.setOnClickListener{
            findNavController().navigate(R.id.action_adminPainelFragment_to_formProductFragment)
        }

        binding.buttonEditProduto.setOnClickListener{
            findNavController().navigate(R.id.action_adminPainelFragment_to_postProductsFragment)
        }

        return binding.root
    }
}