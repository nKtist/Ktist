package com.example.ktist;

import android.content.ContentValues;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

public class TableManagment {


    public static void addTables(TableLayout tables, Context context, int t_count, TableRow.LayoutParams layout){

        int i=1;
        int t_number=1;

        while(i<=t_count/3){
            TableRow trow = new TableRow(context);

            Table t1 = new Table(Table.TableState.Free,t_number,context);
            t1.getTableButton().setLayoutParams(layout);
            trow.addView(t1.getTableButton());
            t_number++;



            Table t2 = new Table(Table.TableState.Free,t_number,context);
            t2.getTableButton().setLayoutParams(layout);
            trow.addView(t2.getTableButton());
            t_number++;


            Table t3 = new Table(Table.TableState.Free,t_number,context);
            t3.getTableButton().setLayoutParams(layout);
            trow.addView(t3.getTableButton());
            t_number++;

            i++;
            tables.addView(trow);
        }
        TableRow trow = new TableRow(context);
        if(t_count%3==1){

            Table t1 = new Table(Table.TableState.Free,t_number,context);
            t1.getTableButton().setLayoutParams(layout);
            trow.addView(t1.getTableButton());
            t_number++;
        }else if(t_count%3==2){
            Table t1 = new Table(Table.TableState.Free,t_number,context);
            t1.getTableButton().setLayoutParams(layout);
            trow.addView(t1.getTableButton());
            t_number++;


            Table t2 = new Table(Table.TableState.Free,t_number,context);
            t2.getTableButton().setLayoutParams(layout);
            trow.addView(t2.getTableButton());
            t_number++;
        }
        tables.addView(trow);





    }
/*
 public static void clickTables(int id){
        Table table = new Table();
        table.getTableButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                                }

        });
    }

 */



}

