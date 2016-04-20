package org.lasa;

import org.lasa.lib.HazyIterative;
import org.lasa.ophseason.input.DriverInput;
import org.lasa.ophseason.subsystem.DriveTrain;

public class Robot extends HazyIterative {
    DriveTrain driveTrain;
    DriverInput driverInput;
    
    @Override
    public void robotInit() {
        driveTrain = DriveTrain.getInstance();
        driverInput = DriverInput.getInstance();
    }
    
    private void initSubsystems() {
        driveTrain.initSubsystem();
    }
    
    @Override
    public void teleopInit() {
        initSubsystems();
    }

    @Override
    public void teleopPeriodic() {
        driverInput.run();
        driveTrain.run();
    }

    @Override
    public void teleopContinuous() {
    }

    @Override
    public void autonomousInit() {
        initSubsystems();
    }

    @Override
    public void autonomousPeriodic() {
    }

    @Override
    public void autonomousContinuous() {
        driveTrain.run();
    }

    @Override
    public void disabledInit() {
        initSubsystems();
    }

    @Override
    public void disabledPeriodic() {
    }

    @Override
    public void disabledContinuous() {
    }

    
}
