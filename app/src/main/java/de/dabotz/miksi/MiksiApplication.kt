package de.dabotz.miksi

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

/**
 * Created by Botz on 26.02.18.
 */
class MiksiApplication: DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out MiksiApplication> {
        return DaggerApplicationComponent.builder().create(this)
    }
}