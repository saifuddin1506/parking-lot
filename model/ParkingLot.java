package ParkingLot.model;

import java.util.List;
public class ParkingLot {
    private String id;
    private String name;
    private List<Floor> floors;
    public ParkingLot(){

    }
    public ParkingLot(String id, String name , List<Floor> floors){
        this.name = name;
        this.id = id;
        this.floors = floors;
    }
    public void setFloors(List<Floor> floors){
        this.floors = floors;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public List<Floor> getFloors(){
        return this.floors;
    }
}
