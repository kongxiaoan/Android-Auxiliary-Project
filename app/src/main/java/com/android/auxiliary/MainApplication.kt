package com.android.auxiliary

import android.app.Application
import android.content.Context

/**
 * @author: kpa
 * @time: 2021/3/6
 * @email: billkp@yeah.net
 **/
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)

    }
}