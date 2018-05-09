package tharris.ranken.edu.resume

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.method.LinkMovementMethod
import android.widget.TextView
import android.webkit.WebView





class EducationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education)

        val wv = findViewById<WebView>(R.id.trhWebView)
        wv.loadUrl("http://iwt.ranken.edu/tharris/tharrisportfolio/index.html")
    }
}
