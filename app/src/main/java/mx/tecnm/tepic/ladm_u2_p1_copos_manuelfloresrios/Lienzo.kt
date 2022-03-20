package mx.tecnm.tepic.ladm_u2_p1_copos_manuelfloresrios

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random

class Lienzo (este:MainActivity): View(este) {
    val este = este
    var intensidad = true
    val copo = Array<Copos>(100, { Copos(this) })
    val copo2 = Array<Copos>(400, { Copos(this) })
    var con = rando(50)
    var con2 = 0

    val corutina = GlobalScope.launch {
        while (true) {
            este.runOnUiThread() {
                invalidate()
            }
            delay(20L)
            if (con <= 2000){
                con++
            }
            if (con >= 2001 ){
                con--
            }
            if(con >= 0 && con <= 1000){
                intensidad = false
                con2++
            }
            if(con >= 1001 && con <= 2000){
                intensidad = true
                con2++
            }
            if(con2 >= 200){
                con = rando(2000)
                con2 = 0
            }

        }
    }

    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        c.drawColor(Color.rgb(1, 55, 97))
        val p = Paint()
        //Luna
        p.color = Color.rgb(255, 240, 107)
        c.drawCircle(800f, 90f, 450f, p)
        //crateres
        p.color = Color.rgb(237, 225, 109)
        c.drawCircle(800f, 90f, 57f, p)
        p.color = Color.rgb(237, 225, 109)
        c.drawCircle(400f, 90f, 50f, p)
        p.color = Color.rgb(237, 225, 109)
        c.drawCircle(500f, 250f, 55f, p)
        p.color = Color.rgb(237, 225, 109)
        c.drawCircle(1050f, 80f, 80f, p)
        p.color = Color.rgb(237, 225, 109)
        c.drawCircle(650f, 150f, 80f, p)
        p.color = Color.rgb(237, 225, 109)
        c.drawCircle(750f, 370f, 80f, p)
        p.color = Color.rgb(237, 225, 109)
        c.drawCircle(655f, 450f, 55f, p)
        p.color = Color.rgb(237, 225, 109)
        c.drawCircle(950f, 300f, 55f, p)
        p.color = Color.rgb(237, 225, 109)
        c.drawCircle(930f, 460f, 55f, p)
        p.color = Color.rgb(237, 225, 109)
        c.drawCircle(550f, 0f, 80f, p)


        //montañas

        p.color = Color.rgb(200, 200, 200)
        c.drawCircle(530f, 1700f, 750f, p)
        p.color = Color.rgb(94, 156, 204)
        c.drawCircle(530f, 1900f, 800f, p)
        //c.drawCircle(300f,1990f,500f,p)
        p.color = Color.rgb(200, 200, 200)
        c.drawCircle(70f, 1240f, 100f, p)
        p.color = Color.rgb(200, 200, 200)
        c.drawCircle(250f, 1200f, 100f, p)
        p.color = Color.rgb(200, 200, 200)
        c.drawCircle(410f, 1180f, 100f, p)
        p.color = Color.rgb(200, 200, 200)
        c.drawCircle(540f, 1180f, 100f, p)
        p.color = Color.rgb(200, 200, 200)
        c.drawCircle(680f, 1180f, 100f, p)
        p.color = Color.rgb(200, 200, 200)
        c.drawCircle(865f, 1180f, 100f, p)
        //casa
        p.color = Color.rgb(149, 90, 71)
        c.drawRect(600F, 1700F, 1100F, 1200F, p)
        p.color = Color.rgb(96, 64, 54)
        c.drawRect(560F, 1220F, 960F, 1140F, p)
        p.color = Color.rgb(96, 64, 54)
        c.drawRect(620F, 1220F, 960F, 1110F, p)
        p.color = Color.rgb(96, 64, 54)
        c.drawRect(650F, 1220F, 960F, 1070F, p)
        p.color = Color.rgb(96, 64, 54)
        c.drawRect(680F, 1220F, 960F, 1050F, p)
        p.color = Color.rgb(96, 64, 54)
        c.drawRect(680F, 1220F, 1100F, 1050F, p)
        //Chimenea
        p.color = Color.rgb(186, 82, 50)
        c.drawRect(720F, 1160F, 880F, 980F, p)

        p.color = Color.rgb(108, 110, 111)
        c.drawOval(800F, 800F, 1000F, 900F, p)
        p.color = Color.rgb(108, 110, 111)
        c.drawOval(770F, 965F, 900F, 900F, p)

        //ventana
        p.color = Color.rgb(193, 174, 2)
        c.drawRect(900F,1300f,1300F,1500F,p)
        p.color = Color.rgb(0, 0, 0)
        c.drawRect(980F,1300f,1020F,1500F,p)
        p.color = Color.rgb(0, 0, 0)
        c.drawRect(900F,1365f,1300F,1410F,p)

        //puerta
        p.color = Color.rgb(177, 127, 111)
        c.drawRect(650F, 1700F, 850F, 1380F, p)

        //Arbol
        p.color = Color.rgb(84,56,34)
        c.drawRect(190F,1450F,250f,1620F,p)

        p.color = Color.rgb(45, 112, 4)
        c.drawOval(140f,1230f,300f,1330f,p)
        c.drawOval(140f,1300f,300f,1400f,p)
        c.drawOval(140f,1370f,300f,1470f,p)

        p.color = Color.rgb(220,220,220)
        c.drawOval(140f,1230f,300f,1270f,p)
        c.drawOval(140f,1300f,300f,1350f,p)
        c.drawOval(140f,1370f,300f,1420f,p)

        if(intensidad) {
            for (cop in copo) {
                cop.mover()
                cop.pintar(c)
            }
        }else{
            for (cop in copo2) {
                cop.mover()
                cop.pintar(c)
            }
        }
    }
    private fun rando(hasta: Int): Float {
        return Random.nextInt(hasta).toFloat()
    }
}