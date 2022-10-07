package idat.edu.pe.dm2.ec1.grupo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import idat.edu.pe.dm2.ec1.grupo1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}