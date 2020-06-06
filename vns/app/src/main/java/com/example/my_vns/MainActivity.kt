package com.example.my_vns

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.my_vns.R.layout.activity_main
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var buttonGoToHistory : Button
    lateinit var buttonPlaceVisit : Button
    lateinit var buttonSpeciality : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)

        val bundle:Bundle? = intent.extras

        bundle?.let{
            val message = bundle.getString("user_name")

            Toast.makeText(this,message, Toast.LENGTH_SHORT ).show()

            txtuserName.text = message
        }





        buttonGoToHistory = findViewById(R.id.vns_history)

        buttonGoToHistory.setOnClickListener {
            val intent: Intent = Intent(applicationContext, history_activity::class.java).also {
                startActivity(it)
            }
        }


        buttonPlaceVisit = findViewById(R.id.place_to_visit)

        buttonPlaceVisit.setOnClickListener {
            val intent: Intent = Intent(applicationContext, placeVisitActivity::class.java).also {
                startActivity(it)
            }
        }


        buttonSpeciality = findViewById(R.id.speciality)

        buttonSpeciality.setOnClickListener {
            val intent: Intent = Intent(applicationContext, SpecialityActivity::class.java).also {
                startActivity(it)
            }
        }


    }
}
