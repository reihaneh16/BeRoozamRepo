package reihaneh.banihashemi.beroozamapplication

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val enterViaSmsButton = findViewById<Button>(R.id.enterViaSmsButton)
        enterViaSmsButton.setOnClickListener { loadEnterViaSmsFragment() }
    }

    private fun loadEnterViaSmsFragment() {
        val fragment = EnterViaSmsFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainer, fragment)
        transaction.addToBackStack(null) // Add fragment to back stack so user can navigate back
        transaction.commit()
    }
}
