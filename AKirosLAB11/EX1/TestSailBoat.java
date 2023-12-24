public class TestSailBoat {
    public static void main(String[] args) {
        System.out.println("********** Boat Demo **********");
        Boat boat = new Boat();
        System.out.println(boat.toString());
        boat.setColor("blue");
        boat.setLength(25);

        System.out.println("\n********** SailBoat Demo **********");
        SailBoat boat2 = new SailBoat();
        System.out.println(boat2.toString());
        boat2.setColor("purple");
        boat2.setLength(90);
    }
}