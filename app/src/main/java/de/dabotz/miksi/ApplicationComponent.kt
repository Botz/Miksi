package de.dabotz.miksi

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

/**
 * Created by Botz on 26.02.18.
 */
@Component(
        modules = [
            AndroidSupportInjectionModule::class,
            ApplicationModule::class,
            ActivityBuilder::class
        ]
)
interface ApplicationComponent: AndroidInjector<MiksiApplication> {
    @dagger.Component.Builder
    abstract class Builder: AndroidInjector.Builder<MiksiApplication>()
}