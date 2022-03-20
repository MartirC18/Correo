package com.example.correo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public Button enviar;
    EditText para;
    EditText subject;
    EditText mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enviar=findViewById(R.id.btnenviar);
        para=findViewById(R.id.edtpara);
        subject=findViewById(R.id.edtsubject);
        mensaje=findViewById(R.id.edtmensaje);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent emailIntent = new Intent(Intent.ACTION_SENDTO,
                        Uri.parse(enviar.toString()));//tu email!
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject.toString());
                emailIntent.putExtra(Intent.EXTRA_TEXT, mensaje.toString());
                startActivity(Intent.createChooser(emailIntent, "Seleccione una aplicación"));

            }
        });








    }






}