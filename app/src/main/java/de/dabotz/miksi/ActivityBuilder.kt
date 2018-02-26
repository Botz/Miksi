package de.dabotz.miksi

import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Botz on 26.02.18.
 */
@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun bindMainActivity():MainActivity
}