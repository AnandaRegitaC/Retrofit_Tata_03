package com.example.retrofit_tata_03.api

import com.example.retrofit_tata_03.model.IndonesiaResponse
import com.example.retrofit_tata_03.model.ProvinceResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("indonesia")
    fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>

    @GET("indonesia/provinsi")
    fun getProvince(): Call<ArrayList<ProvinceResponse>>
}