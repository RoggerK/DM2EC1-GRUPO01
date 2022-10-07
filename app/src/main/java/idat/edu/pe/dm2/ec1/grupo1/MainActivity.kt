package idat.edu.pe.dm2.ec1.grupo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import idat.edu.pe.dm2.ec1.grupo1.databinding.ActivityMainBinding
import kotlin.math.cos

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnCalcular.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        calcularEstacionamiento()
    }

    private fun calcularEstacionamiento() {
        val costo = 1500
        var hora = binding.txtHoras.text.toString().toInt()
        var minuto = binding.txtMinutos.text.toString().toInt()

        if(minuto > 0) {
            hora++
        }

        var operacion = (hora * costo) //+ (minuto * (costo / 60))
        var resultado = operacion.toString()
        binding.txvResultado.text = "Resultado: $resultado"
    }
}