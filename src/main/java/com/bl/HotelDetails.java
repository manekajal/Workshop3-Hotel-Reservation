package com.bl;

public class HotelDetails {
    String hotelName;
    int rates;


    public HotelDetails(String hotelName, int rates) {
        this.hotelName = hotelName;
        this.rates = rates;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRates() {
        return rates;
    }

    public void setRates(int rates) {
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "HotelDetails{" +
                "hotelName='" + hotelName + '\'' +
                ", rates=" + rates +
                '}';
    }
}
