package mx.tecnm.tepic.ladm_u2_p1_copos_manuelfloresrios

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint

import kotlin.random.Random

class Copos(l: Lienzo) {
    val l=l
    var x=0f
    var y=0f
    var movY=0f
    var color= Color.WHITE
    init {
        x=rand(1050)
        y=rand(1900)
        movY=rand(6)+2

    }
    private fun rand(hasta:Int):Float{
        return Random.nextInt(hasta).toFloat()
    }
    fun mover(){
        y+=movY
        if(y>l.height){
            y=0f
            x=rand(1050)
        }
    }
    fun pintar(canvas:Canvas){
        var p= Paint()
        p.color=color
        canvas.drawCircle(x,y,10f,p)
    }
}