package nl.ckyong.kotlinandroidtest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val inputText: EditText = findViewById(R.id.inputText) as EditText
        val submitButton: Button = findViewById(R.id.submitButton) as Button
        val errorText: TextView = findViewById(R.id.errorText) as TextView

        submitButton.setOnClickListener {
            val input:String = inputText.text.toString()
            when {
                input.equals("kotlin",true)->{
                    val kotlinIntent = Intent(applicationContext, KotlinActivity::class.java)
                    startActivity(kotlinIntent)
                }
                input.isNotBlank() -> {
                    val helloIntent: Intent = Intent(this, HelloNameActivity::class.java)
                    helloIntent.putExtra("nameText", input)
                    startActivity(helloIntent)
                }
                else -> errorText.text = getString(R.string.errorString)
            }
        }
    }
}