package src;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

//冻天
public class ClickScript5 {

    public static void main(String[] args) throws AWTException, InterruptedException {
        //开启后的反应时间
        Thread.sleep(3000);
        // 创建一个Robot对象
        Robot robot = new Robot();
        int targetX;
        int targetY;
        while(true) {

            //操作
            for(int i =0;i<40 ;i++){
                robot.keyPress(KeyEvent.VK_I);
                robot.keyRelease(KeyEvent.VK_I);
                robot.keyPress(KeyEvent.VK_SPACE);
                robot.keyRelease(KeyEvent.VK_SPACE);
                Thread.sleep(500);
            }

            //固定写法，用于返回世界
            targetX = 1100;
            targetY = 850;
            robot.mouseMove(-1,-1);
            robot.mouseMove((int)(targetX/1.25), (int)(targetY/1.25));
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            targetX = 1020;
            targetY = 450;
            robot.mouseMove(-1,-1);
            robot.mouseMove((int)(targetX/1.25), (int)(targetY/1.25));
            Thread.sleep(1000);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            //进入要刷的副本
            targetX = 700;
            targetY = 700;
            robot.mouseMove(-1,-1);
            robot.mouseMove((int)(targetX/1.25), (int)(targetY/1.25));
            Thread.sleep(1000);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            Thread.sleep(1000);
        }
    }
}
