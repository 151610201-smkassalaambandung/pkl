package pulau.com.materikeagamaan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Tarikh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarikh);

        Button a = (Button) findViewById(R.id.button1);
        a.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View aa) {
                Intent myIntent = new Intent(aa.getContext(),Tarikh1.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button b = (Button) findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View bb) {
                Intent myIntent = new Intent(bb.getContext(),Tarikh2.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button c = (Button) findViewById(R.id.button3);
        c.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View cc) {
                Intent myIntent = new Intent(cc.getContext(),Tarikh3.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button d = (Button) findViewById(R.id.button4);
        d.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View dd) {
                Intent myIntent = new Intent(dd.getContext(),Tarikh4.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button e = (Button) findViewById(R.id.button5);
        e.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View ee) {
                Intent myIntent = new Intent(ee.getContext(),Tarikh5.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button f = (Button) findViewById(R.id.button6);
        f.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View ff) {
                Intent myIntent = new Intent(ff.getContext(),Tarikh6.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button g = (Button) findViewById(R.id.button7);
        g.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View gg) {
                Intent myIntent = new Intent(gg.getContext(),Tarikh7.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button h = (Button) findViewById(R.id.button8);
        h.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View hh) {
                Intent myIntent = new Intent(hh.getContext(),Tarikh8.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button i = (Button) findViewById(R.id.button9);
        i.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View ii) {
                Intent myIntent = new Intent(ii.getContext(),Tarikh9.class);
                startActivityForResult(myIntent,0);
            }
        });
    }
}
