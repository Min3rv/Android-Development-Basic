package com.example.belajarandroidactivity

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        var inputNumber1:EditText = findViewById(R.id.inputNumber1)
        var inputNumber2:EditText = findViewById(R.id.inputNumber2)

        var btnPlus:Button = findViewById(R.id.btnPlus)
        var btnMinus:Button = findViewById(R.id.btnMinus)
        var btnPercent:Button = findViewById(R.id.btnPercent)
        var btnDivide:Button = findViewById(R.id.btnDivide)
        var btnMultiple:Button = findViewById(R.id.btnMutiple)
        var btnClear:Button = findViewById(R.id.btnClear)

        var result:TextView = findViewById(R.id.results)

        val builder: AlertDialog.Builder = AlertDialog.Builder (this@CalculatorActivity)

        btnPlus.setOnClickListener {
            var numberOne:Int = inputNumber1.text.toString().toInt()
            var numberTwo:Int = inputNumber2.text.toString().toInt()
            var plusResult:Int = numberOne + numberTwo

            result.setText(plusResult.toString())
        }
        btnMinus.setOnClickListener {
            var numberOne:Int = inputNumber1.text.toString().toInt()
            var numberTwo:Int = inputNumber2.text.toString().toInt()
            var minusResult:Int = numberOne - numberTwo

            result.setText(minusResult.toString())
        }
        btnPercent.setOnClickListener {
            var numberOne:Int = inputNumber1.text.toString().toInt()
            var numberTwo:Int = inputNumber2.text.toString().toInt()
            var percentResult:Int = numberOne % numberTwo

            result.setText(percentResult.toString())
        }
        btnDivide.setOnClickListener {
            var numberOne:Int = inputNumber1.text.toString().toInt()
            var numberTwo:Int = inputNumber2.text.toString().toInt()
            var divideResult:Int = numberOne / numberTwo

            result.setText(divideResult.toString())
        }
        btnMultiple.setOnClickListener {
            var numberOne:Int = inputNumber1.text.toString().toInt()
            var numberTwo:Int = inputNumber2.text.toString().toInt()
            var multipleResult:Int = numberOne * numberTwo

            result.setText(multipleResult.toString())
        }
        btnClear.setOnClickListener {
            var numberOne:Int = inputNumber1.text.toString().toInt()
            var numberTwo:Int = inputNumber2.text.toString().toInt()
            var clearResult:Int = 0
            builder.setTitle("Warning")
            builder.setMessage("yakin mau clear datanya?")
            builder.setCancelable(false)
            builder.setPositiveButton("Yes",DialogInterface.OnClickListener { dialog, which ->
                clearResult = 0
                inputNumber1.setText ("")
                inputNumber2.setText ("")
            })
            builder.setNegativeButton("No",DialogInterface.OnClickListener { dialog, which ->

            })
                builder.setIcon(R.drawable.baseline_info_24)
                val alertDialog:AlertDialog = builder.create()
                alertDialog.show()

                result.setText(clearResult.toString())

        }
    }
}