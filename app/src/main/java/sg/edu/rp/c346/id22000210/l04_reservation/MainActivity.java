package sg.edu.rp.c346.id22000210.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    //Declaring the Field Variables
    TextView tvDisplay;
    EditText nameEdit;
    EditText phoneEdit;
    EditText paxEdit;
    RadioGroup smoking;
    DatePicker dp;
    TimePicker tp;
    Button confirm;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Linking the variables to their respective UI elements
        tvDisplay = findViewById(R.id.information);
        nameEdit = findViewById(R.id.editName);
        phoneEdit = findViewById(R.id.editPhoneNumber);
        paxEdit = findViewById(R.id.editPax);
        smoking = findViewById(R.id.rgSmoke);
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        confirm = findViewById(R.id.confirm_button);
        reset = findViewById(R.id.reset_button);



    }
}