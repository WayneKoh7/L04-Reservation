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
import android.widget.Toast;

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


        //setting default date and time
        dp.updateDate(2020,5,1); //Month starts from '0'
        tp.setHour(19);
        tp.setMinute(30);


        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Getting the input values
                String name = nameEdit.getText().toString();
                String phone = phoneEdit.getText().toString();
                String pax = paxEdit.getText().toString();
                int smokingArea = smoking.getCheckedRadioButtonId();
                int day = dp.getDayOfMonth();
                int month = dp.getMonth();
                int year = dp.getYear();
                int hour = tp.getHour();
                int minute = tp.getMinute();


                //Creating Reservation Information, 'reservationInfo' holds the strings
                String reservationInfo = "Name: " + name + "\nPhone: " + phone + "\nPax: " + pax +
                        "\nSmoking Area: " + smokingArea +
                        "\nDate of Reservation: " + day + "/" + month + "/" + year +
                        "\n Time of Reservation: " + hour + ":" + minute;

                //Displaying the reservation information
                tvDisplay.setText(reservationInfo);

                //Creating a Toast message to inform users about the reservation confirmation
                Toast.makeText(MainActivity.this, "Reservation Confirmed!", Toast.LENGTH_LONG).show();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Actions to reset input fields and selections
                nameEdit.setText("");
                phoneEdit.setText("");
                paxEdit.setText("");
                smoking.check(R.id.smoking);
                dp.updateDate(2020, 5, 1);
                tp.setHour(19);
                tp.setMinute(30);

                //To clear the TextView information display
                tvDisplay.setText("");
            }
        });

    }
}