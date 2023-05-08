package com.example.networkot

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.example.networkot.testdessin.Companion.CouleurB
import com.example.networkot.testdessin.Companion.ListCouleur
import com.example.networkot.testdessin.Companion.pathlist


class MainActivity : AppCompatActivity() {

    companion object
    {
        var path = Path()
        var dessinP = Paint()
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        // reccuperation id du bouton Ajout d objet
       val btnAJoutObjet = findViewById<View>(R.id.add)

        // reccuperation id du bouton reunitialiser
        val btnReinitialise = findViewById<View>(R.id.btnreset)


        // une action listener pour le boutou ajout objet lorsqu on appuis
        btnAJoutObjet.setOnClickListener{



            Toast.makeText(this,"creation de l objet",Toast.LENGTH_SHORT).show()

        }

        btnReinitialise.setOnClickListener{

            Toast.makeText(this,"reinitialisation  effectuee",Toast.LENGTH_SHORT).show()

            pathlist.clear()
            ListCouleur.clear()
            path.reset()
        }

   /*     btnAng.setOnClickListener{

            Toast.makeText(this,"creation de l objet",Toast.LENGTH_SHORT).show()

        }
        btnfrn.setOnClickListener{

            Toast.makeText(this,"creation de l objet",Toast.LENGTH_SHORT).show()

        }
*/
    }



    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.bouton_up_menu, menu)


        return super.onCreateOptionsMenu(menu)

        // reccuperation id du bouton Anglais
        val btnAng = menu?.findItem(R.id.btnang)
    }


   /* override fun onOptionsItemSelected (item: MenuItem) : Boolean {
        return when (item.itemId) {

            R.id.btnfr -> {
                this.title = "Graphs : settings mode"
                true

            }

            R.id.btnang -> {
                this.title = "Graphs : arc addition mode"
                true

            }
            else -> {
               super.onOptionsItemSelected (item)
            }
        }

    }*/



            fun parametrClr(color: Int){
        CouleurB = color
        path = Path()
    }

     fun onDraw(canvas: Canvas?) {

        val dessin: Paint = Paint()
        dessin.setColor(Color.MAGENTA)
        dessin.strokeWidth = 10f
        canvas?.drawCircle(0f,0f,700f,dessin)


    }
    // couleur change


}