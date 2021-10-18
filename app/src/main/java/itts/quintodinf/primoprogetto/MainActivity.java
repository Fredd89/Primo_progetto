package itts.quintodinf.primoprogetto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    EditText editTxt, editTxt2;
    Button resButton, testButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTxt = findViewById(R.id.editTxt);
        resButton = findViewById(R.id.resButton);
        editTxt2 = findViewById(R.id.editTxt2);
        testButton = findViewById(R.id.testButton);

        resButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTxt.getText().clear();
            }
        });

        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View c) {
                editTxt2.setText(editTxt.getText());
            }
        });

    }
}