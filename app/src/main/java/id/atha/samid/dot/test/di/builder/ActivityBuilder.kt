package id.atha.samid.dot.test.di.builder

import dagger.Module
import dagger.android.ContributesAndroidInjector
import id.atha.samid.dot.test.ui.main.MainActivity

@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity
}