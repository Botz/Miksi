package de.dabotz.miksi

import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by Botz on 26.02.18.
 */
interface GithubRestAdapter {

    @GET("search")
    fun search(): Call<Any>
}