package pcAssignment;

import javax.management.monitor.Monitor;

public class PC {
     private MotherBoard motherBoard;
     private Case theCase;
     private Monitor monitor;

     public PC(MotherBoard motherBoard, pcAssignment.Monitor monitor1, Case case1){

     }

    public PC(MotherBoard motherBoard, Case theCase, Monitor monitor) {
        this.motherBoard = motherBoard;
        this.theCase = theCase;
        this.monitor = monitor;
    }

    private void drawLogo(String monitor){
        drawPixel();
    }

    private void drawPixel() {
    }

    public void powerUp(){
         theCase.pressPowerButton();

         drawLogo("Amazon logo");
         motherBoard.loadProgram("Bing");
        System.out.println("Loading for Results..");

    }
    //tO String
    @Override
    public String toString() {
        return "PC{" +
                "motherBoard=" + motherBoard +
                ", theCase=" + theCase +
                ", monitor=" + monitor +
                '}';
    }
}
