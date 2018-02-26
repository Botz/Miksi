package de.dabotz.miksi

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.coroutines.experimental.async
import ru.gildor.coroutines.retrofit.Result
import ru.gildor.coroutines.retrofit.awaitResult
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject lateinit var githubRestAdapter:GithubRestAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        searchRepos()
    }

    private fun searchRepos() = async {
        val result = githubRestAdapter.search("Miksi").awaitResult()

        when (result) {
            is Result.Ok -> println(result.value.items)
            is Result.Error -> print(result.response.code())
            is Result.Exception -> println(result.exception)
        }

    }
}
