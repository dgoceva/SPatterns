/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibilityclient;

public class ErrorBasedLogger extends Logger {  
    public ErrorBasedLogger(int levels) {  
        this.levels=levels;  
    }  
    @Override  
    protected void displayLogInfo(String msg) {  
        System.out.println("ERROR LOGGER INFO: "+msg);  
    }  
}// End of the ErrorBasedLogger class.  