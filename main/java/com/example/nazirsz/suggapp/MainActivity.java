package com.example.nazirsz.suggapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;






public class MainActivity extends AppCompatActivity implements OnItemClickListener{

    //    Get a reference to our spinners
    Spinner occasionSpinner, relationshipSpinner, genderSpinner, age_rangeSpinner, price_rangeSpinner;

    //    private DatabaseReference mDatabase;
    //private ImageView mImageView1, mImageView2, mImageView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Firebase.setAndroidContext(this);
        //mDatabase = FirebaseDatabase.getInstance().getReference();
//        mImageView1 = findViewById(R.id.imageView1);
//        mImageView2 = findViewById(R.id.imageView2);
//        mImageView3 = findViewById(R.id.imageView3);

//        Glide.with(getApplicationContext()).load(url).into(mImageView);


/*
        Step 1: Create the data source
        Step 2: Define the appearance layout file through which the adapter will put data inside the spinner.
        Step 3: Define what to do when the user clicks on the spinner using the onItemSelectedListener.
*/
//        Initialize our spinner references
        occasionSpinner = findViewById(R.id.occasionSpinner);
//        Create an adapter the will manage the data,
//        .createFromResource because it allows me to create the adapter from the resource.
        ArrayAdapter occasionAdapter = ArrayAdapter.createFromResource(this, R.array.occasion, android.R.layout.simple_spinner_dropdown_item);
//        Now I need to set the adapter to the spinner
        occasionSpinner.setAdapter(occasionAdapter);
//        Lastly, the spinner needs to know who is responsible for handling events
//        (this), means this activity is responsible for handling the event.
        //occasionSpinner.setOnItemClickListener(this);

//      Initialize and create the adapter for relationshipSpinner.
        relationshipSpinner =  findViewById(R.id.relationshipSpinner);
        ArrayAdapter relationshipAdapter = ArrayAdapter.createFromResource(this, R.array.relationship, android.R.layout.simple_spinner_dropdown_item);
        relationshipSpinner.setAdapter(relationshipAdapter);
        //relationshipSpinner.setOnItemClickListener(this);

//      Initialize and create the adapter for genderSpinner.
        genderSpinner =  findViewById(R.id.genderSpinner);
        ArrayAdapter genderAdapter = ArrayAdapter.createFromResource(this, R.array.gender, android.R.layout.simple_spinner_dropdown_item);
        genderSpinner.setAdapter(genderAdapter);
        //genderSpinner.setOnItemClickListener(this);

