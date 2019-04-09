package pcAssignment;

public class Main {
    public static void main(String[] args) {

       // Case case1 = new Case("Dell", "Lollipop","Air", 67 );
        Dimension dimension1 = new Dimension(420, 780, 1080);
        Monitor monitor1 = new Monitor("Dell", "SharkFin", 8, 1080);
        MotherBoard motherBoard = new MotherBoard("man man", "Dell", 90, 890, "bios");
        Resolution resolution1 = new Resolution(78, 90);
        Case case1 = new Case("man man", "Dell", "Solor Power", dimension1);

        PC pc1 = new PC(motherBoard, monitor1, case1);

        pc1.powerUp();
        System.out.println(pc1);

    }
}
