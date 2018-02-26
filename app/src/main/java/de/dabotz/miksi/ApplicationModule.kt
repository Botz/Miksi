package de.dabotz.miksi

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Botz on 26.02.18.
 */
@Module
class ApplicationModule {

    @Provides
    fun provideGithubRestAdapter():GithubRestAdapter {
        val builder = Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl("https://api.github.com/")

        return builder.build().create(GithubRestAdapter::class.java)
    }

}