package th.ac.su.phatchara.simpleloancalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var num = findViewById<TextView>(R.id.putnum)
        var num1 = findViewById<TextView>(R.id.putper)
        var num2 = findViewById<TextView>(R.id.putgu)
        var button = findViewById<Button>(R.id.button)
        val btnOpenActivity : Button = findViewById<Button>(R.id.button)
        btnOpenActivity.setOnClickListener {
            val intent = Intent(this, MainActivity2 :: class.java)
            startActivity(intent)


        }
        button.setOnClickListener {
            var n: Double = num.text.toString().toDouble()
            var n1: Double = num1.text.toString().toDouble()
            var n2: Double = num2.text.toString().toDouble()
            var sh = (n + (n * (n1 / 100) * n2)) / (n2 * 12)

            val intent1 = Intent(this@MainActivity, MainActivity2 :: class.java)
            intent1.putExtra("show", sh)
            startActivity(intent1)

        }
    }
}