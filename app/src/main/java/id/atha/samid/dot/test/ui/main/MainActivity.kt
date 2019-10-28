package id.atha.samid.dot.test.ui.main

import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProviders
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import id.atha.samid.dot.test.BR
import id.atha.samid.dot.test.R
import id.atha.samid.dot.test.ViewModelProviderFactory
import id.atha.samid.dot.test.data.model.ListImageResponse
import id.atha.samid.dot.test.databinding.ActivityMainBinding
import id.atha.samid.dot.test.ui.base.BaseActivity
import javax.inject.Inject

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(), MainNavigator, SwipeRefreshLayout.OnRefreshListener {
    @Inject
    internal lateinit var factory: ViewModelProviderFactory

    private lateinit var mMainViewModel: MainViewModel
    private lateinit var mMainViewBinding: ActivityMainBinding

    override val bindingVariable: Int
        get() = BR.viewModel
    override val layoutId: Int
        get() = R.layout.activity_main
    override val viewModel: MainViewModel
        get() {
            mMainViewModel = ViewModelProviders.of(this, factory).get(MainViewModel::class.java)
            return mMainViewModel
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mMainViewModel.setNavigator(this)
        mMainViewBinding = viewDataBinding

        setSupportActionBar(mMainViewBinding.toolbar)
        mMainViewBinding.swipeRefreshLayout.setOnRefreshListener(this)
        mMainViewBinding.swipeRefreshLayout.setColorSchemeColors(ContextCompat.getColor(this, R.color.colorAccent))
    }

    override fun dataLoaded(list: ListImageResponse) {
        mMainViewModel.getAdapter().setItem(list.data.toMutableList())
    }

    override fun showLoader() {
        mMainViewBinding.swipeRefreshLayout.isRefreshing = true
    }

    override fun hideLoader() {
        mMainViewBinding.swipeRefreshLayout.isRefreshing = false
    }

    override fun onRefresh() {
        mMainViewModel.fetchData()
    }
}
