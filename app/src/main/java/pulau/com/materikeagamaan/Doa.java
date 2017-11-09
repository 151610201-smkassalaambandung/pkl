package pulau.com.materikeagamaan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Doa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa);

        Button a = (Button) findViewById(R.id.button1);
        a.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View aa) {
                Intent myIntent = new Intent(aa.getContext(),doa1.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button f = (Button) findViewById(R.id.button6);
        f.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View ff) {
                Intent myIntent = new Intent(ff.getContext(),doa6.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button h = (Button) findViewById(R.id.button8);
        h.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View ff) {
                Intent myIntent = new Intent(ff.getContext(),doa8.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button j = (Button) findViewById(R.id.button10);
        j.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View ii) {
                Intent myIntent = new Intent(ii.getContext(),doa10.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button l = (Button) findViewById(R.id.button12);
        l.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View ii) {
                Intent myIntent = new Intent(ii.getContext(),doa12.class);
                startActivityForResult(myIntent,0);
            }
        });
        Button m = (Button) findViewById(R.id.button13);
        m.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View ii) {
                Intent myIntent = new Intent(ii.getContext(),doa13.class);
                startActivityForResult(myIntent,0);
            }
        });
        Button o = (Button) findViewById(R.id.button15);
        o.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View ii) {
                Intent myIntent = new Intent(ii.getContext(),doa15.class);
                startActivityForResult(myIntent,0);
            }
        });
        Button p = (Button) findViewById(R.id.button16);
        p.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View ii) {
                Intent myIntent = new Intent(ii.getContext(),doa16.class);
                startActivityForResult(myIntent,0);
            }
        });
    }

    public void onBackPressed(){
        Intent i = new Intent(Doa.this, Main2Activity.class);
        startActivity(i);
    }
}
