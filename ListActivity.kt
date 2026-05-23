package com.example.mainactivity

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class ListActivity : AppCompatActivity() {

    private val settingsItems = arrayOf(
        "Show Preview",
        "Capture Animation",
        "Cut the status bar area",
        "Cut the navigation bar area",
        "Format: PNG (High/Slow)",
        "Cloud Upload",
        "Save Location: /storage/emulated/0/Pictures/Screenshots"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val toolbar = findViewById<Toolbar>(R.id.toolbar2)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val listView = findViewById<ListView>(R.id.simpleListView)
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            settingsItems
        )
        listView.adapter = adapter
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}