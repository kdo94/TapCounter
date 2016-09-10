package edu.orangecoastcollege.cs273.kdo94.tapcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button tapButton;
    private TextView countTextView;

    Counter currentCount = new Counter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tapButton = (Button) findViewById(R.id.tapButton);
        countTextView = (TextView) findViewById(R.id.countTextView);

        countTextView.setText(String.valueOf(currentCount.getCount()));

        tapButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                currentCount.addCount();
                countTextView.setText(String.valueOf(currentCount.getCount()));
            }
        });

    }
}
