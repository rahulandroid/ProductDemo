package com.rahulandroid.productdemo.data.api

import com.rahulandroid.productdemo.data.Product
import retrofit2.Call
import retrofit2.http.GET

interface FakeStoreApi {

    companion object {
        const val BASE_URL = "https://fakestoreapi.com/"
        //https://fakestoreapi.com/products?limit=10
    }

    @GET("products") //loading 10 items limit
    fun getProducts(): Call<List<Product>?>

}