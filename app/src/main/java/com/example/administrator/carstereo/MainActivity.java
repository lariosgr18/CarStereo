package com.example.administrator.carstereo;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;


public class MainActivity extends ActionBarActivity {

    int counter = 0;

    double minRange;
    double maxRange;
    double stepSize;
    boolean am;
    double currentFM = 88.1;
    int currentAM = 530;

    Button power;
    TextView displayBox;
    Button volUpButton;
    Button volDownButton ;
    Button amButton ;
    Button fmButton ;
    Button tuneUpButton ;
    Button tuneDownButton ;
    Button preset1;
    Button preset2;
    Button preset3;
    Button preset4;
    Button preset5;
    Button preset6;


    DecimalFormat df;
    int[] amArray;
    double[] fmArray;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayBox = (TextView) findViewById(R.id.DisplayBox);
        power = (Button) findViewById(R.id.PowerButton);
        volUpButton = (Button) findViewById(R.id.VolUp);
        volDownButton = (Button) findViewById(R.id.VolDown);
        amButton = (Button) findViewById(R.id.AM);
        fmButton = (Button) findViewById(R.id.FM);
        tuneUpButton = (Button) findViewById(R.id.TuneUp);
        df= new DecimalFormat("0.##");
        tuneDownButton = (Button) findViewById(R.id.TuneDown);
        preset1= (Button) findViewById(R.id.Preset1);
        preset2= (Button) findViewById(R.id.Preset2);
        preset3= (Button) findViewById(R.id.Preset3);
        preset4= (Button) findViewById(R.id.Preset4);
        preset5= (Button) findViewById(R.id.Preset5);

        amArray= new int[]{550,600,650,700,750,800} ;
        fmArray= new double[]{90.9,92.9,94.9,96.9,98.9,100.9};
        powerClick();
       // displayBox.setText();
        radioClick();
        longPresetButtons();
        presetButtons();
    }

    private void longPresetButtons() {
        preset1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(am==true){
                    amArray[0] =currentAM ;
                    Toast.makeText(MainActivity.this, "Preset Changed!!!", Toast.LENGTH_SHORT).show();
                }
                else if(am==false){
                    fmArray[0] =(Double.parseDouble(df.format(currentFM))) ;
                    Toast.makeText(MainActivity.this, "Preset Changed!!!", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });

        preset2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(am==true){
                    amArray[1] =currentAM  ;
                    Toast.makeText(MainActivity.this, "Preset Changed!!!", Toast.LENGTH_SHORT).show();
                }
                else if(am==false){
                    fmArray[1] =(Double.parseDouble(df.format(currentFM))) ;
                    Toast.makeText(MainActivity.this, "Preset Changed!!!", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });

        preset3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(am==true){
                    amArray[2] =  currentAM ;
                    Toast.makeText(MainActivity.this, "Preset Changed!!!", Toast.LENGTH_SHORT).show();
                }
                else if(am==false){
                    fmArray[2] =(Double.parseDouble(df.format(currentFM))) ;
                    Toast.makeText(MainActivity.this, "Preset Changed!!!", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });


        preset4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(am==true){
                    amArray[3] =  currentAM ;
                    Toast.makeText(MainActivity.this, "Preset Changed!!!", Toast.LENGTH_SHORT).show();
                }
                else if(am==false){
                    fmArray[3] =(Double.parseDouble(df.format(currentFM))) ;
                    Toast.makeText(MainActivity.this, "Preset Changed!!!", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });


        preset5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(am==true){
                    amArray[4] = currentAM;
                    Toast.makeText(MainActivity.this, "Preset Changed!!!", Toast.LENGTH_SHORT).show();
                }
                else if(am==false){
                    fmArray[4] =(Double.parseDouble(df.format(currentFM))) ;
                    Toast.makeText(MainActivity.this, "Preset Changed!!!", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });

    }

    private void presetButtons() {
        preset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(am==true){
                    displayBox.setText(amArray[0]+"");
                    currentAM = amArray[0];
                }
                else if(am==false){
                    displayBox.setText(fmArray[0]+"");
                    currentFM= fmArray[0];
                }
            }
        });
        preset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(am==true){
                    displayBox.setText(amArray[1]+"");
                    currentAM = amArray[1];
                }
                else if(am==false){
                    displayBox.setText(fmArray[1]+"");
                    currentFM= fmArray[1];
                }
            }
        });
        preset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(am==true){
                    displayBox.setText(amArray[2]+"");
                    currentAM = amArray[2];
                }
                else if(am==false){
                    displayBox.setText(fmArray[2]+"");
                    currentFM= fmArray[2];
                }
            }
        });
        preset4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(am==true){
                    displayBox.setText(amArray[3]+"");
                    currentAM = amArray[3];
                }
                else if(am==false){
                    displayBox.setText(fmArray[3]+"");
                    currentFM= fmArray[3];
                }
            }
        });
        preset5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(am==true){
                    displayBox.setText(amArray[4]+"");
                    currentAM = amArray[4];
                }
                else if(am==false){
                    displayBox.setText(fmArray[4]+"");
                    currentFM= fmArray[4];
                }
            }
        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    protected void powerClick() {

        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                //int backgroundNow = displayBox.getB

                if(counter==1){
                    displayBox.setBackgroundColor(Color.LTGRAY);
                    fmButton.setBackgroundColor(Color.LTGRAY);
                    amButton.setBackgroundColor(Color.LTGRAY);
                    tuneUpButton.setBackgroundColor(Color.LTGRAY);
                    tuneDownButton.setBackgroundColor(Color.LTGRAY);
                    volUpButton.setBackgroundColor(Color.LTGRAY);
                    volDownButton.setBackgroundColor(Color.LTGRAY);
                    counter =0;
                }
                else if(counter ==0){

                    displayBox.setBackgroundColor(Color.BLACK);
                    fmButton.setBackgroundColor(Color.BLACK);
                    amButton.setBackgroundColor(Color.BLACK);
                    tuneUpButton.setBackgroundColor(Color.BLACK);
                    tuneDownButton.setBackgroundColor(Color.BLACK);
                    volUpButton.setBackgroundColor(Color.BLACK);
                    volDownButton.setBackgroundColor(Color.BLACK);
                    counter =1;
                }
            }
        });

    }


    protected void radioClick(){



        amButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                am = true;
                minRange = 530;
                maxRange = 1730;
                stepSize = 10;



            }
        });

        fmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                am = false;
                minRange = 88.1;
                maxRange = 107.9;
                stepSize = 0.2;

            }
        });

        tuneUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //FM Radio
                if(am ==false){
                    if(currentFM==107.9){
                        currentFM  = 88.1;
                    }
                    else {
                        currentFM += stepSize;
                    }

                    displayBox.setText(""+(df.format(currentFM)));


                }
                else if(am ==true) {

                        if (currentAM == 1700) {
                            currentAM = 530;
                        } else {
                            currentAM = currentAM + (int) stepSize;
                        }
                    displayBox.setText(currentAM+"");

                }



            }
        });
        tuneDownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //FM Radio
                if (am == false) {
                    if (currentFM == 88.1) {
                        currentFM = 107.9;
                    } else {
                        currentFM -= stepSize;
                    }
                    displayBox.setText(""+(df.format(currentFM)));


                } else if (am == true) {

                        if (currentAM == 530) {
                            currentAM = 1700;
                        } else {
                            currentAM = currentAM - (int) stepSize;
                        }
                    displayBox.setText(currentAM+"");

                }


            }
        });

        if(am==false) {
            displayBox.setText(currentFM + "");
        }
        else if(am==true){
            displayBox.setText(currentAM+"");
        }

    }
        }

