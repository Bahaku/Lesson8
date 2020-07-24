package com.example.lesson8


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val array = arrayOf(4, 45, 234, 234, 23)

        val firstETarry = findViewById<EditText>(R.id.firstETarray)
        val secondETarry = findViewById<EditText>(R.id.secondETarray)
        val thirdETarry = findViewById<EditText>(R.id.thirdETarray)
        val fourthETarry = findViewById<EditText>(R.id.fourthETarray)
        val fifthETarry = findViewById<EditText>(R.id.fifthETarray)


        val firstTVarry = findViewById<TextView>(R.id.firstTVarray)
        val secondTVarry = findViewById<TextView>(R.id.secondTVarray)
        val thirdTVarry = findViewById<TextView>(R.id.thirdTVarray)
        val fourthTVarry = findViewById<TextView>(R.id.fourthTVarray)
        val fifthTVarry = findViewById<TextView>(R.id.fifthTVarray)

        val btngo = findViewById<Button>(R.id.btngo)


        firstETarry.setText(array[0].toString())
        secondETarry.setText(array[1].toString())
        thirdETarry.setText(array[2].toString())
        fourthETarry.setText(array[3].toString())
        fifthETarry.setText(array[4].toString())


        val b1 = 3.14
        val c1 = array[0] * b1
        firstTVarry.text = c1.toString()


        val c2 = array[1] * b1
        secondTVarry.text = c2.toString()


        val c3 = array[2] * b1
        thirdTVarry.text = c3.toString()


        val c4 = array[3] * b1
        fourthTVarry.text = c4.toString()


        val c5 = array[4] * b1
        fifthTVarry.text = c5.toString()




        btngo.setOnClickListener {
            Toast.makeText(this, "Данные обновлены", Toast.LENGTH_LONG).show()

            array[0] = firstETarry.toString().toInt()
            val fo = array[0] * b1
            firstTVarry.text = fo.toString()


        }


    }
}

