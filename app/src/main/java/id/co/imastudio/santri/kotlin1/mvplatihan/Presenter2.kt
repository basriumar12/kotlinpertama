package id.co.imastudio.santri.kotlin1.mvplatihan

/**
 * Created by Server on 21/08/2017.
 */
class Presenter2 {
    var presenterView : PresenterView?=null

    constructor(presenterView: PresenterView?) {
        this.presenterView = presenterView
    }


    //buat method
    fun Hitung(nilai1 : String, nilai2 : String){
        if (nilai1.isNotEmpty()&&nilai2.isNotEmpty()){
            //convert string menuju double
            var x = nilai1.toDouble()
            var y = nilai2.toDouble()
            //calcut
            var hasil = x*y
            presenterView?.segitiga(hasil.toString())

        } else{
            //deklarasi variabel dialog
            /* var alert = AlertDialog.Builder(this)
             alert.setTitle("Warning !!")
             alert.setMessage("tidak bisa kosng edittext")
             alert.setIcon(R.mipmap.ic_launcher)

             alert.setPositiveButton("ok", DialogInterface.OnClickListener { dialogInterface, i ->
                 dialogInterface.dismiss()
             })
             alert.show()*/
        }

    }
    fun Hitung2(nilai1 : String, nilai2 : String){
        if (nilai1.isNotEmpty()&&nilai2.isNotEmpty()){
            //convert string menuju double
            var x = nilai1.toDouble()
            var y = nilai2.toDouble()
            //calcut
            var hasil = x*y
            presenterView?.persegi(hasil.toString())

        } else{
            //deklarasi variabel dialog
            /* var alert = AlertDialog.Builder(this)
             alert.setTitle("Warning !!")
             alert.setMessage("tidak bisa kosng edittext")
             alert.setIcon(R.mipmap.ic_launcher)

             alert.setPositiveButton("ok", DialogInterface.OnClickListener { dialogInterface, i ->
                 dialogInterface.dismiss()
             })
             alert.show()*/
        }

    }
    fun Hitung3(nilai1 : String, nilai2 : String){
        if (nilai1.isNotEmpty()&&nilai2.isNotEmpty()){
            //convert string menuju double
            var x = nilai1.toDouble()
            var y = nilai2.toDouble()
            //calcut
            var hasil = (x*y)*1/2
            presenterView?.persegipanjang(hasil.toString())

        } else{
            //deklarasi variabel dialog
            /* var alert = AlertDialog.Builder(this)
             alert.setTitle("Warning !!")
             alert.setMessage("tidak bisa kosng edittext")
             alert.setIcon(R.mipmap.ic_launcher)

             alert.setPositiveButton("ok", DialogInterface.OnClickListener { dialogInterface, i ->
                 dialogInterface.dismiss()
             })
             alert.show()*/
        }

    }

}