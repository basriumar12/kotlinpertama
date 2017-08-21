package id.co.imastudio.santri.kotlin1

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

   /* var edt1:EditText?=null
    var edt2:EditText?=null
    var btnHitung:Button?=null
    var btnPindah:Button?=null
    var txthsl:TextView?=null*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
/*

        edt1= findViewById(R.id.edt1) as EditText?
        edt2= findViewById(R.id.edt2) as EditText?
        txthsl= findViewById(R.id.txtHasil1) as TextView?
        btnHitung= findViewById(R.id.btnHitung1) as Button?
*/



       /* btnPindah= findViewById(R.id.btnPindah) as Button?*/
        btnPindah?.setOnClickListener{
            var intent = Intent(applicationContext,MainActivity::class.java)
            intent.putExtra("nilai1",edt1?.text.toString())
            intent.putExtra("nilai2",edt2?.text.toString())
            intent.putExtra("nilai3",txtHasil1?.text)
            startActivity(intent)
        }
        //btn hitung
        btnHitung1?.setOnClickListener{
            var nilai1 = edt1?.text.toString()
            var nilai2 = edt2?.text.toString()
            if (nilai1.isNotEmpty()&&nilai2.isNotEmpty()){
                //convert string menuju double
                var x = nilai1.toDouble()
                var y = nilai2.toDouble()
                //calcut
                var hasil = (x*y) /2
                //pindah ke textview
                txtHasil1?.setText("Hasilnya Adalah :" +hasil.toString())
                //pilihan ke 2
                //txthsl?.text = hasil.toString()

            } else{
                //deklarasi variabel dialog
                var alert = AlertDialog.Builder(this)
                alert.setTitle("Warning !!")
                alert.setMessage("tidak bisa kosng edittext")
                alert.setIcon(R.mipmap.ic_launcher)

                alert.setPositiveButton("ok", DialogInterface.OnClickListener { dialogInterface, i ->
                    dialogInterface.dismiss()
                })
                alert.show()
            }


        }

    }
}
