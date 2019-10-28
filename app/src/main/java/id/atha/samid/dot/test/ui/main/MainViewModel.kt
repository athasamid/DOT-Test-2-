package id.atha.samid.dot.test.ui.main

import id.atha.samid.dot.test.data.DataManager
import id.atha.samid.dot.test.ui.base.BaseViewModel
import id.atha.samid.dot.test.utils.rx.SchedulerProvider

class MainViewModel(dataManager: DataManager, schedulerProvider: SchedulerProvider): BaseViewModel<MainNavigator>(dataManager, schedulerProvider){
    private val TAG = MainViewModel::class.java.simpleName

    private val adapter = ImageAdapter()

    init {
        fetchData()
    }

    fun getAdapter() = adapter

    fun fetchData(){
        getNavigator()?.showLoader()
        getCompositeDisposable().add(
            getDataManager().performFetchListData()
                .subscribeOn(mSchedulerProvider.io())
                .observeOn(mSchedulerProvider.ui())
                .subscribe({res ->
                    getNavigator()?.dataLoaded(res)
                    getNavigator()?.hideLoader()
                }, {
                    getNavigator()?.hideLoader()
                })
        )
    }

}