package com.example.geekbrainskotlinhw1

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val catBarsik = Cat("Barsik", 5)

        val cats = listOf(
                catBarsik.copy(name = "cat1"),
                catBarsik.copy(name = "cat2"),
                catBarsik.copy(name = "cat3"),
        )

        for (cat in cats) {
            println(cat.name)
        }

        for (i in 0..10) {
            println(i)
        }

        for (i in 10 downTo 1 step 2) {
            println(i)
        }

        for (index in 0 until cats.size) {
            println(cats[index])
        }

        findViewById<MaterialButton>(R.id.material_button).setOnClickListener {
            Toast.makeText(this, "${catBarsik.name}. Age - ${catBarsik.age}", Toast.LENGTH_SHORT).show()
        }
    }
}
