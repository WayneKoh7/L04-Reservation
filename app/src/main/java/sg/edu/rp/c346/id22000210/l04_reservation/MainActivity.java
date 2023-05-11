package sg.edu.rp.c346.id22000210.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;
import android.view.View;

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


        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action (Gets the text from EditText)
                String stringResponse = nameEdit.getText().toString();
                // Gets the ID of the checked RadioButton
                int checkedRadioId = smoking.getCheckedRadioButtonId();
                //Declare a variable 'say' to hold the string
                String smokeOutput;
                if(checkedRadioId == R.id.smoking){
                    smokeOutput = "Area: Smoking";

                }
                else{
                    smokeOutput = "Area: Non-Smoking";

                }

                tvDisplay.setText(displayText);
            }
        });



    }
}