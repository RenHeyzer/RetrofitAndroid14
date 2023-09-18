package com.geeks.retrofitandroid14.jsonplaceholder.ui.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.geeks.retrofitandroid14.App
import com.geeks.retrofitandroid14.databinding.ActivityMainBinding
import com.geeks.retrofitandroid14.jsonplaceholder.models.Post
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
//    private val postsApiService = App.retrofitClient.postsApiService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        fetchPosts()
//        createNewPost()
//        updatePost()
//        editPost()
//        deletePost()
    }

    /*private fun fetchPosts() {
        postsApiService.fetchPosts().enqueue(object : Callback<List<Post>> {
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

    private fun createNewPost() = with(binding) {
        btnPost.setOnClickListener {
            val userId = 11
            val postId = 101
            val title = etTitle.text.toString().trim()
            val body = etBody.text.toString().trim()
            val post = Post(
                userId = userId,
                id = postId,
                title = title,
                body = body
            )
            postsApiService.createNewPost(post).enqueue(object : Callback<Post> {
                override fun onResponse(call: Call<Post>, response: Response<Post>) {
                    response.body()?.let {
                        Log.e("post_request", it.toString())
                    }
                }

                override fun onFailure(call: Call<Post>, t: Throwable) {
                    Log.e("post_request", t.localizedMessage ?: "Error Occurred!")
                }
            })
        }
    }

    private fun updatePost() = with(binding) {
        btnPut.setOnClickListener {
            val userId = 11
            val postId = 99
            val title = etTitle.text.toString().trim()
            val body = etBody.text.toString().trim()
            val post = Post(
                userId = userId,
                id = postId,
                title = title,
                body = body
            )
            postsApiService.updatePost(postId, post).enqueue(object : Callback<Post> {
                override fun onResponse(call: Call<Post>, response: Response<Post>) {
                    response.body()?.let {
                        Log.e("put_request", it.toString())
                    }
                }

                override fun onFailure(call: Call<Post>, t: Throwable) {
                    Log.e("put_request", t.localizedMessage ?: "Error Occurred!")
                }
            })
        }
    }

    private fun editPost() = with(binding) {
        btnPatch.setOnClickListener {
            val userId = 11
            val title = etTitle.text.toString().trim()
            val postParams = hashMapOf<String, Any>(
                "userId" to userId,
                "title" to title
            )

            postsApiService.editPost(postParams).enqueue(object : Callback<Post> {
                override fun onResponse(call: Call<Post>, response: Response<Post>) {
                    response.body()?.let {
                        Log.e("patch_request", it.toString())
                    }
                }

                override fun onFailure(call: Call<Post>, t: Throwable) {
                    Log.e("patch_request", t.localizedMessage ?: "Error Occurred!")
                }
            })
        }
    }

    private fun deletePost() {
        binding.btnDelete.setOnClickListener {
            val postId = 100
            postsApiService.deletePost(postId).enqueue(object : Callback<Post> {
                override fun onResponse(call: Call<Post>, response: Response<Post>) {
                    response.body()?.let {
                        Log.e("patch_request", "delete successful")
                    }
                }

                override fun onFailure(call: Call<Post>, t: Throwable) {
                    Log.e("patch_request", t.localizedMessage ?: "Error Occurred!")
                }
            })
        }
    }*/
}
