package com.example.icetask_1.Data.Network

import com.example.icetask_1.Data.Model.Post
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("posts")
    suspend fun getPostFiltered(
        @Query("userId") userId: Int,
        @Query("id") id: Int
    ): Post
}
