package com.geeks.retrofitandroid14.ui.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.geeks.retrofitandroid14.App
import com.geeks.retrofitandroid14.R
import com.geeks.retrofitandroid14.models.Post
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fetchPosts()
    }

    private fun fetchPosts() {
        App.retrofitClient.postsApiService.fetchPosts().enqueue(object: Callback<List<Post>> {
            override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
                response.body()?.let {
                    Log.e("success", it.toString())
                }
            }

            override fun onFailure(call: Call<List<Post>>, t: Throwable) {
                Log.e("error", t.localizedMessage ?: "Error not showing")
            }
        })
    }
}