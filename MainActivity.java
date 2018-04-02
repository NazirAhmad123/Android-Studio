package com.example.nazirsz.cases;

        import android.content.Intent;
        import android.media.Image;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.Spinner;
        import android.widget.Toast;

        import java.util.ArrayList;
        import java.util.List;

public class MainActivity extends AppCompatActivity {

    Spinner occasionSpinner, relationshipSpinner, genderSpinner, age_rangeSpinner, price_rangeSpinner;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = (Button) findViewById(R.id.submitButton);


//        Step 1: Create the data source
//        Step 2: Define the appearance layout file through which the adapter will put data inside the spinner.
//                Step 3: Define what to do when the user clicks on the spinner using the onItemSelectedListener.

//        Initialize our spinner references
        occasionSpinner = (Spinner) findViewById(R.id.occasionSpinner);
//        Create an adapter the will manage the data,
//        .createFromResource because it allows me to create the adapter from the resource.
        ArrayAdapter occasionAdapter = ArrayAdapter.createFromResource(this, R.array.occasion, android.R.layout.simple_spinner_dropdown_item);
//        Now I need to set the adapter to the spinner
        occasionSpinner.setAdapter(occasionAdapter);
//        Lastly, the spinner needs to know who is responsible for handling events
//        (this), means this activity is responsible for handling the event.
        //occasionSpinner.setOnItemClickListener(this);

//      Initialize and create the adapter for relationshipSpinner.
        relationshipSpinner = (Spinner) findViewById(R.id.relationshipSpinner);
        ArrayAdapter relationshipAdapter = ArrayAdapter.createFromResource(this, R.array.relationship, android.R.layout.simple_spinner_dropdown_item);
        relationshipSpinner.setAdapter(relationshipAdapter);
        //relationshipSpinner.setOnItemClickListener(this);

//      Initialize and create the adapter for genderSpinner.
        genderSpinner = (Spinner) findViewById(R.id.genderSpinner);
        ArrayAdapter genderAdapter = ArrayAdapter.createFromResource(this, R.array.gender, android.R.layout.simple_spinner_dropdown_item);
        genderSpinner.setAdapter(genderAdapter);
        //genderSpinner.setOnItemClickListener(this);

