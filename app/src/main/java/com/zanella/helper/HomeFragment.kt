package com.zanella.helper

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        lateinit var recyclerView: RecyclerView
        lateinit var viewAdapter: RecyclerView.Adapter<*>
        lateinit var viewManager: RecyclerView.LayoutManager
        val view : View = inflater.inflate(R.layout.fragment_home, container, false)


        viewManager = LinearLayoutManager(this.context)


        val myDataset = arrayOf(
            "Rafael", "Scotti", "Zanella"
        )


//            val recyclerView : RecyclerView = view.findViewById(R.id.my_recycler_view)
//            lateinit var viewAdapter: RecyclerView.Adapter<*>

        viewAdapter = MyAdapter(myDataset)

        recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view).apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }

//            recyclerView.adapter = viewAdapter




        // Inflate the layout for this fragment
        return view
    }




}// Required empty public constructor
