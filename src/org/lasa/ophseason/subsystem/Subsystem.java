package org.lasa.ophseason.subsystem;

import org.lasa.ophseason.input.SensorInput;

public abstract class Subsystem {

    protected SensorInput sensorInput;

    protected String errorMsg;
    protected final String fileName = "logger.csv";

    protected Subsystem() {
    }

    public abstract void run();

    public abstract void initSubsystem();

    public abstract void pushToDashboard();
}
