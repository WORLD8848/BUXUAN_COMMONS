package com.ibuxuan.commons.interfaces

import com.ibuxuan.commons.activities.BaseSimpleActivity

interface RenameTab {
    fun initTab(activity: BaseSimpleActivity, paths: ArrayList<String>)

    fun dialogConfirmed(callback: (success: Boolean) -> Unit)
}
