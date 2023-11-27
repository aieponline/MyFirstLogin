package com.github.aieponline.myfirstlogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Obtengo los elementos desde la vista.
        var username = findViewById<EditText>(R.id.userNameView)
        var password = findViewById<EditText>(R.id.passwordView)
        var btnlogin = findViewById<Button>(R.id.btnLoginView)
        var lblmessage = findViewById<TextView>(R.id.lblMessageView)

        // Asigno la acción que realizará el botón cuando se haga click.
        btnlogin.setOnClickListener(View.OnClickListener {
            lblmessage.text = login(username.text.toString(), password.text.toString()).toString() //Pongo en la etiqueta el resultado
        })

    }
    fun login(username : String, password : String) :  String{ // Declaro una función que valida user y password
        Log.d("Username", "login: $username")

        Log.d("Username", "pass: $password")
        if(username=="admin" && password=="qwerty") //No pongo llaves, puesto que será única instrucción
            return "Welcome $username" //Retorno con template
        return "Username/Password Error"
    }
}