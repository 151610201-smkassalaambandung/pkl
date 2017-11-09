package pulau.com.materikeagamaan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Sholat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sholat);

        Button a = (Button) findViewById(R.id.button1);
        a.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View aa) {
                Intent myIntent = new Intent(aa.getContext(),niat.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button f = (Button) findViewById(R.id.button6);
        f.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View ff) {
                Intent myIntent = new Intent(ff.getContext(),iftitah.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button h = (Button) findViewById(R.id.button8);
        h.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View ff) {
                Intent myIntent = new Intent(ff.getContext(),rukuk.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button j = (Button) findViewById(R.id.button10);
        j.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View ii) {
                Intent myIntent = new Intent(ii.getContext(),ihtidal.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button l = (Button) findViewById(R.id.button12);
        l.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View ii) {
                Intent myIntent = new Intent(ii.getContext(),sujud.class);
                startActivityForResult(myIntent,0);
            }
        });
        Button m = (Button) findViewById(R.id.button13);
        m.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View ii) {
                Intent myIntent = new Intent(ii.getContext(),duduk.class);
                startActivityForResult(myIntent,0);
            }
        });
        Button o = (Button) findViewById(R.id.button15);
        o.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View ii) {
                Intent myIntent = new Intent(ii.getContext(),tahyad1.class);
                startActivityForResult(myIntent,0);
            }
        });
        Button p = (Button) findViewById(R.id.button16);
        p.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View ii) {
                Intent myIntent = new Intent(ii.getContext(),tahyad2.class);
                startActivityForResult(myIntent,0);
            }
        });
        Button q = (Button) findViewById(R.id.button17);
        q.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View ii) {
                Intent myIntent = new Intent(ii.getContext(), salam.class);
                startActivityForResult(myIntent, 0);
            }

        });
    }

    public void onBackPressed(){
        Intent i = new Intent(Sholat.this, Ibadah.class);
        startActivity(i);
    }


}