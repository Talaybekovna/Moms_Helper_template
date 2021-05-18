package kg.tutorialapp.momshelper_template

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StartPageActivity : AppCompatActivity() {

    lateinit var btn_start: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_page)

        btn_start = findViewById(R.id.btn_start)
        btn_start.setOnClickListener {
            val i = Intent(this, RegistrationActivity::class.java)
            startActivity(i)
        }
    }
}