package com.currencyapp.currencyconverter.Model;

/**
 * Created by raghav on 17/1/16.
 */
public class Rate {

    public String id;
    public String Name;
    public String Rate;
    public String Date;
    public String Time;
    public String Ask;
    public String Bid;

    public Rate() {
        id = "USDUSD";
        Name = "USDUSD";
        Rate = "0";
        Date = "date";
        Time = "time";
        Ask = "ask";
        Bid = "bid";
    }


    //    {
//        "id": "EURUSD",
//            "Name": "EUR/USD",
//            "Rate": "1.0999",
//            "Date": "3/5/2016",
//            "Time": "8:59am",
//            "Ask": "1.1030",
//            "Bid": "1.0969"
//    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setRate(String rate) {
        Rate = rate;
    }

    public void setDate(String date) {
        Date = date;
    }

    public void setTime(String time) {
        Time = time;
    }

    public void setAsk(String ask) {
        Ask = ask;
    }

    public void setBid(String bid) {
        Bid = bid;
    }
}
