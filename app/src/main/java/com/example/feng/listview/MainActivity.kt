package com.example.feng.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var bookList: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bookList = findViewById(R.id.book_listview)

        val books = arrayListOf<String>("Kindred", "Hamlet", "The Awakening", "Fireborne", "Burn", "1984", "The Raven Boys", "The Lightning Thief", "The Hunger Games", "Every Heart a Doorway", "The Poisonwood Bible", "King Lear", "Julius Caesar", "The Handmaid's Tale", "Crush", "The Glass Castle")
        val bookViewAdapter: ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1, books)

        bookList.adapter = bookViewAdapter

        bookList.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "You Selected: " + books[position], Toast.LENGTH_SHORT).show()
        }
    }
}