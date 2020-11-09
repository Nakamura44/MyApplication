package jp.wings.nikkeibp.myapplication

import android.view.animation.Animation
import android.view.animation.AnimationSet
import android.view.animation.RotateAnimation
import android.view.animation.TranslateAnimation
import android.widget.ImageView
import kotlinx.android.synthetic.main.omikuji.*
import kotlin.random.Random




class OmikujiBox {
    //    後に初期化する場合は、 lateinitをつける
    lateinit var omikujiView: ImageView
    var finish = false
    val number: Int
        get() {
            val rnd = Random
            return rnd.nextInt(20)
        }


    fun shake() {
        val translate = TranslateAnimation(0f, 0f, 0f, -200f)
//        引数のfはfroat型を表している

        translate.repeatMode = Animation.REVERSE
        translate.repeatCount = 5
        translate.duration = 100

        val rotate = RotateAnimation(0f, -36f, omikujiView.width/2f, omikujiView.height/2f )

        rotate.duration =200

        val set  = AnimationSet(true)
        set.addAnimation(rotate)
        set.addAnimation(translate)


        omikujiView.startAnimation(set)

        finish = true

    }
}
