package com.soniaraujo.cestafeiraapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.soniaraujo.cestafeiraapp.adapter.ProdutoAdapter
import com.soniaraujo.cestafeiraapp.databinding.FragmentListProductsAdminBinding
import com.soniaraujo.cestafeiraapp.model.Produto


class listProductsAdminFragment : Fragment() {

    private lateinit var binding: FragmentListProductsAdminBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentListProductsAdminBinding.inflate(layoutInflater, container, false)

        val listProduto = listOf(
            Produto(
                "laranja",
                "Laranja",
                100.0,
                8.99,
                "Laranja saborosa",
                "fruta"
            )
        )

        //Configuração RecycleView
        val adapter = ProdutoAdapter()
        binding.recycleViewAdmin.layoutManager = GridLayoutManager(context, 2)
        binding.recycleViewAdmin.adapter = adapter
        binding.recycleViewAdmin.setHasFixedSize(true)

        adapter.setList(listProduto)

        binding.buttonBack.setOnClickListener {
            findNavController().navigate(R.id.action_postProductsFragment_to_adminPainelFragment)
        }

        return binding.root
    }
}