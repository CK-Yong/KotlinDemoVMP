package nl.ckyong.kotlinandroidtest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by ckyoung on 13-Jul-17.
 */
public class HelloNameActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helloname);
        String name = getIntent().getExtras().get("nameText").toString();
        TextView nameText = (TextView) findViewById(R.id.nameDisplay);
        nameText.setText("Hello " + name + "!");
    }
}
