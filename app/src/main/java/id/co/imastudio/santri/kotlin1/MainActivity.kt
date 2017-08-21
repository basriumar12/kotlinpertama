package id.co.imastudio.santri.kotlin1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var angka1 = 12
    var angka2 = 45
    var angka3 = 70

    var edt1: EditText?=null
    var edt2: EditText?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edt1= findViewById(R.id.edt1) as EditText?
        edt2= findViewById(R.id.edt2) as EditText?

        var tangkap = intent.getStringExtra("nilai1")
        var tangkap2 = intent.getStringExtra("nilai2")
        var tangkap3 = intent.getStringExtra("nilai3")

        Toast.makeText(applicationContext,tangkap+tangkap2+tangkap3,Toast.LENGTH_SHORT).show()



        //calkulasi
        var hasil = angka1 * angka2 * angka3
        println(hasil)
        Log.d("hasilnya : " , hasil.toString())
      /*  //deklarasi id
        var edt1 = findViewById(R.id.edt_satu) as EditText
        var edt2 = findViewById(R.id.edt_dua) as EditText

        var btnTambah = findViewById(R.id.btntmbah) as Button
        var btnKurang = findViewById(R.id.btnkurang) as Button
        var btnKali = findViewById(R.id.btnkali) as Button
        var btnBagi = findViewById(R.id.btnbagi) as Button

        btnTambah.setOnClickListener{
            val nilai1 :String = edt1.text.toString();
            val nilai2 :String = edt2.text.toString();

            if (nilai1.isEmpty()&&nilai2.isEmpty()){
                Toast.makeText(this,"Tidak bisa kosong",Toast.LENGTH_SHORT).show()

            }
        }*/
    }
}
