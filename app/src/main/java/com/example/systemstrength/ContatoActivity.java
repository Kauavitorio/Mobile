package com.example.systemstrength;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class ContatoActivity extends AppCompatActivity {
    LinearLayout headercontato, linearvoltaraoprincipal, lineartelefone, linearemail, linearaddress, linearsite;
    ConstraintLayout cardinfotelefones, cardinfoemail, miniinfomaps, menuinosocialmedias;
    LottieAnimationView fecharinfophones, fecharinfoemail, fecharinfomaps, fecharinforedes;
    CardView cardviewbtnverredessociais;
    TextView txtphonesystem, txtphonekaua, txtphonedanilo, txtphonematheus, txtphonpedro, txtemailsystem, txtemailkaua, txtemaildanilo, txtemailmatheus, txtemailpedro, txtendsystem, txtvernomapa, txtinstagramsystem, txtyoutubesystem, txttwittersystem, txtgithubsystem;
    String cpfrecebidodaprincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato);
        headercontato = findViewById(R.id.headercontato);
        linearvoltaraoprincipal = findViewById(R.id.linearvoltaraoprincipal);
        cardinfotelefones = findViewById(R.id.cardinfotelefones);
        cardinfoemail = findViewById(R.id.cardinfoemail);
        miniinfomaps = findViewById(R.id.miniinfomaps);
        lineartelefone = findViewById(R.id.lineartelefone);
        linearemail = findViewById(R.id.linearemail);
        linearaddress = findViewById(R.id.linearaddress);
        linearsite = findViewById(R.id.linearsite);
        fecharinfophones = findViewById(R.id.fecharinfophones);
        fecharinfoemail = findViewById(R.id.fecharinfoemail);
        fecharinfomaps = findViewById(R.id.fecharinfomaps);
        txtphonesystem = findViewById(R.id.txtphonesystem);
        txtphonekaua = findViewById(R.id.txtphonekaua);
        txtphonedanilo = findViewById(R.id.txtphonedanilo);
        txtphonematheus = findViewById(R.id.txtphonematheus);
        txtphonpedro = findViewById(R.id.txtphonpedro);
        txtemailsystem = findViewById(R.id.txtemailsystem);
        txtemailkaua = findViewById(R.id.txtemailkaua);
        txtemaildanilo = findViewById(R.id.txtemaildanilo);
        txtemailmatheus = findViewById(R.id.txtemailmatheus);
        txtemailpedro = findViewById(R.id.txtemailpedro);
        txtvernomapa = findViewById(R.id.txtvernomapa);
        txtendsystem = findViewById(R.id.txtendsystem);
        cardviewbtnverredessociais = findViewById(R.id.cardviewbtnverredessociais);
        fecharinforedes = findViewById(R.id.fecharinforedes);
        menuinosocialmedias = findViewById(R.id.menuinosocialmedias);
        txtinstagramsystem = findViewById(R.id.txtinstagramsystem);
        txtyoutubesystem = findViewById(R.id.txtyoutubesystem);
        txttwittersystem = findViewById(R.id.txttwittersystem);
        txtgithubsystem = findViewById(R.id.txtgithubsystem);

        //  Get some information
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        cpfrecebidodaprincipal = bundle.getString("cpfusu");

        //  When click here will show some msg em try to go website
        linearsite.setOnClickListener(v -> Toast.makeText(this, "Site em manutenção!!", Toast.LENGTH_SHORT).show());

        //  When click here will open info menu phones
        lineartelefone.setOnClickListener(v -> {
            if (cardinfotelefones.getVisibility() == View.VISIBLE){
                headercontato.setVisibility(View.VISIBLE);
                cardinfotelefones.setVisibility(View.GONE);
                cardinfoemail.setVisibility(View.GONE);
            }else {
                headercontato.setVisibility(View.GONE);
                cardinfotelefones.setVisibility(View.VISIBLE);
            }
        });

        //  When click here will call for System Strength
        txtphonesystem.setOnClickListener(v -> {
            Uri number = Uri.parse("tel:380394002");
            Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
            startActivity(callIntent);
        });

        //  When click here will call for Kauã
        txtphonekaua.setOnClickListener(v -> {
            Uri number = Uri.parse("tel:998022004");
            Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
            startActivity(callIntent);
        });

        //  When click here will call for Danilo
        txtphonematheus.setOnClickListener(v -> {
            Uri number = Uri.parse("tel:980495190");
            Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
            startActivity(callIntent);
        });

        //  When click here will call for Matheus
        txtphonedanilo.setOnClickListener(v -> {
            Uri number = Uri.parse("tel:991946874");
            Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
            startActivity(callIntent);
        });

        //  When click here will call for Pedro
        txtphonedanilo.setOnClickListener(v -> {
            Uri number = Uri.parse("tel:974031595");
            Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
            startActivity(callIntent);
        });

        //  When click here will close info menu phones
        fecharinfophones.setOnClickListener(v -> {
            headercontato.setVisibility(View.VISIBLE);
            cardinfotelefones.setVisibility(View.GONE);
        });

        //  When click here will open info menu email
        linearemail.setOnClickListener(v -> {
            if (cardinfoemail.getVisibility() == View.VISIBLE){
                headercontato.setVisibility(View.VISIBLE);
                cardinfotelefones.setVisibility(View.GONE);
                cardinfoemail.setVisibility(View.GONE);
            }else {
                headercontato.setVisibility(View.GONE);
                cardinfotelefones.setVisibility(View.GONE);
                cardinfoemail.setVisibility(View.VISIBLE);
            }
        });

        //  When click here will close info menu email
        fecharinfoemail.setOnClickListener(v -> {
            headercontato.setVisibility(View.VISIBLE);
            cardinfoemail.setVisibility(View.GONE);
        });

        //  When click here will open info menu address
        linearaddress.setOnClickListener(v -> {
            if (miniinfomaps.getVisibility() == View.VISIBLE){
                headercontato.setVisibility(View.VISIBLE);
                miniinfomaps.setVisibility(View.GONE);
            }else {
                headercontato.setVisibility(View.GONE);
                miniinfomaps.setVisibility(View.VISIBLE);
            }
        });

        //  When click here will go to address in another app
        txtendsystem.setOnClickListener(v -> {
            Uri location = Uri.parse("geo:-23.520481,-46.727863?z=18");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
            startActivity(mapIntent);
        });

        //  When click here will go to intent map
        txtvernomapa.setOnClickListener(v -> {
            Intent irparamapa = new Intent(ContatoActivity.this,MapsActivity.class);
            startActivity(irparamapa);
            headercontato.setVisibility(View.VISIBLE);
            miniinfomaps.setVisibility(View.GONE);
        });

        //  When click here will close info menu address
        fecharinfomaps.setOnClickListener(v -> {
            headercontato.setVisibility(View.VISIBLE);
            miniinfomaps.setVisibility(View.GONE);
        });

        //  When click here will open info menu Social Medias
        cardviewbtnverredessociais.setOnClickListener( v -> {
            if (menuinosocialmedias.getVisibility() == View.VISIBLE){
                headercontato.setVisibility(View.VISIBLE);
                menuinosocialmedias.setVisibility(View.GONE);
            }else {
                headercontato.setVisibility(View.GONE);
                menuinosocialmedias.setVisibility(View.VISIBLE);
            }
        });

        //  When click here will close info menu Social Medias
        fecharinforedes.setOnClickListener( v -> {
            headercontato.setVisibility(View.VISIBLE);
            menuinosocialmedias.setVisibility(View.GONE);
        });

        //  When click will go to instagram of system
        txtinstagramsystem.setOnClickListener(v -> {
            Uri insta = Uri.parse("https://www.instagram.com/systemstrength/");
            Intent instaintent = new Intent(Intent.ACTION_VIEW, insta);
            startActivity(instaintent);
        });

        //  When click will go to youtube of system
        txtyoutubesystem.setOnClickListener(v -> {
            Uri youtube = Uri.parse("https://www.youtube.com/channel/UCYv-v9TxSzuYA9C3Ca4GYeA");
            Intent youtubeintent = new Intent(Intent.ACTION_VIEW, youtube);
            startActivity(youtubeintent);
        });

        //  When click will go to Twitter of system
        txtyoutubesystem.setOnClickListener(v -> {
            Uri twitter = Uri.parse("https://twitter.com/SystemStrength1");
            Intent twitterintent = new Intent(Intent.ACTION_VIEW, twitter);
            startActivity(twitterintent);
        });

        //  When click will go to GitBub of system
        txtgithubsystem.setOnClickListener(v -> {
            Uri twitter = Uri.parse("https://github.com/System-Strength");
            Intent twitterintent = new Intent(Intent.ACTION_VIEW, twitter);
            startActivity(twitterintent);
        });

        //  When click here will go back to Principal Activity
        linearvoltaraoprincipal.setOnClickListener(v -> {
            Intent voltaraoprincipal = new Intent(ContatoActivity.this,PrincipalActivity.class);
            voltaraoprincipal.putExtra("cpfusu", cpfrecebidodaprincipal);
            startActivity(voltaraoprincipal);
            finish();
        });
    }

    @Override
    public void onBackPressed() {
        if (cardinfotelefones.getVisibility() == View.VISIBLE || cardinfoemail.getVisibility() == View.VISIBLE || miniinfomaps.getVisibility() == View.VISIBLE || menuinosocialmedias.getVisibility() == View.VISIBLE){
            headercontato.setVisibility(View.VISIBLE);
            cardinfotelefones.setVisibility(View.GONE);
            cardinfoemail.setVisibility(View.GONE);
            miniinfomaps.setVisibility(View.GONE);
            menuinosocialmedias.setVisibility(View.GONE);
        }else {
            Intent voltaraoprincipal = new Intent(ContatoActivity.this,PrincipalActivity.class);
            voltaraoprincipal.putExtra("cpfusu", cpfrecebidodaprincipal);
            startActivity(voltaraoprincipal);
            finish();
        }
    }
}