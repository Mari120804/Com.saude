package com.example.comsaude

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainActivity12(private val exercises: List<Exercise>) : RecyclerView.Adapter<MainActivity12.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.exerciseNameTextView)
        val descriptionTextView: TextView = itemView.findViewById(R.id.exerciseDescriptionTextView)
        val linkTextView: TextView = itemView.findViewById(R.id.exerciseLinkTextView)

        init {
            linkTextView.setOnClickListener {
                val exercise = exercises[adapterPosition]
                val uri = Uri.parse(exercise.url)
                val intent = Intent(Intent.ACTION_VIEW, uri)
                itemView.context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_main12, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val exercise = exercises[position]
        holder.nameTextView.text = exercise.name
        holder.descriptionTextView.text = exercise.description
    }

    override fun getItemCount(): Int {
        return exercises.size
    }
}
