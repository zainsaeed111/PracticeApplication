package com.example.practiceapplication.testFragemntsandActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.practiceapplication.ApiInterface
import com.example.practiceapplication.Models.ApiDataItem
import com.example.practiceapplication.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
const val BASE_URl="https://jsonplaceholder.typicode.com/"
class TestApi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_api)
        getMyData()
    }

    private fun getMyData() {
        val retrofitBuilder= Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            //Add Base URL Of API:
            .baseUrl(BASE_URl)
            .build()
            //Take reference of interface :: doucle colon use to take refrence
            .create(ApiInterface::class.java)

        //Make variable to get data from retrofit builder above
        val retrofitData=retrofitBuilder.getData()

        //Enque Retrofit
        retrofitData.enqueue(object : Callback<List<ApiDataItem>?> {
            override fun onResponse(
                call: Call<List<ApiDataItem>?>,
                response: Response<List<ApiDataItem>?>
            ) {

                val responseBody=response.body()!!
                val myStringBuilder=StringBuilder()
                for(ApiData in responseBody){
                    myStringBuilder.append(ApiData.id)
                    myStringBuilder.append("\n")
                }
                val txtId = findViewById<TextView>(R.id.txtId)
                txtId.text=myStringBuilder
            }

            override fun onFailure(call: Call<List<ApiDataItem>?>, t: Throwable) {

                Log.d("testApi", "onFailure: "+t.message)
            }
        })

    }
}
