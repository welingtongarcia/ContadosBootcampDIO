package com.example.contadosbootcampdio

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import java.util.jar.Manifest

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val REQUEST_CONTACT = 1// necessario por causa do IF

        // pedir permissão do usuario para acesar o contatos
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.READ_CONTACTS)!=PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.READ_CONTACTS),REQUEST_CONTACT)
        }else{
            setContacts()



        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        if(requestCode==REQUEST_CONTACT)setContacts()
    }

    private fun setContacts() {
        TODO("Not yet implemented")
    }
}