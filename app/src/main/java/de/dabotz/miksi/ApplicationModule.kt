package de.dabotz.miksi

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Botz on 26.02.18.
 */
@Module
class ApplicationModule {

    @Provides
    fun provideGithubRestAdapter():GithubRestAdapter {
        val client = OkHttpClient.Builder()
                .addInterceptor(HttpLoggingInterceptor().apply {
                    level = HttpLoggingInterceptor.Level.BODY
                })
                .build()

        val builder = Retrofit.Builder()
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.github.com/")

        return builder.build().create(GithubRestAdapter::class.java)
    }

}