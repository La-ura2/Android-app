package com.example.mainactivity

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar?>(R.id.toolbar)
        setSupportActionBar(toolbar)
        // Ensure the title from XML is displayed
        supportActionBar?.setDisplayShowTitleEnabled(true)

        // Navigate to ListActivity when Cloud Upload row is clicked
        val rowCloudUpload = findViewById<LinearLayout?>(R.id.rowCloudUpload)
        rowCloudUpload?.setOnClickListener(View.OnClickListener { v: View? ->
            val intent = Intent(this@MainActivity, ListActivity::class.java)
            startActivity(intent)
        })

        // Navigate to SimpleListActivity when Save Location row is clicked
        val rowSaveLocation = findViewById<LinearLayout?>(R.id.rowSaveLocation)
        rowSaveLocation?.setOnClickListener(View.OnClickListener { v: View? ->
            val intent = Intent(this@MainActivity, SimpleListActivity::class.java)
            startActivity(intent)
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        getMenuInflater().inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_more -> {
                // handle click
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}