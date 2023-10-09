
public class Main {
    public static void main(String[] args) {
        Housing building = new Housing("RnD Road");
        Housing floor0 = new Housing("RnD 1 - Ground Floor");
        int firstFloor = building.addStructure(floor0);

        Room washroom = new Washroom();
        Room garage = new Garage();
        Room commonRoom = new Common();

        int firstMens = floor0.addStructure(washroom);
        int firstWomans = floor0.addStructure(garage);
        int firstCommon = floor0.addStructure(commonRoom);

        building.enter();
        Housing currentFloor = (Housing) building.getStructure(firstFloor);
        currentFloor.enter();

        Room currentRoom = (Room) currentFloor.getStructure(firstMens);
        currentRoom.enter();

        currentRoom = (Room) currentFloor.getStructure(firstCommon);
        currentRoom.enter();

        building.exit();
    }
}
