package kg.tutorialapp.momshelper_template

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomePageActivity : AppCompatActivity() {

    lateinit var bottom_nav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        bottom_nav = findViewById(R.id.bottom_nav)
        bottom_nav.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.menu_settings -> {
                    setText("Settings")
                    true
                }
                R.id.menu_todolist -> {
                    setText("Todo list")
                    true
                }
                R.id.menu_bookmarks -> {
                    setText("Bookmarks")
                    true
                }
                R.id.menu_directory -> {
                    setText("Directory")
                    true
                }
                else -> false
            }
        }
    }

    private fun setText(title: String) {
        setTitle(title)
        tv_fragm_title.text = title // set title to Spinner bar's fragments
    }
}