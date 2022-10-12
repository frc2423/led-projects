package frc.robot.led;

import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj.Timer;



public class LedFade implements Led {
    private Timer timer = new Timer();
    int red = 250;
    int green = 90;
    int blue = 0;

    public void start(AddressableLEDBuffer buffer, int length) {
        timer.start();
        timer.reset();
    }

    public void run(AddressableLEDBuffer buffer, int length) {
        for (var i = 0; i < buffer.getLength(); i++) {
            buffer.setRGB(i, red, green, blue);
            if (timer.get() > 0.02) {
                if (red > 0) {
                    red--;
                } else if (red < 250) {
                    red++;
                }
                if (green < 255) {
                    green++;
                } else if (green > 90) {
                    green--;
                }
                timer.reset();
            }
        }
    }

    public void end(AddressableLEDBuffer buffer, int length) {

    }
}
