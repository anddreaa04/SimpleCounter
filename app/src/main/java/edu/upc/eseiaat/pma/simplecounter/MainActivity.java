package edu.upc.eseiaat.pma.simplecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView counter_text;


    private int number;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter_text=(TextView) findViewById(R.id.counter);
        number=0;
    }

public void plus (View v){
    Button btn_plus = (Button) v;
        number++;
    counter_text.setText(Integer.toString(number));

}

    public void minus (View v){
        Button btn_minus = (Button) v;
        number--;
        counter_text.setText(Integer.toString(number));

    }
}
