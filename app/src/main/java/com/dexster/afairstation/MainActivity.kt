package com.dexster.afairstation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dexster.afairstation.data.DataSource
import com.dexster.afairstation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var cajiga: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        cajiga = ActivityMainBinding.inflate(layoutInflater)
        setContentView(cajiga.root)





    }
}