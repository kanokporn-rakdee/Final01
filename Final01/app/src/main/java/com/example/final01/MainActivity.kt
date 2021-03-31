package com.example.final01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var he = 0.0
    var we = 0.0
    var aq = 0.0
    var pp = ""
    var op = ""
    var sum = 0.0
    var total = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btMan.setOnClickListener{
            he = 5 * height.text.toString().toDouble()
            we = 13.7 * weight.text.toString().toDouble()
            aq = 6.8 * age.text.toString().toDouble()
            op = "M"
        }

        btGirl.setOnClickListener{
            he = 1.8 * height.text.toString().toDouble()
            we = 9.6 * weight.text.toString().toDouble()
            aq = 4.7 * age.text.toString().toDouble()
            op = "G"
        }

        btBmr.setOnClickListener{
            if (op == "M"){
                sum = 66 + he + we - aq
                show.text = sum.toString()
            }else if (op == "G"){
                sum = 665 + he + we - aq
                show.text = sum.toString()
            }
        }

        btBmi.setOnClickListener{
            var  sumHe = 0.0
            he = height.text.toString().toDouble()/100
            sumHe = he * he
            sum = height.text.toString().toDouble() / sumHe
            show.text = sum.toString()
        }

        btTdee.setOnClickListener {
            if (op == "1" && op == "G") {
                sum = 665 + he + we - aq
                total = sum * 1.2
                show.text = total.toString()
            }
            else if (op == "1" && op == "M") {
                sum = 66 + he + we - aq
                total = sum * 1.2
                show.text = total.toString()
            }
            else if (pp == "1" && op == "G") {
                sum = 665 + he + we - aq
                total = sum * 1.375
                show.text = total.toString()
            }
            else if (pp == "2" && op == "M") {
                sum = 66 + he + we - aq
                total = sum * 1.375
                show.text = total.toString()
            }
            else if (pp == "3" && op == "G") {
                sum = 665 + he + we - aq
                total = sum * 1.55
                show.text = total.toString()
            }
            else if (pp == "3" && op == "M") {
                sum = 66 + he + we - aq
                total = sum * 1.55
                show.text = total.toString()
            }
            else if (pp == "4" && op == "G") {
                sum = 665 + he + we - aq
                total = sum * 1.725
                show.text = total.toString()
            }
            else if (pp == "4" && op == "M") {
                sum = 66 + he + we - aq
                total = sum * 1.725
                show.text = total.toString()
            }
            else if (pp == "5" && op == "G") {
                sum = 665 + he + we - aq
                total = sum * 1.9
                show.text = total.toString()
            }
            else if (pp == "5" && op == "M") {
                sum = 66 + he + we - aq
                total = sum * 1.9
                show.text = total.toString()
            }

        }

        bt1.setOnClickListener{
            pp = "1"
        }

        bt2.setOnClickListener{
            pp = "2"
        }

        bt3.setOnClickListener{
            pp = "3"
        }

        bt4.setOnClickListener{
            pp = "4"
        }

        bt5.setOnClickListener{
            pp = "5"
        }
    }
}