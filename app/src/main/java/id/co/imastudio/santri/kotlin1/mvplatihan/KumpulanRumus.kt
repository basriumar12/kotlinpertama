package id.co.imastudio.santri.kotlin1.mvplatihan

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import id.co.imastudio.santri.kotlin1.R
import kotlinx.android.synthetic.main.activity_kumpulan_rumus.*

class KumpulanRumus : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kumpulan_rumus)
            segitiga.setOnClickListener{
                var intent = Intent(applicationContext, SegitigaActivity::class.java)
                startActivity(intent)
            }

            persegi.setOnClickListener{
                var intent2 = Intent(applicationContext,PersegiActivity::class.java)
                startActivity(intent2)
            }

            persegipanjang.setOnClickListener{
                var intent3 = Intent(applicationContext,PersegiPanjangActivity::class.java)
                startActivity(intent3)
            }

    }
}
