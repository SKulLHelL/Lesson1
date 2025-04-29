package ru.mirea.golubenkovs.buttonclicker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView textViewStudent;
    private Button btnWhoAmI;
    private Button btnItIsNotMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewStudent = findViewById(R.id.textViewStudent);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        btnItIsNotMe = findViewById(R.id.btnItIsNotMe);

        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStudent.setText("Мой номер по списку № 9");
            }
        };

        View.OnClickListener oclBtnItIsNotMe = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStudent.setText("Это не я сделал");
            }
        };

        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);
        btnItIsNotMe.setOnClickListener(oclBtnItIsNotMe);
    }
}