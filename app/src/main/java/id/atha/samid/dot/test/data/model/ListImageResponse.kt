package id.atha.samid.dot.test.data.model

import com.google.gson.annotations.SerializedName

data class ListImageResponse(
    @SerializedName("status_code") val statusCode: Int,
    @SerializedName("data") val data: List<ImageItemResponse>
){
    data class ImageItemResponse(
        @SerializedName("id") val id: Int,
        @SerializedName("title") val title: String,
        @SerializedName("content") val content: String,
        @SerializedName("type") val type: String,
        @SerializedName("media") val media: List<String>
    )
}