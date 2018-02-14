package irfan.remedi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Player2 extends AppCompatActivity {

    TextView tampung, tampung1, point1, point2;
    Button tambah1, kurang1, reset1, tambah2, kurang2, reset2;
    int o = 0;
    int z = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tampung = (TextView) findViewById(R.id.tampung);
        tampung1 = (TextView) findViewById(R.id.tampung1);
        point1 = (TextView) findViewById(R.id.point1);
        point2 = (TextView) findViewById(R.id.point2);
        tambah1 = (Button) findViewById(R.id.tambah1);
        kurang1 = (Button) findViewById(R.id.kurang1);
        reset1 = (Button) findViewById(R.id.reset1);
        tambah2 = (Button) findViewById(R.id.tambah2);
        kurang2 = (Button) findViewById(R.id.kurang2);
        reset2 = (Button) findViewById(R.id.reset2);

        String shrd1 = getIntent().getExtras().getString("tampung");
        String shrd2 = getIntent().getStringExtra("tampung1");

        tampung.setText(shrd1);
        tampung1.setText(shrd2);

        tambah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                o = o + 1;
                point1.setText("" + o);

            }
        });

        kurang1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                o = o - 1;
                if (o<1){
                    o=0;
                    Toast.makeText(getApplicationContext(), "sudah nilai minimum", Toast.LENGTH_LONG).show();
                }
                point1.setText("" + o);
            }
        });

        reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                o = 0;
                point1.setText("" + o);
            }
        });

        tambah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                z = z + 1;
                point2.setText("" + z);
            }
        });

        kurang2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                z = z - 1;
                if (z<1){
                    z=0;
                    Toast.makeText(getApplicationContext(), "SUDAH SAMPAI MINIMUM", Toast.LENGTH_LONG).show();
                }
                point2.setText("" + z);
            }
        });

        reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                z = 0;
                point2.setText("" + z);
            }
        });
    }
}
