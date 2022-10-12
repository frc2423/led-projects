// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.led.Dark;
import frc.robot.led.HalfAndHalf;
import frc.robot.led.LedController;
import frc.robot.led.LedFade;
import frc.robot.led.LedRotating;
import frc.robot.led.Snake;
import frc.robot.led.morsecode;
import frc.robot.led.rainbow;

public class Robot extends TimedRobot {

  private LedController ledController = new LedController(60);
 
  @Override
  public void robotInit() {
    ledController.add("halfAndHalf", new HalfAndHalf()); 
    ledController.add("dark", new Dark()); 
    ledController.add("snake", new Snake()); 
    ledController.add("rainbow", new rainbow()); 
    ledController.add("morsecode", new morsecode()); 
    ledController.add("LedRotating", new LedRotating()); 
    ledController.add("LedFade", new LedFade());
  }

  @Override
  public void robotPeriodic() {
    ledController.run();
  }

  @Override
  public void autonomousInit() {
  
  }

  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopInit() {
    ledController.set("LedFade");
  }

  @Override
  public void teleopPeriodic() {
  }

  @Override
  public void disabledInit() {
    ledController.set("dark");
  }

  @Override
  public void disabledPeriodic() {}
}
