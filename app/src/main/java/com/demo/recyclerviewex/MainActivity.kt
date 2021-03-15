package com.demo.recyclerviewex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var todoList= mutableListOf(
                Todo("Vishal need Motivation " ,false),
                Todo("Vishal need Motivation ", false),
                Todo("Vishal need Motivation " ,false),

                Todo("Vishal need Motivation " ,false),

                )


        val adapter=TodoAdapter(todoList)

        rvTodo.adapter=adapter

        rvTodo.layoutManager=LinearLayoutManager(this)


        addTodo.setOnClickListener {
            val title =etTodo.text.toString()
            val todo=Todo(title,false)
            todoList.add(todo)
            adapter.notifyItemInserted(todoList.size-1)
        }




    }
}