package id.co.imastudio.santri.kotlin1.mvp


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import id.co.imastudio.santri.kotlin1.R
import kotlinx.android.synthetic.main.activity_main2.*

class MainMVPActivity : AppCompatActivity(), PresenterView {

    var presenter :Presenter?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        //set fungis button 0
        btnHitung1.setOnClickListener{
            presenter?.Hitung(edt1.text.toString(), edt2.text.toString())

        }

        }

    //method on start  1
    override fun onStart() {
        super.onStart()
        presenter = Presenter(this)
    }

    //intercafe alt enter dari metho onStart 2
    override fun hasil(nilai: String) {
        txtHasil1.text= nilai

        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
