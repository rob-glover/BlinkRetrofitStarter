package com.blinkhealth.android.blinkretrofitstarter

import retrofit2.Retrofit

class GitHubService {

    private val gitHubApi: GitHubApi

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            //.addConverterFactory(GsonConverterFactory.create())
            //.addConverterFactory(MoshiConverterFactory.create())
            //.addConverterFactory(JacksonConverterFactory.create())
            .build()
         gitHubApi = retrofit.create(GitHubApi::class.java)
    }

    companion object {
        private const val BASE_URL = "https://api.github.com"
    }
}