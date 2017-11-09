package pulau.com.materikeagamaan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Wudhu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wudhu);

        Button a = (Button) findViewById(R.id.button1);
        a.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View aa) {
                Intent myIntent = new Intent(aa.getContext(),Wudhu1.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button b = (Button) findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View bb) {
                Intent myIntent = new Intent(bb.getContext(),Wudhu2.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button c = (Button) findViewById(R.id.button3);
        c.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View cc) {
                Intent myIntent = new Intent(cc.getContext(),Wudhu3.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button d = (Button) findViewById(R.id.button4);
        d.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View dd) {
                Intent myIntent = new Intent(dd.getContext(),Wudhu4.class);
                startActivityForResult(myIntent,0);
            }
        });
    }

    public void onBackPressed(){
        Intent i = new Intent(Wudhu.this, Ibadah.class);
        startActivity(i);
    }
}
