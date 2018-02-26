package de.dabotz.miksi

import kotlinx.coroutines.experimental.Deferred
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Botz on 26.02.18.
 */
interface GithubRestAdapter {

    @GET("search/repositories")
    fun search(@Query("q") query: String): Call<Repository.List>
}