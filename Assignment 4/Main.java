
public class Main {
    public static void main(String[] args) {
        Housing building = new Housing("RnD Road");
        Housing floor0 = new Housing("RnD 1 - Ground Floor");
        int gFloor = building.addStructure(floor0);

        Room washroom = new Washroom();
        Room garage = new Garage();
        Room commonRoom = new Common();

        int washroom1 = floor0.addStructure(washroom);
        int garage1 = floor0.addStructure(garage);
        int commonRoom1 = floor0.addStructure(commonRoom);

        building.enter();
        Housing currentFloor = (Housing) building.getStructure(gFloor);
        currentFloor.enter();

        Room currentRoom = (Room) currentFloor.getStructure(washroom1);
        currentRoom.enter();

        currentRoom = (Room) currentFloor.getStructure(commonRoom1);
        currentRoom.enter();

        building.exit();
    }
}
