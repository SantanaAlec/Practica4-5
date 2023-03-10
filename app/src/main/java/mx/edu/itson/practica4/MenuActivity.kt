package mx.edu.itson.practica4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnAntojitos: Button =findViewById(R.id.btn_antojitos) as Button
        var btnEspecialidades: Button =findViewById(R.id.btn_especialidades) as Button
        var btnCombinations: Button =findViewById(R.id.btn_combinations) as Button
        var btnTortas: Button =findViewById(R.id.btn_tortas) as Button
        var btnSopas: Button =findViewById(R.id.btn_sopas) as Button
        var btnDrinks: Button =findViewById(R.id.btn_drinks) as Button


        btnAntojitos.setOnClickListener{
            var intent: Intent= Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "antojitos")
            startActivity(intent)
        }

        btnEspecialidades.setOnClickListener{
            var intent: Intent= Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "especialidades")
            startActivity(intent)
        }

        btnCombinations.setOnClickListener{
            var intent: Intent= Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "combinations")
            startActivity(intent)
        }

        btnTortas.setOnClickListener{
            var intent: Intent= Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "tortas")
            startActivity(intent)
        }

        btnSopas.setOnClickListener{
            var intent: Intent= Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "sopas")
            startActivity(intent)
        }

        btnDrinks.setOnClickListener{
            var intent: Intent= Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "drinks")
            startActivity(intent)
        }
    }
}