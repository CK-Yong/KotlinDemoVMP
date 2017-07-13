package nl.ckyong.kotlinandroidtest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

/**
 * Created by ckyoung on 11-Jul-17.
 */

class HelloNameActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_helloname)
        val name:String = intent.extras["nameText"].toString()
        val nameText = findViewById(R.id.nameDisplay) as TextView
        nameText.text = "Hello $name!"
    }
}
