package id.atha.samid.dot.test.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import id.atha.samid.dot.test.BR
import id.atha.samid.dot.test.R
import id.atha.samid.dot.test.data.model.ListImageResponse
import id.atha.samid.dot.test.databinding.LayoutImageSingleBinding

class ImageAdapter : RecyclerView.Adapter<ImageAdapter.ImageSingleViewHolder>() {
    private var item = mutableListOf<ListImageResponse.ImageItemResponse>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageSingleViewHolder {
        val dataBinding = DataBindingUtil.inflate<LayoutImageSingleBinding>(LayoutInflater.from(parent.context), R.layout.layout_image_single, parent, false)
        return ImageSingleViewHolder(dataBinding)
    }

    override fun getItemCount(): Int = item.size

    override fun onBindViewHolder(holder: ImageSingleViewHolder, position: Int) {
        holder.setDataBinding(item[position])
    }

    fun setItem(item: MutableList<ListImageResponse.ImageItemResponse>){
        this.item = item
        notifyDataSetChanged()
    }

    fun appendItem(item: MutableList<ListImageResponse.ImageItemResponse>){
        this.item.addAll(item)
        notifyDataSetChanged()
    }

    class ImageSingleViewHolder(@NonNull dataBinding: LayoutImageSingleBinding): RecyclerView.ViewHolder(dataBinding.root) {
        var mDataBinding = dataBinding

        fun setDataBinding(data: ListImageResponse.ImageItemResponse){
            val img = ItemImage()
            img.setId(data.id)
            img.setContent(data.content)
            img.setTitle(data.title)
            img.setType(data.type)
            img.setMedia(data.media)

            with(mDataBinding){
                setVariable(BR.viewModel, img)
                executePendingBindings()
            }
        }
    }

}