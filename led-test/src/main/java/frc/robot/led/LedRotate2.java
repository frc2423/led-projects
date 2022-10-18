package frc.robot.led;

import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj.Timer;

public class LedRotate2 implements Led {
    private Timer timer = new Timer();

    public void start(AddressableLEDBuffer buffer, int length) {
        timer.start();
        timer.reset();
    }

    public void run(AddressableLEDBuffer buffer, int length) {
        while (true) {
        for (var i = 0; i < buffer.getLength(); i++) {
            buffer.setRGB(i, 85, 0, 0);
            if (timer.get() > 4.5) {
                buffer.setRGB(i, 0, 0, 85);
            }
            else if (timer.get() > 3.6) {
                buffer.setRGB(i, 85, 85, 0);
            }
            else if (timer.get() > 2.7) {
                buffer.setRGB(i, 0, 85, 0);
            }
            if (timer.get() > 1.8) {
                timer.setRGB(i, 85, 0, 0);
            }
            if (timer.get() > 0.9) {
                timer.setRGB(i, 85, 85, 0);
            }
            if (timer.get() > 0) {
                timer.setRGB(i, 0, 85, 0);
                timer.reset();
            }
        }
        }
    }

    public void end(AddressableLEDBuffer buffer, int length) {

    }
}
