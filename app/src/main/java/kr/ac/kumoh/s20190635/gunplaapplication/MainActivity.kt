package kr.ac.kumoh.s20190635.gunplaapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.s20190635.gunplaapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}