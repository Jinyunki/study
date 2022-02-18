package com.jyk.test28

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sum(1,2)

        val items = listOf("apple", "banana", "kiwifruit")
        for (str in items){
            // println("인덱스 : $index, 값 : ${items[index]}")
            println("str : $str")
        }

        // Test

    }


    fun sum(a: Int, b: Int){
        println("$a 와 $b 의 합은 ${a+b}")
    }

    fun divider(a: Int, b: Int) = a / b
}