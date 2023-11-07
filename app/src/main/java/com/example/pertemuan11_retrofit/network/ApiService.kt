package com.example.pertemuan11_retrofit.network

import com.example.pertemuan11_retrofit.model.RickModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("character")
    fun getRickCharacter(): Call<RickModel>
}