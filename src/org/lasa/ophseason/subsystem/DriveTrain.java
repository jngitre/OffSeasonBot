package org.lasa.ophseason.subsystem;

import edu.wpi.first.wpilibj.VictorSP;
import org.lasa.ophseason.statics.Ports;


public class DriveTrain extends Subsystem implements Runnable {
    
    private static DriveTrain instance;
    
    private final VictorSP leftFrontMotor;
    private final VictorSP leftBackMotor;
    private final VictorSP rightFrontMotor;
    private final VictorSP rightBackMotor;
    
    private double leftSpeed;
    private double rightSpeed;
    
    private DriveTrain() {
        leftFrontMotor = new VictorSP(Ports.LEFT_FRONT_MOTOR);
        leftBackMotor = new VictorSP(Ports.LEFT_BACK_MOTOR);
        rightFrontMotor = new VictorSP(Ports.RIGHT_FRONT_MOTOR);
        rightBackMotor = new VictorSP(Ports.RIGHT_BACK_MOTOR);
    }
    
    public static DriveTrain getInstance() {
        return (instance == null) ? instance = new DriveTrain() : instance;
    }
    
    @Override
    public void initSubsystem() {
    }

    @Override
    public void run() {
        leftFrontMotor.set(leftSpeed);
        leftBackMotor.set(leftSpeed);
        rightFrontMotor.set(rightSpeed);
        rightBackMotor.set(rightSpeed);
    }

//    @Override
//    public void pushToDashboard() {
//    }

}
