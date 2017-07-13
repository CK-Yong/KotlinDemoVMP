package nl.ckyong.kotlinandroidtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText inputText = (EditText) findViewById(R.id.inputText);
        Button submitButton = (Button) findViewById(R.id.submitButton);
        final TextView errorText = (TextView) findViewById(R.id.errorText);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = inputText.getText().toString();
                if (input.equalsIgnoreCase("Kotlin")) {
                    Intent kotlinIntent = new Intent(getApplicationContext(), KotlinActivity.class);
                    startActivity(kotlinIntent);
                } else if (!input.isEmpty()) {
                    Intent helloIntent = new Intent(getApplicationContext(), HelloNameActivity.class);
                    helloIntent.putExtra("nameText", input);
                    startActivity(helloIntent);
                } else {
                    errorText.setText(R.string.text_is_empty);
                }
            }
        });
    }
}
