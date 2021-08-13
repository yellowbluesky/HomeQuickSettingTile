package com.antony.homequicksettingtile

import android.os.Build
import android.service.quicksettings.TileService
import androidx.annotation.RequiresApi
import android.content.Intent

@RequiresApi(Build.VERSION_CODES.N)
class HomeTileService : TileService() {
    override fun onClick() {
        super.onClick()
        val startMain = Intent(Intent.ACTION_MAIN)
        startMain.addCategory(Intent.CATEGORY_HOME)
        startMain.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(startMain)
    }
}