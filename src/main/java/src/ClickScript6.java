package src;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

import java.awt.*;
import java.awt.event.InputEvent;


//原神
public class ClickScript6 {
    static volatile boolean isRunning = false;

    public static void main(String[] args) throws AWTException, InterruptedException {
        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException ex) {
            System.err.println("注册全局键盘监听器失败");
            System.exit(1);
        }

        GlobalScreen.addNativeKeyListener(new NativeKeyListener() {
            public void nativeKeyPressed(NativeKeyEvent e) {
                if (NativeKeyEvent.getKeyText(e.getKeyCode()).equalsIgnoreCase("I")) {
                    isRunning = true;
                } else if (NativeKeyEvent.getKeyText(e.getKeyCode()).equalsIgnoreCase("K")) {
                    isRunning = false;
                }
            }

            public void nativeKeyReleased(NativeKeyEvent e) { }

            public void nativeKeyTyped(NativeKeyEvent e) { }
        });

        while (true) {
            if (isRunning) {
                System.out.println("程序正在运行...");
                application();
            }
        }
    }

    public static void application() throws AWTException, InterruptedException {
        //开启后的反应时间
        Thread.sleep(100);
        // 创建一个Robot对象
        Robot robot = new Robot();
        int targetX = 1357;
        int targetY = 807;
        robot.mouseMove(-1, -1);
        robot.mouseMove((int) (targetX / 1.25), (int) (targetY / 1.25));
        Thread.sleep(100);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
}
