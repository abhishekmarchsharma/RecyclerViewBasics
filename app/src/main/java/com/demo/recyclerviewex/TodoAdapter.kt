package com.demo.recyclerviewex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.todoview.view.*


class TodoAdapter (private var todo:List<Todo>) : RecyclerView.Adapter<TodoAdapter.TodoViewHolder>(){


    inner class TodoViewHolder(itemView:View) :RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {

        val view =LayoutInflater.from(parent.context).inflate(R.layout.todoview,parent,false)
        return TodoViewHolder(view)// this requires an itemview the xml
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {

        holder.itemView.apply {

            title.text=todo[position].title
            cbDone.isChecked=todo[position].isChecked


        }

    }

    override fun getItemCount(): Int {

        return todo.size

    }
}