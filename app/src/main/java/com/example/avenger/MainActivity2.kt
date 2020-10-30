package com.example.avenger


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.test.internal.runner.junit4.statement.UiThreadStatement
import androidx.test.internal.runner.junit4.statement.UiThreadStatement.runOnUiThread


var thread: Thread = object : Thread() {
    override fun run() {
        try {
            sleep(3000)
        } catch (e: InterruptedException) {
        }
        UiThreadStatement.runOnUiThread(Runnable {
            // Do some stuff
            globalV = 2
        })
    }
}

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        thread.start()
    }
}

