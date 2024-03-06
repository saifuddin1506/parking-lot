package ParkingLot.service;

import java.util.ArrayList;
import java.util.List;

import ParkingLot.model.Floor;
import ParkingLot.model.ParkingLot;
import ParkingLot.model.Slots;
import ParkingLot.model.Vehicle;

public class parkingService {
    

    private ParkingLot  parkingLot;  // assuming we have only one parking lot 

    public parkingService(){
        this.parkingLot = new ParkingLot();
    }
    public String parkVehicle(Vehicle vehicle){
        System.out.println("starting to park vehicle " + vehicle.getType());
        return "";
    }


    public ParkingLot addParkingLot(String id, int floorsToAdd, int slotsPerFloor){
        List<Floor> floors = new ArrayList<>();
        int counter =0;
        while(counter<floorsToAdd){
            List<Slots> slots = new ArrayList<>();
          for(int i =0;i<slotsPerFloor;i++){
                slots.add( new Slots(i+1));
          }
          floors.add( new Floor(counter+1,slots));
          ++counter;
        }
        this.parkingLot = new ParkingLot(id,"new parking Lot", floors);
        return parkingLot;
    }

    public void showFreeParkingSlots(String vehicleType){
        for(Floor floor : parkingLot.getFloors()){
            int availableSlots =0;
            for(Slots slots : floor.getSlots()){
                if(slots.getIsAvailable() && slots.getSlotType().equals(vehicleType)){
                        ++availableSlots;
                }
            }
            System.out.println("No of free slots for "+ vehicleType+" on floor " + floor.getFloorNum()+ " is " + availableSlots);
        }
    }
    
}
