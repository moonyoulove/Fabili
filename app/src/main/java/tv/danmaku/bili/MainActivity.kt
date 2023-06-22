package tv.danmaku.bili

import android.app.Activity
import android.content.Intent
import android.os.Bundle


class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (intent != null) {
            if (intent.action == "android.intent.action.VIEW") {
                val newIntent = Intent(Intent.ACTION_VIEW)
                newIntent.addCategory(Intent.CATEGORY_DEFAULT)
                newIntent.addCategory(Intent.CATEGORY_BROWSABLE)
                newIntent.data = intent.data
                newIntent.setPackage("com.bilibili.app.in")
                startActivity(newIntent)
            }
        }
        finish()
    }
}