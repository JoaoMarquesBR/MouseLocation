import javax.swing.*;
import java.awt.*;

public class MouseInformation {


    public static void main(String[] args) throws InterruptedException, AWTException {

        System.out.println("      Author : Joao Marques");
        System.out.println(" Created at  : 15/03/2002");
        System.out.println("    Purpose  : Get mouse information in every 4 seconds..\n\n");

        int x;
        int y;
        while (true){
            Thread.sleep(4000);
            x = getMouseX();
            y = getMouseY();
            System.out.println("Mouse Location at x,y = ("+x+","+y+").\n");
        }
    }


    private static int getMouseX() throws AWTException {
        double mouseX = MouseInfo.getPointerInfo().getLocation().getX();
        return ((int) mouseX);
    }
    private static int getMouseY() throws AWTException {
        double mouseY = MouseInfo.getPointerInfo().getLocation().getY();
        return ((int) mouseY);
    }
}