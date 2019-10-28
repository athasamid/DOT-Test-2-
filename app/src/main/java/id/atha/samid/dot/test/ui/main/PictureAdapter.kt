package id.atha.samid.dot.test.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import id.atha.samid.dot.test.BR
import id.atha.samid.dot.test.R
import id.atha.samid.dot.test.databinding.LayoutImageBinding

class PictureAdapter : RecyclerView.Adapter<PictureAdapter.PictureViewHolder>() {
    private var items = listOf<String>()

    fun setData(list: List<String>){
        this.items = list
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PictureViewHolder =
        PictureViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.layout_image, parent, false))

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: PictureViewHolder, position: Int) {
        holder.bind(items[position])
    }

    class PictureViewHolder(private val binding: LayoutImageBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(url: String){
            with(binding){
                setVariable(BR.viewModel, url)
                executePendingBindings()
            }
        }
    }
}