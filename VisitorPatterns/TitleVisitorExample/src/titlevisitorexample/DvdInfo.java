/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package titlevisitorexample;

public class DvdInfo extends AbstractTitleInfo {  
   private String star;
   private char encodingRegion;
    
   public DvdInfo(String titleName, 
                  String star, 
                  char encodingRegion) {
       this.setTitleName(titleName);
       this.setStar(star);
       this.setEncodingRegion(encodingRegion);
   }    
   
   public void setStar(String starIn) {
       this.star = starIn;
   }
   public String getStar() {
       return this.star;
   }
   public void setEncodingRegion(char encodingRegionIn) {
       this.encodingRegion = encodingRegionIn;
   }
   public char getEncodingRegion() {
       return this.encodingRegion;
   }
   
   public void accept(TitleBlurbVisitor titleBlurbVisitor) {
       titleBlurbVisitor.visit(this);
   } 
}