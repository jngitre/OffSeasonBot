package org.lasa.lib;

import edu.wpi.first.wpilibj.Joystick;

public class HazyJoystick {
    
    Joystick control;
    double deadband;
    
    public HazyJoystick(int port, double deadband){
        control = new Joystick(port);
        this.deadband = deadband;
    }
    
    public double getLeftX() {
        return handleDeadBand(control.getRawAxis(0));
    }

    public double getLeftY() {
        return handleDeadBand(control.getRawAxis(1));
    }

    public double getLeftTrigger() {
        return handleDeadBand(control.getRawAxis(2));
    }

    public double getRightTrigger() {
        return handleDeadBand(control.getRawAxis(3));
    }

    public double getRightX() {
        return handleDeadBand(control.getRawAxis(4));
    }

    public double getRightY() {
        return handleDeadBand(control.getRawAxis(5));
    }

    public boolean getA() {
        return control.getRawButton(1);
    }

    public boolean getB() {
        return control.getRawButton(2);
    }

    public boolean getX() {
        return control.getRawButton(3);
    }

    public boolean getY() {
        return control.getRawButton(4);
    }

    public boolean getLeftBumper() {
        return control.getRawButton(5);
    }

    public boolean getRightBumper() {
        return control.getRawButton(6);
    }

    public boolean getBack() {
        return control.getRawButton(7);
    }

    public boolean getStart() {
        return control.getRawButton(8);
    }
    
    private double handleDeadBand(double input){
         if (Math.abs(input) > deadband) {
            if (input > 0) {
                return (input - deadband) / (1 - deadband);
            } else {
                return (input + deadband) / (1 - deadband);
            }
        } else {
            return 0.0;
        }
    }
}
