package com.dexster.afairstation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dexster.afairstation.adapter.ItemAdapter
import com.dexster.afairstation.data.DataSource
import com.dexster.afairstation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var cajiga: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        cajiga = ActivityMainBinding.inflate(layoutInflater)
        setContentView(cajiga.root)

        // Initialize data.
        val myDataset = DataSource().loadAffirmation()

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        val recyclerView = cajiga.recyclerView
        recyclerView.adapter = ItemAdapter(this, myDataset)

        recyclerView.setHasFixedSize(true)

    }
}