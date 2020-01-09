package com.example.ktist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;




public class MainActivity extends AppCompatActivity {
    public final Integer t_count=83;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Tables Creation
        TableLayout tables = findViewById(R.id.tables);
        TableRow.LayoutParams tl = new TableRow.LayoutParams(
                TableRow.LayoutParams.WRAP_CONTENT,
                TableRow.LayoutParams.MATCH_PARENT);

        TableManagment.addTables(tables,this,t_count,tl);

        tables.setColumnStretchable(0, true);
        tables.setColumnStretchable(1, true);
        tables.setColumnStretchable(2, true);
        //




    }
}
