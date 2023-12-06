/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadepatternteaexample;

public class FacadeWater {  
   boolean waterIsBoiling; 
    
   public FacadeWater() {
       setWaterIsBoiling(false);
       System.out.println("behold the wonderous water");       
   }
   
   public void boilFacadeWater() {
       setWaterIsBoiling(true);
       System.out.println("water is boiling");
   }
   
   public void setWaterIsBoiling(boolean isWaterBoiling) {
       waterIsBoiling = isWaterBoiling;
   }
   public boolean getWaterIsBoiling() {
       return waterIsBoiling;
   }
}