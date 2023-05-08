package com.example.networkot

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View

class Connexionlgn @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {
    // regarde Tanoh ici j utlise la methode drawline pour dessiner les connexions
//
    /*override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        val dessin = Paint()
        canvas?.drawCircle(0f ,0f, 1300f , dessin)


          val connexionPath = Path()
          connexionPath.moveTo(700f,1400f)
          connexionPath.lineTo(1000f,1400f)
          connexionPath.close()
          dessin.stokewidht = 3f
          dessin.setColor(Color.GREEN)
          dessin.style = Paint.Style.STROKE
          canvas?.drawPath(connexionPath,dessin)
    }*/

    private var PointDepart : PointF? = null
    private var PointArrive : PointF? = null
    private var dessin : Paint? = null
    private var Etatdessin = false

    init{
        dessin = Paint()
        dessin!!.color = Color.BLACK
        dessin!!.strokeWidth = 10f
        dessin!!.isAntiAlias = true

    }

    override fun onDraw(dessn :Canvas? ){
        super.onDraw(dessn)

        if(Etatdessin){
            dessn!!.drawLine(PointDepart!!.x, PointDepart!!.y , PointArrive!!.x, PointArrive!!.y ,
                dessin!!
            )
        }else{

        }
    }



    override fun onTouchEvent(event: MotionEvent?): Boolean {

        when (event!!.action) {
            MotionEvent.ACTION_DOWN -> {
                PointDepart = PointF(event.x, event.y)
                PointArrive = PointF()
                Etatdessin = true


            }

            MotionEvent.ACTION_MOVE -> {
                //PointDepart = PointF(event.x,)
                PointArrive!!.x = event.x
                PointArrive!!.y = event.y
                invalidate()

            }
            MotionEvent.ACTION_UP -> {
                PointDepart = PointF(event.x, event.y)
                PointArrive = PointF()
                Etatdessin = false
                invalidate()


            }
            else -> {

            }
        }

        return true


    }




}