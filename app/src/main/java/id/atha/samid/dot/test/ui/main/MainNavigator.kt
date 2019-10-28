package id.atha.samid.dot.test.ui.main

import id.atha.samid.dot.test.data.model.ListImageResponse

interface MainNavigator {
    fun dataLoaded(list: ListImageResponse)

    fun showLoader()
    fun hideLoader()
}