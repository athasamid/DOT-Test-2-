package id.atha.samid.dot.test.data.remote

import id.atha.samid.dot.test.data.model.ListImageResponse
import io.reactivex.Single

interface ApiHelper {
    fun performFetchListData(): Single<ListImageResponse>
}