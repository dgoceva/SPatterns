/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibilityclient;

public abstract class Logger {  
    public static int OUTPUTINFO=1;  
    public static int ERRORINFO=2;  
    public static int DEBUGINFO=3;  
    protected int levels;  
    protected Logger nextLevelLogger;  
    public void setNextLevelLogger(Logger nextLevelLogger) {  
        this.nextLevelLogger = nextLevelLogger;  
    }  
        public void logMessage(int levels, String msg){  
        if(this.levels<=levels){  
            displayLogInfo(msg);  
        }  
        if (nextLevelLogger!=null) {  
            nextLevelLogger.logMessage(levels, msg);  
        }  
    }  
    protected abstract void displayLogInfo(String msg);  
}  