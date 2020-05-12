package com.ibuxuan.commons.interfaces

import com.ibuxuan.commons.views.MyScrollView

interface SecurityTab {
    fun initTab(requiredHash: String, listener: HashListener, scrollView: MyScrollView)

    fun visibilityChanged(isVisible: Boolean)
}
