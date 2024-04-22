package reihaneh.banihashemi.beroozamapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val enterButton = findViewById<Button>(R.id.enterButton)
        enterButton.setOnClickListener { loadEnterFragment() }
    }

    private fun loadEnterFragment() {

        val fragment = EnterViaSmsFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainer, fragment)
        transaction.addToBackStack(null) // Add fragment to back stack so user can navigate back
        transaction.commit()
    }
}

