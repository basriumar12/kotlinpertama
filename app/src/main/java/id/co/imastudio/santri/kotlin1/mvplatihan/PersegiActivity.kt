package id.co.imastudio.santri.kotlin1.mvplatihan

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import id.co.imastudio.santri.kotlin1.R
import kotlinx.android.synthetic.main.activity_persegi.*

class PersegiActivity : AppCompatActivity(), PresenterView {
    override fun segitiga(nilai: String) {
        txtHasil1.text=nilai
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun persegipanjang(nilai: String) {
        txtHasil1.text=nilai
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    var presenter2 : Presenter2?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi)

        btnHitung1.setOnClickListener{
            presenter2?.Hitung(edt1.text.toString(),edt2.text.toString())

        }
    }

    override fun onStart() {
        super.onStart()
        presenter2 = Presenter2(this)
    }
    override fun persegi(nilai: String) {
        txtHasil1.text=nilai
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
