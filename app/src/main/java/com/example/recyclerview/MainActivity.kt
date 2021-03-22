package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        recyclerView.layoutManager = layoutManager

        val adapter = PersonAdapter()

        adapter.items.add(Person("홍길동1", "010-0000-0000"))
        adapter.items.add(Person("홍길동2", "010-2000-0000"))
        adapter.items.add(Person("홍길동3", "010-3000-0000"))

        recyclerView.adapter = adapter
    }
}