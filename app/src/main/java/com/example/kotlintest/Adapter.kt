package com.example.kotlintest

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class Adapter(private val list : ArrayList<Contacts>,
              private val context : Context) : RecyclerView.Adapter<Adapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.xmlfile,parent,false));
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact =list[position];
        holder.textView1.text=contact.name;
        holder.textView2.text=contact.s.toString();
        holder.button.setOnClickListener(){
            Toast.makeText(context,"wqw",Toast.LENGTH_SHORT).show();
        }
    }

    override fun getItemCount() =  list.size;


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView1 : TextView
        val textView2 : TextView
        val button : Button
        init {
            textView1=itemView.findViewById(R.id.textView);
            textView2=itemView.findViewById(R.id.textView2);
            button = itemView.findViewById(R.id.button);
        }
    }
}
