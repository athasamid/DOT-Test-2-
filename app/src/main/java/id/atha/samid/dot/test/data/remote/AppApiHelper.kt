package id.atha.samid.dot.test.data.remote

import com.androidnetworking.common.Priority
import com.rx2androidnetworking.Rx2AndroidNetworking
import id.atha.samid.dot.test.data.model.ListImageResponse
import io.reactivex.Single

class AppApiHelper : ApiHelper {
    override fun performFetchListData(): Single<ListImageResponse> =
            Rx2AndroidNetworking.get(ApiEndPoint.LIST_IMAGE)
                .addHeaders("accept", "application/json")
                .setPriority(Priority.MEDIUM)
                .build()
                .getObjectSingle(ListImageResponse::class.java)
}