package com.example.ktist;

import android.content.Context;
import android.widget.Button;

public class Table {


    private int state;
    private Button tableButton;
    private int number;
    private double price;


    public Table(int state, int number, Context c){
        this.state=state;
        this.number=number;
        tableButton= new Button(c);
        tableButton.setText(number+"");
        tableButton.setId(number);
        price=0;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Button getTableButton() {
        return tableButton;
    }

    public void setTableButton(Button tableButton) {
        this.tableButton = tableButton;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public class TableState{

        public static final int Free=0;
        public static final int Ordered=1;
        public static final int Paying=2;

        public int getFree() {
            return Free;
        }

        public int getOrdered() {
            return Ordered;
        }

        public int getPaying() {
            return Paying;
        }
    }





}
