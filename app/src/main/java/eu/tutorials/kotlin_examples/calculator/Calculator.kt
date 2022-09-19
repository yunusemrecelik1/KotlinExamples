package eu.tutorials.kotlin_examples.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import eu.tutorials.kotlin_example.R


class  Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculator_view)
    }
}