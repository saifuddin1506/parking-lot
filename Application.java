package ParkingLot;

import ParkingLot.service.parkingService;

public class Application{
public static void main(String[] args) {
    System.out.println("hello from the parking lot");
    parkingService parkingService = new parkingService();
    parkingService.addParkingLot("ParkingLot1234", 2, 6);
    parkingService.showFreeParkingSlots("CAR");


    //second test case here

    parkingService.showFreeParkingSlots("BIKE");

    // third test case  

    parkingService.showFreeParkingSlots("TRUCK");


    //fourth test case will write here new field


}

}