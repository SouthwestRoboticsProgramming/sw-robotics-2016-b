// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2129.swRobotics2016b;

import org.usfirst.frc2129.swRobotics2016b.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
    
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton buttonShooterIntake;
    public JoystickButton buttonElevatorUp;
    public JoystickButton buttonElevatorDown;
    public JoystickButton buttonRollerIntake;
    public JoystickButton buttonRollerOutput;
    public Joystick joystickLeft;
    public JoystickButton buttonShooterFire;
    public JoystickButton buttonShooterSpinUp;
    public Joystick joystickRight;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
    	System.out.println("swRobotics2016b swRobotics2016b swRobotics2016b swRobotics2016b swRobotics2016b swRobotics2016b swRobotics2016b swRobotics2016b");
    	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        joystickRight = new Joystick(1);
        
        buttonShooterSpinUp = new JoystickButton(joystickRight, 2);
        buttonShooterSpinUp.whileHeld(new CommandGroupSpinUp());
        buttonShooterFire = new JoystickButton(joystickRight, 1);
        buttonShooterFire.whenPressed(new CommandGroupFire());
        joystickLeft = new Joystick(0);
        
        buttonRollerOutput = new JoystickButton(joystickLeft, 5);
        buttonRollerOutput.whileHeld(new CommandRollerOutput());
        buttonRollerIntake = new JoystickButton(joystickLeft, 4);
        buttonRollerIntake.whileHeld(new CommandRollerIntake());
        buttonElevatorDown = new JoystickButton(joystickLeft, 3);
        buttonElevatorDown.whileHeld(new CommandElevatorLower());
        buttonElevatorUp = new JoystickButton(joystickLeft, 2);
        buttonElevatorUp.whileHeld(new CommandElevatorRaise());
        buttonShooterIntake = new JoystickButton(joystickLeft, 1);
        buttonShooterIntake.whileHeld(new CommandSpinnersInput());


        // SmartDashboard Buttons
        SmartDashboard.putData("CommandGroupLaunch", new CommandGroupLaunch());
        SmartDashboard.putData("CommandGroupPickUpBall", new CommandGroupPickUpBall());
        SmartDashboard.putData("CommandGroupSpinUp", new CommandGroupSpinUp());
        SmartDashboard.putData("CommandGroupFire", new CommandGroupFire());
        SmartDashboard.putData("CommandElevatorRaise", new CommandElevatorRaise());
        SmartDashboard.putData("CommandElevatorLower", new CommandElevatorLower());
        SmartDashboard.putData("CommandElevatorStop", new CommandElevatorStop());
        SmartDashboard.putData("CommandRollerStop", new CommandRollerStop());
        SmartDashboard.putData("CommandRollerOutput", new CommandRollerOutput());
        SmartDashboard.putData("CommandSpinnersOutput", new CommandSpinnersOutput());
        SmartDashboard.putData("CommandSpinnersInput", new CommandSpinnersInput());
        SmartDashboard.putData("CommandSpinnersStop", new CommandSpinnersStop());
        SmartDashboard.putData("CommandPusherSetOut", new CommandPusherSetOut());
        SmartDashboard.putData("CommandPusherSetIn", new CommandPusherSetIn());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    
        // Display status of Scheduler in SmartDashboard. This displays
        // all the commands and "Cancel" buttons for each command. 
        // ==========================================================
        SmartDashboard.putData(Scheduler.getInstance());
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getJoystickLeft() {
        return joystickLeft;
    }

    public Joystick getJoystickRight() {
        return joystickRight;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

