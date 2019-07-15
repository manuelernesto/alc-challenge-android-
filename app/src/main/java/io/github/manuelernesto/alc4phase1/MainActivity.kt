package io.github.manuelernesto.alc4phase1

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        findViewById<Button>(R.id.btn_profile).setOnClickListener {
            val i = Intent(this@MainActivity, ProfileActivity::class.java)
            startActivity(i)
        }

        findViewById<Button>(R.id.btn_about).setOnClickListener {
            val i = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(i)
        }
    }
}
