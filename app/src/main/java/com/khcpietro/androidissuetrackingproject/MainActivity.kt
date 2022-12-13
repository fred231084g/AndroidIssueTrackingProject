package com.khcpietro.androidissuetrackingproject

import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<WebView>(R.id.web_view).apply {
            loadData(
                """
                    <html>
                        <head>
                            <meta charset="utf-8">
                            <meta name="viewport" content="width=device-width,initial-scale=1">
                            <title>fitsSystemWindows</title>
                        </head>
                        <body>
                            <select>
                                <option value="Red">Red</option>
                                <option value="Blue">Blue</option>
                                <option value="Black">Black</option>
                                <option value="Green">Green</option>
                                <option value="Yellow">Yellow</option>
                            </select>
                        </body>
                    </html>
                """.trimIndent(), "text/html", "utf-8"
            )
        }
    }
}