package Class;

import Interface.Build;
import Exception.*;
import java.util.ArrayList;

public class House implements Build {
    private ArrayList<Room> rooms;
    String name;
    public House(String n){
        name = n;
        rooms = new ArrayList<Room>();
    }
    public void addRoom(String name, int s, int kolWin){
        rooms.add(new Room(name, s, kolWin));

    }
    public Room getRoom(String s){
        Room itRoom = new Room();
        for(Room room : rooms)
            if(room.name == s)
                itRoom = room;

        return itRoom;
    }
    public void describe() throws WrongIlluminanceException, WrongSpaceException {
        System.out.println("Здание " + name);
        for (Room room: rooms) {
            System.out.println("Комната " + room.name);
            room.checkLight();
            room.checkFurniture();
        }
    }
}