        //      Initialize and create the adapter for genderSpinner.
        age_rangeSpinner = findViewById(R.id.age_rangeSpinner);
        ArrayAdapter age_rangeAdapter = ArrayAdapter.createFromResource(this, R.array.age_range, android.R.layout.simple_spinner_dropdown_item);
        age_rangeSpinner.setAdapter(age_rangeAdapter);
        //age_rangeSpinner.setOnItemClickListener(this);

//      Initialize and create the adapter for genderSpinner.
        price_rangeSpinner = findViewById(R.id.price_rangeSpinner);
        ArrayAdapter price_rangeAdapter = ArrayAdapter.createFromResource(this, R.array.price_range, android.R.layout.simple_spinner_dropdown_item);
        price_rangeSpinner.setAdapter(price_rangeAdapter);
        //price_rangeSpinner.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//        TextView txt = (TextView) view;
//        Toast.makeText(this, "You selected: " + txt.getText(),  Toast.LENGTH_SHORT).show();
//        String selectedOccasion = occasionSpinner.getSelectedItem().toString();
//        String selectedRelationship = relationshipSpinner.getSelectedItem().toString();
//        String selectedGender = genderSpinner.getSelectedItem().toString();
//        String selectedPriceRange = price_rangeSpinner.getSelectedItem().toString();
//        String selectedAgeRange = age_rangeSpinner.getSelectedItem().toString();
    }



    public void suggestMe(View view) {
        String OccVal = occasionSpinner.getSelectedItem().toString();
        String relVal = relationshipSpinner.getSelectedItem().toString();
        String GenVal = genderSpinner.getSelectedItem().toString();
        String AgeVal = age_rangeSpinner.getSelectedItem().toString();
        String PrVal = price_rangeSpinner.getSelectedItem().toString();

        //        Occasion new born

        if (OccVal.equalsIgnoreCase("New born") && (relVal.equalsIgnoreCase("Sister") || relVal.equalsIgnoreCase("Brother") ||
                relVal.equalsIgnoreCase("Son") ||relVal.equalsIgnoreCase("Daughter"))
                && (GenVal.equalsIgnoreCase("Female") || GenVal.equalsIgnoreCase("Male")) && AgeVal.equalsIgnoreCase("1-10")
                && PrVal.equalsIgnoreCase("50-100")) {
            Toast.makeText( this, "Case 50-100", Toast.LENGTH_SHORT).show();
        }
        else if (OccVal.equalsIgnoreCase("New born") && (relVal.equalsIgnoreCase("Sister") || relVal.equalsIgnoreCase("Brother") ||
                relVal.equalsIgnoreCase("Son") ||relVal.equalsIgnoreCase("Daughter"))
                && (GenVal.equalsIgnoreCase("Female") || GenVal.equalsIgnoreCase("Male")) && AgeVal.equalsIgnoreCase("1-10")
                && PrVal.equalsIgnoreCase("100-300")) {
            Toast.makeText( this, "Case 100-300", Toast.LENGTH_SHORT).show();
        }
        else  if (OccVal.equalsIgnoreCase("New born") && (relVal.equalsIgnoreCase("Sister") || relVal.equalsIgnoreCase("Brother") ||
                relVal.equalsIgnoreCase("Son") ||relVal.equalsIgnoreCase("Daughter"))
                && (GenVal.equalsIgnoreCase("Female") || GenVal.equalsIgnoreCase("Male")) && AgeVal.equalsIgnoreCase("1-10")
                && PrVal.equalsIgnoreCase("100-300")) {
            Toast.makeText( this, "Case 300-500", Toast.LENGTH_SHORT).show();
        }
        else  if (OccVal.equalsIgnoreCase("New born") && (relVal.equalsIgnoreCase("Sister") || relVal.equalsIgnoreCase("Brother") ||
                relVal.equalsIgnoreCase("Son") ||relVal.equalsIgnoreCase("Daughter"))
                && (GenVal.equalsIgnoreCase("Female") || GenVal.equalsIgnoreCase("Male")) && AgeVal.equalsIgnoreCase("1-10")
                && PrVal.equalsIgnoreCase("100-300")) {
            Toast.makeText( this, "Case 500-1000", Toast.LENGTH_SHORT).show();
        }

        else  if (OccVal.equalsIgnoreCase("New born") && (relVal.equalsIgnoreCase("Sister") || relVal.equalsIgnoreCase("Brother") ||
                relVal.equalsIgnoreCase("Son") ||relVal.equalsIgnoreCase("Daughter"))
                && (GenVal.equalsIgnoreCase("Female") || GenVal.equalsIgnoreCase("Male")) && (AgeVal.equalsIgnoreCase("10-20")||
                AgeVal.equalsIgnoreCase("30-50") || AgeVal.equalsIgnoreCase("50-80") || AgeVal.equalsIgnoreCase("80-100"))
                && PrVal.equalsIgnoreCase("100-300")) {
            Toast.makeText( this, "Wrong age range for a new born", Toast.LENGTH_SHORT).show();
        }

//        Occasion graduation

        else  if (OccVal.equalsIgnoreCase("Graduation") && ((relVal.equalsIgnoreCase("Sister")
                || relVal.equalsIgnoreCase("Daughter") || relVal.equalsIgnoreCase("Son"))
         || relVal.equalsIgnoreCase("Brother")) && (GenVal.equalsIgnoreCase("Female") ||
                GenVal.equalsIgnoreCase("Male")) && AgeVal.equalsIgnoreCase("1-10")
                && PrVal.equalsIgnoreCase("50-100") || PrVal.equalsIgnoreCase("100-300")
         || PrVal.equalsIgnoreCase("300-500") || PrVal.equalsIgnoreCase("500-1000+")) {
            Toast.makeText( this, "Age must be 20+", Toast.LENGTH_SHORT).show();
        }

        else  if (OccVal.equalsIgnoreCase("Graduation") && ((relVal.equalsIgnoreCase("Sister")
                || relVal.equalsIgnoreCase("Daughter") || relVal.equalsIgnoreCase("Son"))
                || relVal.equalsIgnoreCase("Brother")) && (GenVal.equalsIgnoreCase("Female") ||
                GenVal.equalsIgnoreCase("Male")) && AgeVal.equalsIgnoreCase("20-30")
                && PrVal.equalsIgnoreCase("50-100")){
            Toast.makeText( this, "Case 50-100", Toast.LENGTH_SHORT).show();
        }

        else  if (OccVal.equalsIgnoreCase("Graduation") && ((relVal.equalsIgnoreCase("Sister")
                || relVal.equalsIgnoreCase("Daughter") || relVal.equalsIgnoreCase("Son"))
                || relVal.equalsIgnoreCase("Brother")) && (GenVal.equalsIgnoreCase("Female") ||
                GenVal.equalsIgnoreCase("Male")) && AgeVal.equalsIgnoreCase("20-30")
                && PrVal.equalsIgnoreCase("100-300")){
            Toast.makeText( this, "Case 100-300", Toast.LENGTH_SHORT).show();
        }
        else  if (OccVal.equalsIgnoreCase("Graduation") && ((relVal.equalsIgnoreCase("Sister")
                || relVal.equalsIgnoreCase("Daughter") || relVal.equalsIgnoreCase("Son"))
                || relVal.equalsIgnoreCase("Brother")) && (GenVal.equalsIgnoreCase("Female") ||
                GenVal.equalsIgnoreCase("Male")) && AgeVal.equalsIgnoreCase("20-30")
                && PrVal.equalsIgnoreCase("300-500")){
            Toast.makeText( this, "Case 300-500", Toast.LENGTH_SHORT).show();
        }

        else  if (OccVal.equalsIgnoreCase("Graduation") && ((relVal.equalsIgnoreCase("Sister")
                || relVal.equalsIgnoreCase("Daughter") || relVal.equalsIgnoreCase("Son"))
                || relVal.equalsIgnoreCase("Brother")) && (GenVal.equalsIgnoreCase("Female") ||
                GenVal.equalsIgnoreCase("Male")) && AgeVal.equalsIgnoreCase("20-30")
                && PrVal.equalsIgnoreCase("500-1000+")){
            Toast.makeText( this, "Case 500-1000+", Toast.LENGTH_SHORT).show();
        }

        else  if (OccVal.equalsIgnoreCase("Graduation") && (relVal.equalsIgnoreCase("Friend")
                || relVal.equalsIgnoreCase("Wife/Love")) && (GenVal.equalsIgnoreCase("Female") ||
                GenVal.equalsIgnoreCase("Male")) && AgeVal.equalsIgnoreCase("1-10")
                && PrVal.equalsIgnoreCase("50-100") || PrVal.equalsIgnoreCase("100-300")
                || PrVal.equalsIgnoreCase("300-500") || PrVal.equalsIgnoreCase("500-1000+")) {
            Toast.makeText( this, "Age must be 20+", Toast.LENGTH_SHORT).show();
        }


        else  if (OccVal.equalsIgnoreCase("Graduation") && (relVal.equalsIgnoreCase("Friend")
                || relVal.equalsIgnoreCase("Wife/Love")) && (GenVal.equalsIgnoreCase("Female") ||
                GenVal.equalsIgnoreCase("Male")) && AgeVal.equalsIgnoreCase("20-30")
                && PrVal.equalsIgnoreCase("50-100")){
            Toast.makeText( this, "Case 50-100 for wife and love", Toast.LENGTH_SHORT).show();
        }

        else  if (OccVal.equalsIgnoreCase("Graduation") && (relVal.equalsIgnoreCase("Friend")
                || relVal.equalsIgnoreCase("Wife/Love")) && (GenVal.equalsIgnoreCase("Female") ||
                GenVal.equalsIgnoreCase("Male")) && AgeVal.equalsIgnoreCase("20-30")
                && PrVal.equalsIgnoreCase("100-300")){
            Toast.makeText( this, "Case 100-300 for wife and love", Toast.LENGTH_SHORT).show();
        }

        else  if (OccVal.equalsIgnoreCase("Graduation") && (relVal.equalsIgnoreCase("Friend")
                || relVal.equalsIgnoreCase("Wife/Love")) && (GenVal.equalsIgnoreCase("Female") ||
                GenVal.equalsIgnoreCase("Male")) && AgeVal.equalsIgnoreCase("20-30")
                && PrVal.equalsIgnoreCase("300-500")){
            Toast.makeText( this, "Case 300-500 for wife and love", Toast.LENGTH_SHORT).show();
        }

        else  if (OccVal.equalsIgnoreCase("Graduation") && (relVal.equalsIgnoreCase("Friend")
                || relVal.equalsIgnoreCase("Wife/Love")) && (GenVal.equalsIgnoreCase("Female") ||
                GenVal.equalsIgnoreCase("Male")) && AgeVal.equalsIgnoreCase("20-30")
                && PrVal.equalsIgnoreCase("500-1000+")){
            Toast.makeText( this, "Case 500-1000+ for wife and love", Toast.LENGTH_SHORT).show();
        }



        else  if (OccVal.equalsIgnoreCase("Graduation") && (relVal.equalsIgnoreCase("Mother")
                || relVal.equalsIgnoreCase("Father")) && (GenVal.equalsIgnoreCase("Female") ||
                GenVal.equalsIgnoreCase("Male")) && AgeVal.equalsIgnoreCase("1-10")
                && PrVal.equalsIgnoreCase("50-100") || PrVal.equalsIgnoreCase("100-300")
                || PrVal.equalsIgnoreCase("300-500") || PrVal.equalsIgnoreCase("500-1000+")) {
            Toast.makeText( this, "Age must be 20+", Toast.LENGTH_SHORT).show();
        }

        else  if (OccVal.equalsIgnoreCase("Graduation") && (relVal.equalsIgnoreCase("Father")
                || relVal.equalsIgnoreCase("Mother")) && (GenVal.equalsIgnoreCase("Female") ||
                GenVal.equalsIgnoreCase("Male")) && (AgeVal.equalsIgnoreCase("20-30")
                || AgeVal.equalsIgnoreCase("30-50")) &&PrVal.equalsIgnoreCase("50-100")){
            Toast.makeText( this, "Case 50-100 for mother and father age 20-30 and 30-50", Toast.LENGTH_SHORT).show();
        }


        else  if (OccVal.equalsIgnoreCase("Graduation") && (relVal.equalsIgnoreCase("Father")
                || relVal.equalsIgnoreCase("Mother")) && (GenVal.equalsIgnoreCase("Female") ||
                GenVal.equalsIgnoreCase("Male")) && (AgeVal.equalsIgnoreCase("20-30")
                || AgeVal.equalsIgnoreCase("30-50"))
                && PrVal.equalsIgnoreCase("100-300")){
            Toast.makeText( this, "Case 100-300 for mother and father age 20-30 and 30-50", Toast.LENGTH_SHORT).show();
        }

        else  if (OccVal.equalsIgnoreCase("Graduation") && (relVal.equalsIgnoreCase("Father")
                || relVal.equalsIgnoreCase("Mother")) && (GenVal.equalsIgnoreCase("Female") ||
                GenVal.equalsIgnoreCase("Male")) && (AgeVal.equalsIgnoreCase("20-30")
                || AgeVal.equalsIgnoreCase("30-50"))
                && PrVal.equalsIgnoreCase("300-500")){
            Toast.makeText( this, "Case 100-300 for mother and father age 20-30 and 30-50", Toast.LENGTH_SHORT).show();
        }

        else  if (OccVal.equalsIgnoreCase("Graduation") && (relVal.equalsIgnoreCase("Father")
                || relVal.equalsIgnoreCase("Mother")) && (GenVal.equalsIgnoreCase("Female") ||
                GenVal.equalsIgnoreCase("Male")) && (AgeVal.equalsIgnoreCase("20-30")
                || AgeVal.equalsIgnoreCase("30-50"))
                && PrVal.equalsIgnoreCase("500-1000+")){
            Toast.makeText( this, "Case 500-1000 for mother and father age 20-30 and 30-50", Toast.LENGTH_SHORT).show();
        }

//        Age value 50-80 and 80-100


        else  if (OccVal.equalsIgnoreCase("Graduation") && (relVal.equalsIgnoreCase("Friend")
                || relVal.equalsIgnoreCase("Wife/Love") || relVal.equalsIgnoreCase("Father")
        || relVal.equalsIgnoreCase("Mother") || relVal.equalsIgnoreCase("Sister")
        || relVal.equalsIgnoreCase("Brother") || relVal.equalsIgnoreCase("Son")
        || relVal.equalsIgnoreCase("Daughter")) && (GenVal.equalsIgnoreCase("Female") ||
                GenVal.equalsIgnoreCase("Male")) && AgeVal.equalsIgnoreCase("80-100")
                && PrVal.equalsIgnoreCase("50-100") || PrVal.equalsIgnoreCase("100-300")
                || PrVal.equalsIgnoreCase("300-500") || PrVal.equalsIgnoreCase("500-1000+")) {
            Toast.makeText( this, "Wrong age range", Toast.LENGTH_SHORT).show();
        }

        else  if (OccVal.equalsIgnoreCase("Graduation") && (relVal.equalsIgnoreCase("Friend")
                || relVal.equalsIgnoreCase("Wife/Love") || relVal.equalsIgnoreCase("Father")
                || relVal.equalsIgnoreCase("Mother") || relVal.equalsIgnoreCase("Sister")
                || relVal.equalsIgnoreCase("Brother") || relVal.equalsIgnoreCase("Son")
                || relVal.equalsIgnoreCase("Daughter")) && (GenVal.equalsIgnoreCase("Female") ||
                GenVal.equalsIgnoreCase("Male")) && AgeVal.equalsIgnoreCase("50-80")
                && PrVal.equalsIgnoreCase("50-100") || PrVal.equalsIgnoreCase("100-300")
                || PrVal.equalsIgnoreCase("300-500") || PrVal.equalsIgnoreCase("500-1000+")) {
            Toast.makeText( this, "Wrong age range", Toast.LENGTH_SHORT).show();
        }


//        Eid Adha
        else  if ((OccVal.equalsIgnoreCase("Eid_Adha") || OccVal.equalsIgnoreCase("Eid_Fitr")) && ((relVal.equalsIgnoreCase("Sister")
                || relVal.equalsIgnoreCase("Daughter") || relVal.equalsIgnoreCase("Son"))
                || relVal.equalsIgnoreCase("Brother")) && (GenVal.equalsIgnoreCase("Female") ||
                GenVal.equalsIgnoreCase("Male")) && AgeVal.equalsIgnoreCase("1-10")
                && PrVal.equalsIgnoreCase("50-100") || PrVal.equalsIgnoreCase("100-300")
                || PrVal.equalsIgnoreCase("300-500") || PrVal.equalsIgnoreCase("500-1000+")) {
            Toast.makeText( this, "Age must be 20+", Toast.LENGTH_SHORT).show();
        }


        else  if ((OccVal.equalsIgnoreCase("Eid_Adha") || OccVal.equalsIgnoreCase("Eid_Fitr"))
                && ((relVal.equalsIgnoreCase("Sister")
                || relVal.equalsIgnoreCase("Daughter") || relVal.equalsIgnoreCase("Son"))
                || relVal.equalsIgnoreCase("Brother")) && (GenVal.equalsIgnoreCase("Female") ||
                GenVal.equalsIgnoreCase("Male")) && AgeVal.equalsIgnoreCase("1-10")
                && PrVal.equalsIgnoreCase("50-100")){
            Toast.makeText( this, "Case 50-100, age 1-10. Eid_Adha/Eid_Fitr", Toast.LENGTH_SHORT).show();
        }

        else  if ((OccVal.equalsIgnoreCase("Eid_Adha") || OccVal.equalsIgnoreCase("Eid_Fitr"))
                && ((relVal.equalsIgnoreCase("Sister")
                || relVal.equalsIgnoreCase("Daughter") || relVal.equalsIgnoreCase("Son"))
                || relVal.equalsIgnoreCase("Brother")) && (GenVal.equalsIgnoreCase("Female") ||
                GenVal.equalsIgnoreCase("Male")) && (AgeVal.equalsIgnoreCase("20-30") ||
                AgeVal.equalsIgnoreCase("20-30"))
                && PrVal.equalsIgnoreCase("100-300") || PrVal.equalsIgnoreCase("300-500")){
            Toast.makeText( this, "Case 50-100, age 20-30 && 30-50. and price 100-300 and 300-500 Eid_Adha/Eid_Fitr", Toast.LENGTH_SHORT).show();
        }

        else  if ((OccVal.equalsIgnoreCase("Eid_Adha") || OccVal.equalsIgnoreCase("Eid_Fitr"))
                && ((relVal.equalsIgnoreCase("Sister")
                || relVal.equalsIgnoreCase("Daughter") || relVal.equalsIgnoreCase("Son"))
                || relVal.equalsIgnoreCase("Brother")) && (GenVal.equalsIgnoreCase("Female") ||
                GenVal.equalsIgnoreCase("Male")) && (AgeVal.equalsIgnoreCase("50-80") ||
                AgeVal.equalsIgnoreCase("80-100"))
                && PrVal.equalsIgnoreCase("50-100") || PrVal.equalsIgnoreCase("100-300")
                || PrVal.equalsIgnoreCase("300-500") || PrVal.equalsIgnoreCase("500-1000")){
            Toast.makeText( this, "Case 50-100, age 20-30 && 30-50. and price 50-100, 100-300 and 300-500, 500-1000+ Eid_Adha/Eid_Fitr", Toast.LENGTH_SHORT).show();
        }

    }
}
