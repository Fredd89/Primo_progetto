package itts.quintodinf.primoprogetto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    EditText editTxt, editTxt2;
    Button resButton, testButton, playBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTxt = findViewById(R.id.editTxt);
        resButton = findViewById(R.id.resBtn);
        editTxt2 = findViewById(R.id.editTxt2);
        testButton = findViewById(R.id.testBtn);
        playBtn = findViewById(R.id.playBtn);
    }

    public void resBtn(View v) {
        editTxt.getText().clear();
    }

    public void testBtn(View v) {
        editTxt2.setText(editTxt.getText());
    }

    public void playBtn(View v) {
        String str = editTxt.getText().toString();
        Intent i = new Intent(this, SecondActivity.class);
        i.putExtra("stringa", str);
        startActivity(i);
    }

}