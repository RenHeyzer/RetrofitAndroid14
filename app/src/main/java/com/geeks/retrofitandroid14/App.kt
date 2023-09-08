package com.geeks.retrofitandroid14

import android.app.Application
import com.geeks.retrofitandroid14.data.remote.RetrofitClient

class App : Application() {

    companion object {
        @JvmStatic
        lateinit var retrofitClient: RetrofitClient
            private set
    }

    override fun onCreate() {
        super.onCreate()
        retrofitClient = RetrofitClient()
    }
}