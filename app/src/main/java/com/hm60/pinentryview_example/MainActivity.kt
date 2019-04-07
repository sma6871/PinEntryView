package com.hm60.pinentryview_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pin.onPinChange { x, y ->
            Toast.makeText(this, "$x $y", Toast.LENGTH_SHORT).show()

        }
    }
}
