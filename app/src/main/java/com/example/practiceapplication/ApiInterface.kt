package com.example.practiceapplication

import com.example.practiceapplication.Models.ApiDataItem
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    // Gets Takes End Point Of  JSON Data from API "posts" the end of the url of json data
   @GET("posts")
    //Function To get data  this function call(call is netwokr call objcet)
    // List beacause api have list of array items and <Api Data Item Takes this List> APi data items is class
    fun  getData(): Call<List<ApiDataItem>>
}