        //      Initialize and create the adapter for genderSpinner.
        age_rangeSpinner = (Spinner) findViewById(R.id.age_rangeSpinner);
        ArrayAdapter age_rangeAdapter = ArrayAdapter.createFromResource(this, R.array.age_range, android.R.layout.simple_spinner_dropdown_item);
        age_rangeSpinner.setAdapter(age_rangeAdapter);
        //age_rangeSpinner.setOnItemClickListener(this);

//      Initialize and create the adapter for genderSpinner.
        price_rangeSpinner = (Spinner) findViewById(R.id.price_rangeSpinner);
        ArrayAdapter price_rangeAdapter = ArrayAdapter.createFromResource(this, R.array.price_range, android.R.layout.simple_spinner_dropdown_item);
        price_rangeSpinner.setAdapter(price_rangeAdapter);
        //price_rangeSpinner.setOnItemClickListener(this);


    }
    public void submit(View view) {
        String OccVal = occasionSpinner.getSelectedItem().toString();
        String relVal = relationshipSpinner.getSelectedItem().toString();
        String GenVal = genderSpinner.getSelectedItem().toString();
        String AgeVal = age_rangeSpinner.getSelectedItem().toString();
        String PrVal = price_rangeSpinner.getSelectedItem().toString();


//      If wrong info is entered for the new born option.
        if ((OccVal.equalsIgnoreCase("New born") && ((relVal.equalsIgnoreCase("Son")
                || relVal.equalsIgnoreCase("Daughter") || relVal.equalsIgnoreCase("Sister")
                || relVal.equalsIgnoreCase("Brother") || relVal.equalsIgnoreCase("Father")
                || relVal.equalsIgnoreCase("Mother") || relVal.equalsIgnoreCase("Wife/Love"))
                && ((GenVal.equalsIgnoreCase("Female") || GenVal.equalsIgnoreCase("Male"))
                && ((AgeVal.equalsIgnoreCase("10-20") || AgeVal.equalsIgnoreCase("20-30")
                || AgeVal.equalsIgnoreCase("30-50") || AgeVal.equalsIgnoreCase("50-80")
                || AgeVal.equalsIgnoreCase("80-100")) && (PrVal.equalsIgnoreCase("50-100")
                || (PrVal.equalsIgnoreCase("100-300") || (PrVal.equalsIgnoreCase("300-500")
                || (PrVal.equalsIgnoreCase("500-1000")))))))))) {
            Toast.makeText(this, "Wrong information for new born.\nTry again!", Toast.LENGTH_LONG).show();

            //Case 1
        }
        else if (OccVal.equalsIgnoreCase("New born") && (relVal.equalsIgnoreCase("Son")
                || relVal.equalsIgnoreCase("Daughter") || relVal.equalsIgnoreCase("Sister")
                || relVal.equalsIgnoreCase("Brother")) &&
                (GenVal.equalsIgnoreCase("Female") || GenVal.equalsIgnoreCase("Male"))
                        && AgeVal.equalsIgnoreCase("1-10") && PrVal.equalsIgnoreCase("50-100")) {

            Toast.makeText(this, "Info for New born. Price: 50-100", Toast.LENGTH_LONG).show();

            //Case 2
        } else if (OccVal.equalsIgnoreCase("New born") && (relVal.equalsIgnoreCase("Son")
                || relVal.equalsIgnoreCase("Daughter") || relVal.equalsIgnoreCase("Sister")
                || relVal.equalsIgnoreCase("Brother")) &&
                (GenVal.equalsIgnoreCase("Female") || GenVal.equalsIgnoreCase("Male"))
                && AgeVal.equalsIgnoreCase("1-10") && PrVal.equalsIgnoreCase("100-300")) {

            Toast.makeText(this, "Info for New born. Price: 100-300", Toast.LENGTH_LONG).show();

            //Case 2
        }else if (OccVal.equalsIgnoreCase("New born") && (relVal.equalsIgnoreCase("Son")
                || relVal.equalsIgnoreCase("Daughter") || relVal.equalsIgnoreCase("Sister")
                || relVal.equalsIgnoreCase("Brother")) &&
                (GenVal.equalsIgnoreCase("Female") || GenVal.equalsIgnoreCase("Male"))
                && AgeVal.equalsIgnoreCase("1-10") && PrVal.equalsIgnoreCase("300-500")) {

            Toast.makeText(this, "Info for New born. Price: 300-500", Toast.LENGTH_LONG).show();

            //Case 2
        } else if (OccVal.equalsIgnoreCase("New born") && (relVal.equalsIgnoreCase("Son")
                || relVal.equalsIgnoreCase("Daughter") || relVal.equalsIgnoreCase("Sister")
                || relVal.equalsIgnoreCase("Brother")) &&
                (GenVal.equalsIgnoreCase("Female") || GenVal.equalsIgnoreCase("Male"))
                && AgeVal.equalsIgnoreCase("1-10") && PrVal.equalsIgnoreCase("500-1000+")) {

            Toast.makeText(this, "Info for New born. Price: 500-1000+", Toast.LENGTH_LONG).show();

            //Case 2
        }


        //      If wrong info is entered for the graduation option.
//        else if ((OccVal.equalsIgnoreCase("Graduation") && ((relVal.equalsIgnoreCase("Son")
//                || relVal.equalsIgnoreCase("Daughter") || relVal.equalsIgnoreCase("Sister")
//                || relVal.equalsIgnoreCase("Brother") || relVal.equalsIgnoreCase("Father")
//                || relVal.equalsIgnoreCase("Mother") || relVal.equalsIgnoreCase("Wife/Love"))
//                && ((GenVal.equalsIgnoreCase("Female") || GenVal.equalsIgnoreCase("Male"))
//                && AgeVal.equalsIgnoreCase("1-10") && (PrVal.equalsIgnoreCase("50-100")
//                || (PrVal.equalsIgnoreCase("100-300") || (PrVal.equalsIgnoreCase("300-500")
//                || (PrVal.equalsIgnoreCase("500-1000"))))))))) {
//            Toast.makeText(this, "Wrong age range for graduation", Toast.LENGTH_LONG).show();
//        }

//        50-100
        else if (OccVal.equalsIgnoreCase("Graduation") && (relVal.equalsIgnoreCase("Son")
                || relVal.equalsIgnoreCase("Daughter") || relVal.equalsIgnoreCase("Sister")
                || relVal.equalsIgnoreCase("Brother") || relVal.equalsIgnoreCase("Father")
                || relVal.equalsIgnoreCase("Mother") || relVal.equalsIgnoreCase("Friend")
                || relVal.equalsIgnoreCase("Wife/Love")) &&
                (GenVal.equalsIgnoreCase("Female") || GenVal.equalsIgnoreCase("Male"))
                && (AgeVal.equalsIgnoreCase("20-30") || AgeVal.equalsIgnoreCase("30-50"))
                && PrVal.equalsIgnoreCase("50-100")) {

            Toast.makeText(this, "Info for graduation. Price: 50-100. Age: 20-30/30-50", Toast.LENGTH_LONG).show();

        }
//      100-300
        else if (OccVal.equalsIgnoreCase("Graduation") && (relVal.equalsIgnoreCase("Son")
                || relVal.equalsIgnoreCase("Daughter") || relVal.equalsIgnoreCase("Sister")
                || relVal.equalsIgnoreCase("Brother") || relVal.equalsIgnoreCase("Father")
                || relVal.equalsIgnoreCase("Mother") || relVal.equalsIgnoreCase("Friend")
                || relVal.equalsIgnoreCase("Wife/Love")) &&
                (GenVal.equalsIgnoreCase("Female") || GenVal.equalsIgnoreCase("Male"))
                && (AgeVal.equalsIgnoreCase("20-30") || AgeVal.equalsIgnoreCase("30-50"))
                && PrVal.equalsIgnoreCase("100-300")) {

            Toast.makeText(this, "Info for graduation. Price: 100-300. Age: 20-30/30-50", Toast.LENGTH_LONG).show();

        }
//      300-500
        else if (OccVal.equalsIgnoreCase("Graduation") && (relVal.equalsIgnoreCase("Son")
                || relVal.equalsIgnoreCase("Daughter") || relVal.equalsIgnoreCase("Sister")
                || relVal.equalsIgnoreCase("Brother") || relVal.equalsIgnoreCase("Father")
                || relVal.equalsIgnoreCase("Mother") || relVal.equalsIgnoreCase("Friend")
                || relVal.equalsIgnoreCase("Wife/Love")) &&
                (GenVal.equalsIgnoreCase("Female") || GenVal.equalsIgnoreCase("Male"))
                && (AgeVal.equalsIgnoreCase("20-30") || AgeVal.equalsIgnoreCase("30-50"))
                && PrVal.equalsIgnoreCase("300-500")) {

            Toast.makeText(this, "Info for graduation. Price: 300-500. Age: 20-30/30-50", Toast.LENGTH_LONG).show();

        }
//        500-1000+
        else if (OccVal.equalsIgnoreCase("Graduation") && (relVal.equalsIgnoreCase("Son")
                || relVal.equalsIgnoreCase("Daughter") || relVal.equalsIgnoreCase("Sister")
                || relVal.equalsIgnoreCase("Brother") || relVal.equalsIgnoreCase("Father")
                || relVal.equalsIgnoreCase("Mother") || relVal.equalsIgnoreCase("Friend")
                || relVal.equalsIgnoreCase("Wife/Love")) &&
                (GenVal.equalsIgnoreCase("Female") || GenVal.equalsIgnoreCase("Male"))
                && (AgeVal.equalsIgnoreCase("20-30") || AgeVal.equalsIgnoreCase("30-50"))
                && PrVal.equalsIgnoreCase("500-1000+")) {

            Toast.makeText(this, "Info for graduation. Price: 500-100+. Age: 20-30/30-50", Toast.LENGTH_LONG).show();
        }
        else if ((OccVal.equalsIgnoreCase("Eid_Adha") || OccVal.equalsIgnoreCase("Eid_Fitr"))
                && (relVal.equalsIgnoreCase("Son") || relVal.equalsIgnoreCase("Mother")
                || relVal.equalsIgnoreCase("Brother") || relVal.equalsIgnoreCase("Father")
                || relVal.equalsIgnoreCase("Friend") || relVal.equalsIgnoreCase("Wife/Love")) &&
                (GenVal.equalsIgnoreCase("Male") || GenVal.equalsIgnoreCase("FeMale"))
                        && (AgeVal.equalsIgnoreCase("20-30") || AgeVal.equalsIgnoreCase("30-50"))
                        && PrVal.equalsIgnoreCase("50-100")) {

            Toast.makeText(this, "Info for Eid. Price: 50-100/ Age: 20-30/30-50", Toast.LENGTH_LONG).show();
        }
//      100-300
        else if ((OccVal.equalsIgnoreCase("Eid_Adha") || OccVal.equalsIgnoreCase("Eid_Fitr"))
                && (relVal.equalsIgnoreCase("Son") || relVal.equalsIgnoreCase("Mother")
                || relVal.equalsIgnoreCase("Brother") || relVal.equalsIgnoreCase("Father")
                || relVal.equalsIgnoreCase("Friend") || relVal.equalsIgnoreCase("Wife/Love")) &&
                (GenVal.equalsIgnoreCase("Male") || GenVal.equalsIgnoreCase("FeMale"))
                && (AgeVal.equalsIgnoreCase("20-30") || AgeVal.equalsIgnoreCase("30-50"))
                && PrVal.equalsIgnoreCase("100-300")) {

            Toast.makeText(this, "Info for Eid. Price: 100-300/ Age: 20-30/30-50", Toast.LENGTH_LONG).show();
        }
//      300-500
        else if ((OccVal.equalsIgnoreCase("Eid_Adha") || OccVal.equalsIgnoreCase("Eid_Fitr"))
                && (relVal.equalsIgnoreCase("Son") || relVal.equalsIgnoreCase("Mother")
                || relVal.equalsIgnoreCase("Brother") || relVal.equalsIgnoreCase("Father")
                || relVal.equalsIgnoreCase("Friend") || relVal.equalsIgnoreCase("Wife/Love")) &&
                (GenVal.equalsIgnoreCase("Male") || GenVal.equalsIgnoreCase("FeMale"))
                && (AgeVal.equalsIgnoreCase("20-30") || AgeVal.equalsIgnoreCase("30-50"))
                && PrVal.equalsIgnoreCase("300-500")) {

            Toast.makeText(this, "Info for Eid. Price: 300-500/ Age: 20-30/30-50", Toast.LENGTH_LONG).show();
        }

        //    500-1000+
        else if ((OccVal.equalsIgnoreCase("Eid_Adha") || OccVal.equalsIgnoreCase("Eid_Fitr"))
                && (relVal.equalsIgnoreCase("Son") || relVal.equalsIgnoreCase("Mother")
                || relVal.equalsIgnoreCase("Brother") || relVal.equalsIgnoreCase("Father")
                || relVal.equalsIgnoreCase("Friend") || relVal.equalsIgnoreCase("Wife/Love")) &&
                (GenVal.equalsIgnoreCase("Male") || GenVal.equalsIgnoreCase("FeMale"))
                && (AgeVal.equalsIgnoreCase("20-30") || AgeVal.equalsIgnoreCase("30-50"))
                && PrVal.equalsIgnoreCase("500-1000+")) {

            Toast.makeText(this, "Info for Eid. Price: 500-1000+/ Age: 20-30/30-50", Toast.LENGTH_LONG).show();
        }
    }
}
