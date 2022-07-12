package com.soniaraujo.cestafeiraapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.soniaraujo.cestafeiraapp.databinding.FragmentFormProductBinding


class formProductFragment : Fragment() {

    private lateinit var binding: FragmentFormProductBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentFormProductBinding.inflate(layoutInflater, container, false)

        binding.buttonBackAdd.setOnClickListener{
            findNavController().navigate(R.id.action_formProductFragment_to_adminPainelFragment)
        }

        return binding.root
    }

    fun addProduto (){
    }

}