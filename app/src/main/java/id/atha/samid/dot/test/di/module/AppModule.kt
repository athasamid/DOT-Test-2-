package id.atha.samid.dot.test.di.module

import dagger.Module
import dagger.Provides
import id.atha.samid.dot.test.data.AppDataManager
import id.atha.samid.dot.test.data.DataManager
import id.atha.samid.dot.test.data.remote.ApiHelper
import id.atha.samid.dot.test.data.remote.AppApiHelper
import id.atha.samid.dot.test.utils.rx.AppSchedulerProvider
import id.atha.samid.dot.test.utils.rx.SchedulerProvider
import javax.inject.Singleton

@Module
class AppModule {
    @Provides
    @Singleton
    fun provideApiHelper(): ApiHelper = AppApiHelper()

    @Provides
    @Singleton
    fun provideDataManager(appDataManager: AppDataManager): DataManager = appDataManager

    @Provides
    fun provideSchedulerProvider(): SchedulerProvider {
        return AppSchedulerProvider()
    }
}