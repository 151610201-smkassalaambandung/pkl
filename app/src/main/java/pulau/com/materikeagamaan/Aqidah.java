package pulau.com.materikeagamaan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Aqidah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aqidah);

        Button a = (Button) findViewById(R.id.button1);
        a.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View aa) {
                Intent myIntent = new Intent(aa.getContext(),Aqidah1.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button b = (Button) findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View bb) {
                Intent myIntent = new Intent(bb.getContext(),Aqidah2.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button c = (Button) findViewById(R.id.button3);
        c.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View cc) {
                Intent myIntent = new Intent(cc.getContext(),Aqidah3.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button d = (Button) findViewById(R.id.button4);
        d.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View dd) {
                Intent myIntent = new Intent(dd.getContext(),Aqidah4.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button e = (Button) findViewById(R.id.button5);
        e.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View ee) {
                Intent myIntent = new Intent(ee.getContext(),Aqidah5.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button f = (Button) findViewById(R.id.button6);
        f.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View ff) {
                Intent myIntent = new Intent(ff.getContext(),Aqidah6.class);
                startActivityForResult(myIntent,0);
            }
        });
    }
    public void onBackPressed(){
        Intent i = new Intent(Aqidah.this, Main2Activity.class);
        startActivity(i);
    }
}
