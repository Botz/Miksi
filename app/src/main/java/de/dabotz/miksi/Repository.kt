package de.dabotz.miksi

/**
 * Created by Botz on 26.02.18.
 */
data class Repository(val name: String) {

    data class List(val items:kotlin.collections.List<Repository> = listOf())
}