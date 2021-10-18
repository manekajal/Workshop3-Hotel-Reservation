package com.bl;

import java.text.ParseException;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit.*;


public class HotelReservation {

    static String hotelName;
    static long cheapestPrice;



    static void chepestHotel(ArrayList<HotelDetails>hotel) throws ParseException
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the checkIn date");
        System.out.println("Enter the date");
        int dd = scanner.nextInt();
        System.out.println("Enter the month");
        int mm = scanner.nextInt();
        System.out.println("Enter the year");
        int yy = scanner.nextInt();
        LocalDate checkIn = LocalDate.of(yy, mm, dd);
        System.out.println("____________________________");

        System.out.println("Enter the checkOut date");
        System.out.println("Enter the date");
        int day = scanner.nextInt();
        System.out.println("Enter the month");
        int month = scanner.nextInt();
        System.out.println("Enter the year");
        int year = scanner.nextInt();
        LocalDate checkOut=LocalDate.of(year,month,day);

            long numDays = ChronoUnit.DAYS.between(checkIn,checkOut);
            int index = 0;
            int cheapestRate = hotel.get(0).getRates();
            for (int i = 0; i < hotel.size(); i++) {
                if (hotel.get(i).getRates() < cheapestRate) {
                    cheapestRate = hotel.get(i).getRates();
                    index = i;
                }
            }
            System.out.println(index + "index");
            hotelName = hotel.get(index).getHotelName();
            cheapestPrice = hotel.get(index).getRates() * numDays;


        }


        public static void main(String[] args) throws ParseException {

            HotelReservation hotelReservation = new HotelReservation();
            ArrayList<HotelDetails> hotelDetails = new ArrayList<>();
            System.out.println(" Welcome to Hotel Reservation Program :");

            Scanner scanner = new Scanner(System.in);


            boolean flag = true;
            while (true) {
                System.out.println("Enter your choice ,1 for add ,2 for Display , 3 for Minimum cost hotel , 4 fo exit");
                int choice = scanner.nextInt();


                switch (choice) {
                    case 1:
                        System.out.println(" Enter the number of hotel:");
                        int num = scanner.nextInt();
                        for (int i = 0; i < num; i++) {
                            System.out.println("Enter the Hotel Name:");
                            String hotelname = scanner.next();

                            System.out.println();
                            System.out.println("Enter the rates:");
                            int rates = scanner.nextInt();
                            hotelDetails.add(new HotelDetails(hotelname, rates));


                        }

                        break;
                    case 2:
                        for (int i = 0; i < hotelDetails.size(); i++) {
                            System.out.println(hotelDetails.get(i).getHotelName());
                            System.out.println(hotelDetails.get(i).getRates());
                            System.out.println();
                        }
                        break;
                    case 3:
                        chepestHotel(hotelDetails);
                        System.out.println("Cheapest hotel name:-" + hotelName + " " + "Cheapest Price :-" + cheapestPrice);
                        break;

                    case 4:
                        flag = false;
                        break;


                }

            }

        }
    }

