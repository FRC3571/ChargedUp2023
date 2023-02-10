/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import frc.robot.RobotMap;

import edu.wpi.first.wpilibj2.command.SubsystemBase;




import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
/**
 * Add your docs here.
 */
public class DriveSubsystem extends SubsystemBase {

  public boolean slow;
  
  CANSparkMax Left1;
  CANSparkMax Left2;
  CANSparkMax Right1;
  CANSparkMax Right2;

  // public void initDefaultCommand() {
  //   slow = false;
  // }

  public void TankDrive (double left, double right) {

    // if (slow) {
    //   left *= 0.80;
    //   right *= 0.80;
    // }

    // Drive the left and right sides of the talons
    Left1.set(ControlMode.PercentOutput,left);
    Left2.set(ControlMode.PercentOutput,left);
    Right1.set(ControlMode.PercentOutput,-right);
    Right2.set(ControlMode.PercentOutput,-right);

    // Left1.configPeakOutputForward(1);
    // Left1.configPeakOutputReverse(-1);
    // Left2.configPeakOutputForward(1);
    // Left2.configPeakOutputReverse(-1);
    // Right1.configPeakOutputForward(1);
    // Right1.configPeakOutputReverse(-1);
    // Right2.configPeakOutputForward(1);
    // Right2.configPeakOutputReverse(-1);


    
    // Left1.setInverted(true);
    // Left2.setInverted(true);
    // Right1.setInverted(false);
    // Right2.setInverted(false);


    // System.out.println("Running Left:" + left + "\tRunning Right:" + right);
  }

  // public void setMotorPercent(double percent) {

  //   Left1.set(ControlMode.PercentOutput, percent);
  //   Left2.set(ControlMode.PercentOutput, percent);
  //   Right1.set(ControlMode.PercentOutput, percent);
  //   Right2.set(ControlMode.PercentOutput, percent);

  // }


    


  public void ArcadeDrive (double speed, double turn) {
    TankDrive((speed - turn) * 0.5, (speed + turn) * 0.5);
  }

}
