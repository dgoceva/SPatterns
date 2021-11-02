/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package titlevisitorexample;

public class TitleLongBlurbVisitor extends TitleBlurbVisitor {
   public void visit(BookInfo bookInfo) {
       this.setTitleBlurb("LB-Book: " + 
                           bookInfo.getTitleName() + 
                           ", Author: " + 
                           bookInfo.getAuthor());
   }   
   
   public void visit(DvdInfo dvdInfo) {
       this.setTitleBlurb("LB-DVD: " + 
                           dvdInfo.getTitleName() + 
                           ", starring " + 
                           dvdInfo.getStar() + 
                           ", encoding region: " + 
                           dvdInfo.getEncodingRegion());
   }   
   
   public void visit(GameInfo gameInfo) {
       this.setTitleBlurb("LB-Game: " + 
                           gameInfo.getTitleName());
   }   
}