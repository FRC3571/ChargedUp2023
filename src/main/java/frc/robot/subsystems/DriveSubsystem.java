/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import frc.robot.RobotMap;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.motorcontrol.*;

/**
 * TODO: Clean this code up. 
 * 
 * sorry for the mess - Ansh
 */
public class DriveSubsystem extends SubsystemBase {


  // TODO: Add slow speed
  public boolean slow;
  
  // CANSparkMax m_leftMotor = new CANSparkMax(1, MotorType.kBrushless);
  // CANSparkMax Left2 = new CANSparkMax(3, MotorType.kBrushless);
  // CANSparkMax m_rightMotor = new CANSparkMax(2, MotorType.kBrushless);
  // CANSparkMax Right2 = new CANSparkMax(4, MotorType.kBrushless);

  private CANSparkMax spark1, spark2, spark3, spark4;
  private DifferentialDrive m_drive;

  XboxController controller = new XboxController(0); // 0 is the USB Port to be used as indicated on the Driver Station

  /* SPARKMAX CONFIG 
   *   1  3
   * 
   *   2  4
   */

   // TODO: add sparkmax constants to ../RobotMap.java


  // public void initDefaultCommand() {
  //   slow = false;
  // }

  public DriveSubsystem() {

    //TODO: make the variable names a bit more readable
    spark1 = new CANSparkMax(1, MotorType.kBrushless);
    spark2 = new CANSparkMax(2, MotorType.kBrushless);
    spark3 = new CANSparkMax(3, MotorType.kBrushless);
    spark4 = new CANSparkMax(4, MotorType.kBrushless);

    MotorControllerGroup m_left = new MotorControllerGroup(spark1, spark2);
    MotorControllerGroup m_right = new MotorControllerGroup(spark3, spark4);

    m_drive = new DifferentialDrive(m_left, m_right);

    //m_leftMotor.restoreFactoryDefaults();
    //m_rightMotor.restoreFactoryDefaults();
  }

  @Override
  public void periodic() {

<<<<<<< HEAD
    // not exactly sure how else to implement this
    m_drive.tankDrive(-controller.getLeftY(), -controller.getRightY());
    // This method will be called once per scheduler run
=======
  public void ArcadeDrive (double speed, double turn) {
    myRobot.tankDrive((speed - turn) * 0.5, (speed + turn) * 0.5);
>>>>>>> 7fc30cc314aed71cd9eee9e4e4f7bb32ec73ce1a
  }


}
