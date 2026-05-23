package com.example.mainactivity

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class SimpleListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_list)

        val toolbar = findViewById<Toolbar>(R.id.toolbar_simple)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Simple List View"

        val listView = findViewById<ListView>(R.id.simple_list_view)
        
        val items = arrayOf(
            "Item 1: Android Basics",
            "Item 2: Activity Lifecycle",
            "Item 3: Intent and Filters",
            "Item 4: Services",
            "Item 5: Broadcast Receivers",
            "Item 6: Content Providers",
            "Item 7: Layouts and Views",
            "Item 8: ListView and Adapters",
            "Item 9: RecyclerView",
            "Item 10: Fragments"
        )

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)
        listView.adapter = adapter
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}