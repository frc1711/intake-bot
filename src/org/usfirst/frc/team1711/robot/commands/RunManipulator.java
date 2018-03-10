package org.usfirst.frc.team1711.robot.commands;

import org.usfirst.frc.team1711.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RunManipulator extends Command {

    public RunManipulator() {
        requires(Robot.intake);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.intake.stopManipulator();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() 
    {
    	if(Robot.oi.stick.getRawAxis(1) > 0.1)
    	{
    		Robot.intake.runLeftSide(Robot.oi.stick.getRawAxis(1));
    	}
    	if(Robot.oi.stick.getRawAxis(5) > 0.1)
    	{
    		Robot.intake.runLeftSide(Robot.oi.stick.getRawAxis(5));
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.intake.stopManipulator();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.intake.stopManipulator();
    }
}
