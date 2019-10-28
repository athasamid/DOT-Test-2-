package id.atha.samid.dot.test

import android.app.Activity
import android.app.Application
import android.os.StrictMode
import com.androidnetworking.AndroidNetworking
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import id.atha.samid.dot.test.di.component.DaggerAppComponent
import javax.inject.Inject

class BaseApp : Application(), HasActivityInjector {
    @Inject
    internal lateinit var activityDispatcingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector(): AndroidInjector<Activity>  = activityDispatcingAndroidInjector

    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent.builder()
            .application(this)
            .build()
            .inject(this)

        AndroidNetworking.initialize(this)

        val builder = StrictMode.VmPolicy.Builder()
        StrictMode.setVmPolicy(builder.build())
    }
}