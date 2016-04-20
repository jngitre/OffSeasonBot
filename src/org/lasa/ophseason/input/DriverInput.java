/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lasa.ophseason.input;

import org.lasa.lib.HazyJoystick;
import org.lasa.ophseason.subsystem.DriveTrain;

public class DriverInput implements Runnable {

    HazyJoystick drive = new HazyJoystick(0,0);
    
    private static DriverInput instance;
    
    private final DriveTrain driveTrain;
    
    private DriverInput(){
        driveTrain = DriveTrain.getInstance();
    }
    
    public static DriverInput getInstance(){
        return (instance == null) ? instance = new DriverInput() : instance;
    }
    
    private void input(){
        
    }
    
    @Override
    public void run() {
        input();
    }
    
}
