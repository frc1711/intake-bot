package org.usfirst.frc.team1711.robot.subsystems;

import org.usfirst.frc.team1711.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Manipulator extends Subsystem {

    TalonSRX manipTalonLeft;
    TalonSRX manipTalonRight;
    
    public Manipulator()
    {
    	manipTalonLeft = new TalonSRX(RobotMap.manipMotorLeft);
    	manipTalonRight = new TalonSRX(RobotMap.manipMotorRight);
    }
    
    public void runLeftSide(double speed)
    {
    	manipTalonLeft.set(ControlMode.PercentOutput, speed);
    }
    
    public void runRightSide(double speed)
    {
    	manipTalonRight.set(ControlMode.PercentOutput, speed);
    }
    
    public void stopManipulator()
    {
    	manipTalonLeft.set(ControlMode.PercentOutput, 0);
    	manipTalonRight.set(ControlMode.PercentOutput, 0);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

