package com.example.networkot

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class Connexionlgn @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {
    // regarde Tanoh ici j utlise la methode drawline pour dessiner les connexions
//
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        val dessin = Paint()
        canvas?.drawLine(0f ,0f, 300f , 300f ,dessin)
    }

}