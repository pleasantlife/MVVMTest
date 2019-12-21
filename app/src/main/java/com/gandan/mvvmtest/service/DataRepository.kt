package com.gandan.mvvmtest.service

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.gandan.mvvmtest.model.Project
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class DataRepository {

    companion object {

        private  val GITHUB_API_URL = "https://api.github.com/"

        private var retrofit : Retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(GITHUB_API_URL)
            .build()

        private var githubService = retrofit.create(GitHubService::class.java)

        fun getProjectList(userId: String): LiveData<List<Project>> {
            val data: MutableLiveData<List<Project>> = MutableLiveData<List<Project>>()

            githubService.getProjectList(userId).enqueue(object : Callback<List<Project>> {

                override fun onResponse(
                    call: Call<List<Project>>,
                    response: Response<List<Project>>
                ) {
                    data.value = response.body()
                }

                override fun onFailure(call: Call<List<Project>>, t: Throwable) {
                    data.value = null
                }

            })

            return data
        }
    }

}