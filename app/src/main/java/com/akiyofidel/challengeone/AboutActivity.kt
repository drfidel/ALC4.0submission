package com.akiyofidel.challengeone

import android.content.Context
import android.net.http.SslError
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.webkit.SslErrorHandler
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_about.*

class AboutActivity : AppCompatActivity() {

    //general webview
    var GwebView:WebView?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        //WVAbout.loadUrl("https://andela.com/alc/")
        //WVAbout.loadUrl("https://www.google.com/")

        //andela URL to load
        val andelaUrl="https://andela.com/alc/"

        //
        val webViewer = findViewById<WebView>(R.id.WVAbout)

        //
        val websettings = webViewer.settings
        websettings.javaScriptEnabled = true
        websettings.domStorageEnabled = true
        webViewer.setWebViewClient(MyWebViewClient())

        webViewer.loadUrl(andelaUrl)

    }

    private inner class MyWebViewClient(): WebViewClient(){
        override fun shouldOverrideUrlLoading(view: WebView, url:String): Boolean {
            GwebView!!.loadUrl(url)
            return true
        }

        override fun onReceivedSslError(view: WebView,handler: SslErrorHandler,error: SslError)
        {
            handler.proceed()
        }
    }

}
