package Timetable;

public class ClassDetails {

    private String name;
    private String roomNumber;

    public ClassDetails(String name, String roomNumber) {
        this.name = name;
        this.roomNumber = roomNumber;
    }

    public String getName() {
        return name;
    }

    public String getRoomNumber() { return roomNumber; }

    public String toString(){
        return getName()+" "+getRoomNumber();
    }
}

