package id.atha.samid.dot.test.ui.base

import androidx.lifecycle.ViewModel
import id.atha.samid.dot.test.data.DataManager
import id.atha.samid.dot.test.utils.rx.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import java.lang.ref.WeakReference

abstract class BaseViewModel<N>(private var mDataManager: DataManager, var mSchedulerProvider: SchedulerProvider): ViewModel() {
    private val mCompositeDisposable = CompositeDisposable()

    private var mNavigator: WeakReference<N>? = null

    override fun onCleared() {
        mCompositeDisposable.dispose()
        super.onCleared()
    }

    fun getCompositeDisposable(): CompositeDisposable = mCompositeDisposable

    fun getDataManager(): DataManager = mDataManager

    fun getNavigator(): N? = mNavigator?.get()

    fun setNavigator(navigator: N) {
        this.mNavigator = WeakReference(navigator)
    }
}