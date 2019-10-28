package id.atha.samid.dot.test.data

import id.atha.samid.dot.test.data.model.ListImageResponse
import id.atha.samid.dot.test.data.remote.ApiHelper
import io.reactivex.Single
import javax.inject.Inject

class AppDataManager @Inject constructor(private var apiHelper: ApiHelper) : DataManager {
    override fun performFetchListData(): Single<ListImageResponse> = apiHelper.performFetchListData()
}