package com.example.felipe.exercicio_android;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }
    //transição de paginas

    public void sair (View View){
        System.exit(0);
    }
    public void tela (View View){
        setContentView(R.layout.tela);
    }
    public void tela2 (View View){
        setContentView(R.layout.tela2);
    }

    public void tela3 (View View) {
        setContentView(R.layout.tela3);
    }

    public void tela4 (View View){
        setContentView(R.layout.tela4);
    }
    public void tela5 (View View) {
        setContentView(R.layout.tela5);
    }

    public void tela6 (View View) {
        setContentView(R.layout.tela6);
    }

    //toasts
    public void krakenInfo(View View){
        Toast.makeText(this,"Kraken é o montro do mar parecido com polvo", Toast.LENGTH_LONG).show();
    }
    public void fenhirInfo (View View){
        Toast.makeText(this,"Fenhir é um montro responsável pelo Ragnarok", Toast.LENGTH_LONG).show();
    }
    public void wormInfo (View View){
        Toast.makeText(this,"É um verme que vive no deserto da Mongólia", Toast.LENGTH_LONG).show();
    }
    public void leviInfo (View View){
        Toast.makeText(this,"Leviatã é um demonio do mar da cultura judaico-cristã", Toast.LENGTH_LONG).show();
    }
    public void youtube (View View) {
        String url = "https://www.youtube.com/watch?v=A39j47-dY44&list=PLVLEb7Kt-I5_pGtIWzWXJJk7Ab3lcChi0";
        Intent i = new Intent (Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void html (View View) {
        String url = "http://ahduvido.com.br/50-criaturas-lendarias-animais-da-criptozoologia";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void sair2 (View View) {
    new AlertDialog.Builder(this).setMessage("Deseja mesmo sair?")
            .setPositiveButton("sim", new DialogInterface.OnClickListener(){
                @Override
                public void onClick(DialogInterface dialog, int whith) {
                    Intent intent = new Intent (Intent.ACTION_MAIN);
                    intent.addCategory(Intent.CATEGORY_HOME);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                    finish();
                }
            }) .setNegativeButton("Não",null).show();
    }
}
