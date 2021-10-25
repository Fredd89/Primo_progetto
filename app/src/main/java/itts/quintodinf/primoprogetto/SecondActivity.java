package itts.quintodinf.primoprogetto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;

public class SecondActivity extends AppCompatActivity {

    EditText editTxt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editTxt3 = findViewById(R.id.editTxt3);

        Intent i = getIntent();
        String str = i.getStringExtra("stringa");

        editTxt3.setText(str);
    }
}