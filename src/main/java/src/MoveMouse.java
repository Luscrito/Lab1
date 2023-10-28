package src;

import java.awt.*;

public class MoveMouse {

    public static void main(String[] args) throws  AWTException, InterruptedException{
        Thread.sleep(1000);
        Robot robot = new Robot();
        int targetX = 1357;
        int targetY = 807;
        robot.mouseMove(-1,-1);
        robot.mouseMove((int)(targetX/1.25), (int)(targetY/1.25));


    }
}
