package pulau.com.materikeagamaan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button a = (Button) findViewById(R.id.button1);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View aa) {
                Intent myIntent = new Intent(aa.getContext(), Thoyyibah.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button b = (Button) findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bb) {
                Intent myIntent = new Intent(bb.getContext(), Ibadah.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button c = (Button) findViewById(R.id.button3);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View cc) {
                Intent myIntent = new Intent(cc.getContext(), Aqidah.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button d = (Button) findViewById(R.id.button4);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View dd) {
                Intent myIntent = new Intent(dd.getContext(), Tarikh.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button e = (Button) findViewById(R.id.button5);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View ee) {
                Intent myIntent = new Intent(ee.getContext(), Akhlaq.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button f = (Button) findViewById(R.id.button6);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View ff) {
                Intent myIntent = new Intent(ff.getContext(), Surat.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button g = (Button) findViewById(R.id.button7);
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View gg) {
                Intent myIntent = new Intent(gg.getContext(), Doa.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button h = (Button) findViewById(R.id.button8);
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View hh) {
                Intent myIntent = new Intent(hh.getContext(), Bthq.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button i = (Button) findViewById(R.id.button9);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View ii) {
                Intent myIntent = new Intent(ii.getContext(), Info.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }

    public void onBackPressed(){
        Intent i = new Intent(Main2Activity.this, MainActivity.class);
        startActivity(i);
    }

}
