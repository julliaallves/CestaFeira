package com.soniaraujo.cestafeiraapp.model

data class Produto(
    //val id: Long,
    val imagem: String,
    val nomeProduto: String,
    val quantidade: Double,
    val valor: Double,
    val descricao: String,
    val categoria: String,
) {
}