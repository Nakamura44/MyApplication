package jp.wings.nikkeibp.myapplication
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.omikuji.*


class MainActivity : AppCompatActivity() {

    val omikujiBox = OmikujiBox()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.omikuji)

        omikujiBox.omikujiView = imageView

    }
}

    /*
//くじ番号の取得
        val rnd = Random()
        val number = rnd.nextInt(20)

//        おみくじだなの準備
        val omikujiShelf = Array<String>(20, init = { "吉" })
        omikujiShelf[0] = "吉"
        omikujiShelf[19] = "凶"
//おみくじ棚から取得
        val str = omikujiShelf[number]

        hello_view.text =  str
     */


    fun onButtonClick(v: View) {
        OmikujiBox.shake()

/*
        val translate = TranslateAnimation(0f, 0f, 0f, -200f)
//        引数のfはfroat型を表している

        translate.repeatMode = REVERSE
        translate.repeatCount = 5
        translate.duration = 100

        val rotate = RotateAnimation(0f, -36f, imageView.width/2f, imageView.height/2f )
        rotate.duration =200

      val set  = AnimationSet(true)
        set.addAnimation(rotate)
        set.addAnimation(translate)


        imageView.startAnimation(set)

             imageView.setImageResource(R.drawable.result1)


 */
    }