package id.atha.samid.dot.test

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import id.atha.samid.dot.test.data.DataManager
import id.atha.samid.dot.test.ui.main.MainViewModel
import id.atha.samid.dot.test.utils.rx.SchedulerProvider
import javax.inject.Inject

class ViewModelProviderFactory @Inject constructor(var mDataManager: DataManager, var mSchedulerProvider: SchedulerProvider) : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when{
            modelClass.isAssignableFrom(MainViewModel::class.java) -> MainViewModel(mDataManager, mSchedulerProvider) as T
            else -> super.create(modelClass)
        }
    }
}