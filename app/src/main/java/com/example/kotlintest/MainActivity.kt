package com.example.kotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlintest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var list = ArrayList<Contacts>()

        var con1 : Contacts = Contacts("ABCsa",13428);
        var con2 : Contacts = Contacts("ABCadsds",18342);
        var con3 : Contacts = Contacts("ABCsadsasa",18234);
        var con4 : Contacts = Contacts("ABCqwe",18342);
        var con5 : Contacts = Contacts("ABwqewqC",18234);
        var con7 : Contacts = Contacts("ABeqwqC",18534);
        var con6 : Contacts = Contacts("ABweqwqeC",1834543);

        list.add(Contacts("ABCsa",13428));
        list.add(con2);
        list.add(con3);
        list.add(con4);
        list.add(con5);
        list.add(con6);
        list.add(con7);

        var adapter =Adapter(list,this);
        var LinearLayoutManager = LinearLayoutManager(this);
        binding.recyclerView.adapter=adapter
        binding.recyclerView.layoutManager =LinearLayoutManager
    }
}