package th.ac.su.phatchara.simpleloancalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var intent1 = intent
        val show = intent1.getStringExtra("show")
        val btnOpenActivity : Button = findViewById<Button>(R.id.buttonback)
        val sh = findViewById<TextView>(R.id.show)

        sh.text = show
        btnOpenActivity.setOnClickListener {
            val intent = Intent(this, MainActivity :: class.java)
            startActivity(intent)
        }
    }
}


