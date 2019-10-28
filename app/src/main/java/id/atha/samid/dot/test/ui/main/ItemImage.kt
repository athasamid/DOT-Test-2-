package id.atha.samid.dot.test.ui.main

import android.util.Log
import androidx.databinding.ObservableField

class ItemImage {
    private var id: Int? = null
    private var title = ObservableField<String>()
    private var content = ObservableField<String>()
    private var type = ObservableField<String>()
    private var firstMedia = ObservableField<String>()
    private var media = listOf<String>()
    private var adapter = PictureAdapter()

    var multiple = ObservableField<Boolean>()

    fun getId(): Int? = id
    fun setId(id: Int?){
        this.id = id
    }

    fun getTitle()= title
    fun setTitle(title: String?){
        this.title.set(title)
    }

    fun getType() = type
    fun setType(type: String?){
        this.type.set(type)
        multiple.set(type == "multiple")
    }

    fun getContent() = content
    fun setContent(content: String?) {
        this.content.set(content)
    }

    fun getMedia() = media

    fun setMedia(media: List<String>){
        Log.e("ItemImage", media.toString())
        this.media = media
        this.firstMedia.set(media[0])
        adapter.setData(media)
    }

    fun getFirstMedia() = firstMedia

    fun getAdapter() = adapter
}