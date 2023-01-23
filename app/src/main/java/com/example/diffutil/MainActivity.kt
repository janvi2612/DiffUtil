package com.example.diffutil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView =findViewById<RecyclerView>(R.id.recyclerview)
        val adapter = ProgrammimgAdapter()

        val p1 = ProgrammimgItem(1,"J","java")
        val p2 = ProgrammimgItem(2,"D","Database")
        val p3 = ProgrammimgItem(3,"A","Android")

        adapter.submitList(listOf(p1,p2,p3))

        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter=adapter

      Handler(Looper.getMainLooper()).postDelayed(Runnable{

          val p3 = ProgrammimgItem(3,"A","Android")
          val p4 = ProgrammimgItem(4,"K","Kotlin")
          val p5 = ProgrammimgItem(5,"N","Node")
          val p6 = ProgrammimgItem(6,"G","Golang")
          adapter.submitList(listOf(p3,p4,p5,p6))
      },4000)
    }
}