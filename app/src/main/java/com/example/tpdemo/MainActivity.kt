package com.example.tpdemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /* TextViews */
        val txtMaleNum = findViewById<TextView>(R.id.maleNum)
        val txtFemaleNum = findViewById<TextView>(R.id.femaleNum)
        val txtrezEntNum = findViewById<TextView>(R.id.rezEntNum)
        val txtrezNoNum = findViewById<TextView>(R.id.rezNoNum)
        val txtTotal = findViewById<TextView>(R.id.txtTotal)

        /* Buttons */
        val btnMaleMinus = findViewById<Button>(R.id.maleMinus)
        val btnMalePlus = findViewById<Button>(R.id.malePlus)
        val btnFemaleMinus = findViewById<Button>(R.id.femaleMinus)
        val btnFemalePlus = findViewById<Button>(R.id.femalePlus)
        val btnRezEntMinus = findViewById<Button>(R.id.rezEntMinus)
        val btnRezEntPlus = findViewById<Button>(R.id.rezEntPlus)
        val btnRezNoMinus = findViewById<Button>(R.id.rezNoMinus)
        val btnRezNoPlus = findViewById<Button>(R.id.rezNoPlus)

        /* Values */
        var maleNum = 0
        var femaleNum = 0
        var rezNum = 0
        var rezNoNum = 0
        var totalCus = 0

        /* MALE */
        btnMalePlus.setOnClickListener()
        {
            maleNum++
            totalCus++
            txtMaleNum.text = maleNum.toString()
            txtTotal.text = totalCus.toString()
        }
        btnMaleMinus.setOnClickListener()
        {
            if (maleNum > 0)
            {
                maleNum--
                totalCus--
            }

            txtMaleNum.text = maleNum.toString()
            txtTotal.text = totalCus.toString()
        }

        /* FEMALE */
        btnFemalePlus.setOnClickListener()
        {
            femaleNum++
            totalCus++
            txtFemaleNum.text = femaleNum.toString()
            txtTotal.text = totalCus.toString()
        }
        btnFemaleMinus.setOnClickListener()
        {
            if (femaleNum > 0)
            {
                femaleNum--
                totalCus--
            }

            txtFemaleNum.text = femaleNum.toString()
            txtTotal.text = totalCus.toString()
        }

        /* REZ */
        btnRezEntPlus.setOnClickListener()
        {
            rezNum++
            totalCus++
            txtrezEntNum.text = rezNum.toString()
            txtTotal.text = totalCus.toString()
        }
        btnRezEntMinus.setOnClickListener()
        {
            if(rezNum > 0)
            {
                rezNum--
                totalCus--
            }

            txtrezEntNum.text = rezNum.toString()
            txtTotal.text = totalCus.toString()
        }

        /* NO REZ */
        btnRezNoPlus.setOnClickListener()
        {
            rezNoNum++
            totalCus++
            txtrezNoNum.text = rezNoNum.toString()
            txtTotal.text = totalCus.toString()
        }
        btnRezNoMinus.setOnClickListener()
        {
            if (rezNoNum > 0)
            {
                rezNoNum--
                totalCus--
            }

            txtrezNoNum.text = rezNoNum.toString()
            txtTotal.text = totalCus.toString()
        }


        }
    }
