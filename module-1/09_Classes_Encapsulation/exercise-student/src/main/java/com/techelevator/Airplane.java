package com.techelevator;

public class Airplane {
    public	String	planeNumber;
    public	int	totalFirstClassSeats;
    public	int	bookedFirstClassSeats;
    public	int	totalCoachSeats;
    public	int	bookedCoachSeats;


    //constructor
    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats){
        this.planeNumber=planeNumber;
        this.totalCoachSeats=totalCoachSeats;
        this.totalFirstClassSeats=totalFirstClassSeats;
    }


    // derived values
    public int getAvailableCoachSeats() {
        int seatsOpenCoach = totalCoachSeats - bookedCoachSeats;
        return seatsOpenCoach;
    }

    public int getAvailableFirstClassSeats() {
        int seatsOpenFirst = totalFirstClassSeats - bookedFirstClassSeats;
        return seatsOpenFirst;
           }

    //methods
    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats){
        boolean wasBooked = false;
        if(forFirstClass == true && getAvailableFirstClassSeats() >= totalNumberOfSeats){
            bookedFirstClassSeats += totalNumberOfSeats;
            wasBooked = true;
            } else if(forFirstClass == false && getAvailableCoachSeats() >= totalNumberOfSeats){
            bookedCoachSeats += totalNumberOfSeats;
            wasBooked =  true;
        }
        return wasBooked;
    }

    // getters
    public String getPlaneNumber() {
        return planeNumber;
    }

    public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;
    }

    public int getBookedFirstClassSeats() {
        return bookedFirstClassSeats;
    }


    public int getTotalCoachSeats() {
        return totalCoachSeats;
    }

    public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }


}
