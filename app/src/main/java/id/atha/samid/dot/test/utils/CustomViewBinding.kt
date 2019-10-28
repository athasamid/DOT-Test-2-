package id.atha.samid.dot.test.utils

import android.util.Log
import android.util.TimeUtils
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

object CustomViewBinding{
    @BindingAdapter("url")
    @JvmStatic
    fun bindImageViewUrl(imageView: ImageView?, url: String?){
        if (imageView != null) {
            Log.e("bindingUrlImageview", url.toString())
            Glide.with(imageView.context)
                .setDefaultRequestOptions(RequestOptions().timeout(5*60*1000))
                .load(url)
                .centerCrop()
                .into(imageView)
        }
    }

    @BindingAdapter("setAdapter")
    @JvmStatic
    fun setRecyclerViewAdapter(recyclerView: RecyclerView?, adapter: RecyclerView.Adapter<*>?){
        recyclerView?.setHasFixedSize(true)
        recyclerView?.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        recyclerView?.adapter = adapter
    }

    @BindingAdapter("setHorizontalAdapter")
    @JvmStatic
    fun setHorizontalAdapter(recyclerView: RecyclerView?, adapter: RecyclerView.Adapter<*>?){
        recyclerView?.setHasFixedSize(true)
        recyclerView?.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)
        recyclerView?.adapter = adapter
    }



    @BindingAdapter("setPagerAdapter")
    @JvmStatic
    fun setViewPagerAdapter(viewPager: ViewPager?, adapter: PagerAdapter?){
        viewPager?.adapter = adapter
    }
}