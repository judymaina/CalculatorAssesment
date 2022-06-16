package io.trell.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilFirstnumber: TextInputLayout
    lateinit var etFirstnumber:TextInputEditText
    lateinit var tilSecondnumber:TextInputLayout
    lateinit var etSecondnumber:TextInputEditText
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnDivision: Button
    lateinit var btnModulus: Button
    lateinit var tvResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)
        tilFirstnumber=findViewById(R.id.tilFirstnumber)
        etFirstnumber=findViewById(R.id.etFirstnumber)
        tilSecondnumber=findViewById(R.id.tilSecondnumber)
        etSecondnumber=findViewById(R.id.etSecondnumber)
        btnAdd=findViewById(R.id.btnAdd)
        btnSubtract=findViewById(R.id.btnSubtract)
        btnDivision=findViewById(R.id.btnDivision)
        btnModulus=findViewById(R.id.btnModulus)
        tvResult=findViewById(R.id.tvResult)

        btnAdd.setOnClickListener {

            val num1=etFirstnumber.text.toString().toDouble()
            val num2=etSecondnumber.text.toString().toDouble()
            plus(num1,num2)
        }
        btnSubtract.setOnClickListener {
            val num1=etFirstnumber.text.toString().toDouble()
            val num2=etSecondnumber.text.toString().toDouble()
            minus(num1,num2)
        }
        btnDivision.setOnClickListener {
            val num1=etFirstnumber.text.toString().toDouble()
            val num2=etSecondnumber.text.toString().toDouble()
            divide(num1,num2)
        }
        btnModulus.setOnClickListener {
            val num1=etFirstnumber.text.toString().toDouble()
            val num2=etSecondnumber.text.toString().toDouble()
            modulus(num1,num2)
        }
        btnAdd.setOnClickListener {
            tvResult.text= ""
            val numberone=etFirstnumber.text.toString()
            val numbertwo=etSecondnumber.text.toString()
            if (numberone.isBlank()){
                tilFirstnumber.setError("Numberone is required")

            }
            if (numbertwo.isBlank()){
                tilSecondnumber.setError("Numbertwo is required")

            }
        }
        btnDivision.setOnClickListener {
            tvResult.text= ""
            val numberone=etFirstnumber.text.toString()
            val numbertwo=etSecondnumber.text.toString()
            if (numberone.isBlank()){
                tilFirstnumber.setError("Numberone is required")

            }
            if (numbertwo.isBlank()){
                tilSecondnumber.setError("Numbertwo is required")

            }

        }
        btnModulus.setOnClickListener {
            tvResult.text= ""
            val numberone=etFirstnumber.text.toString()
            val numbertwo=etSecondnumber.text.toString()
            if (numberone.isBlank()){
                tilFirstnumber.setError("Numberone is required")

            }
            if (numbertwo.isBlank()){
                tilSecondnumber.setError("Numbertwo is required")

            }
        }
        btnSubtract.setOnClickListener {
            tvResult.text= ""
            val numberone=etFirstnumber.text.toString()
            val numbertwo=etSecondnumber.text.toString()
            if (numberone.isBlank()){
                tilFirstnumber.setError("Numberone is required")

            }
            if (numbertwo.isBlank()){
                tilSecondnumber.setError("Numbertwo is required")

            }

        }
    }
    fun plus (num1:Double,num2:Double){
        val total=num1+num2
        tvResult.text=total.toString()
    }
    fun minus (num1:Double,num2:Double){
        val total=num1-num2
        tvResult.text=total.toString()
    }
    fun divide (num1:Double,num2:Double){
        val total=num1/num2
        tvResult.text=total.toString()
    }
    fun modulus (num1:Double,num2:Double){
        val total=num1%num2
        tvResult.text=total.toString()
    }

}