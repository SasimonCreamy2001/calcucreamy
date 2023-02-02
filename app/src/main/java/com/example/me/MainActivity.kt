package com.example.me

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var indep = true
    var oldnum = ""
    var opera = "+"
    fun numberevent(view: View) {
        if (indep)
            text_v.setText("")
        indep = false
        var buclick :String = text_v.text.toString()
        var buselect = view as Button
        when(buselect.id){
            num1.id -> {buclick +="1"}
            num2.id -> {buclick +="2"}
            num3.id -> {buclick +="3"}
            num4.id -> {buclick +="4"}
            num5.id -> {buclick +="5"}
            num6.id -> {buclick +="6"}
            num7.id -> {buclick +="7"}
            num8.id -> {buclick +="8"}
            num9.id -> {buclick +="9"}
            num0.id -> {buclick +="0"}
            point.id -> {buclick +="."}

        }
        text_v.setText(buclick)
    }

    fun operaterevent(view: View) {
        indep = true
        oldnum = text_v.text.toString()
        var  buselect : Button = view as Button
        when(buselect.id){
            multiplies.id -> {opera ="*"}
            plus.id -> {opera ="+"}
            minus.id -> {opera ="-"}
            divided.id -> {opera ="/"}
    }

}
    fun equalEvent(view: View) {
        var newnumber :String = text_v.text.toString()
        var result = 0.00
        when(opera){
            "+" -> {result = oldnum.toDouble() + newnumber.toDouble()}
            "*" -> {result = oldnum.toDouble() * newnumber.toDouble()}
            "/" -> {result = oldnum.toDouble() / newnumber.toDouble()}
            "-" -> {result = oldnum.toDouble() - newnumber.toDouble()}
        }
        text_v.setText(result.toString())
}

    fun acEvent(view: View) {
        text_v.setText("0")
        indep = true
    }

    fun percentEvent(view: View) {
        var no: Double = text_v.text.toString().toDouble()/100
        text_v.setText(no.toString())
        indep = true
    }
}


