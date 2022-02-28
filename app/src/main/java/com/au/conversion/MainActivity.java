package com.au.conversion;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed=findViewById(R.id.tv);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu a) {
        getMenuInflater().inflate(R.menu.menu,a);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem i) {
        try {
            switch(i.getItemId())
            {
                case R.id.rtd:
                    Toast.makeText(this, " "+ed.getText().toString()+" Rupees to"+Double.parseDouble(ed.getText().toString())/74.45+" Doller", Toast.LENGTH_LONG).show();
                    break;

                case R.id.dtr:
                    Toast.makeText(this, " "+ed.getText().toString()+" Dollers to"+Double.parseDouble(ed.getText().toString())*74.45+" Rupees", Toast.LENGTH_LONG).show();
                    break;

                case R.id.rtp:
                    Toast.makeText(this, " "+ed.getText().toString()+" Rupees to"+Double.parseDouble(ed.getText().toString())/101.82+" Pound", Toast.LENGTH_LONG).show();
                    break;

                case R.id.ptr:
                    Toast.makeText(this, " "+ed.getText().toString()+" Pound to"+Double.parseDouble(ed.getText().toString())*101.82+" Rupees", Toast.LENGTH_LONG).show();
                    break;
            }
        }
        catch (Exception e) {
            Toast.makeText(this, "Plz Enter Only Number", Toast.LENGTH_LONG).show();
        }
        return true;
    }
}