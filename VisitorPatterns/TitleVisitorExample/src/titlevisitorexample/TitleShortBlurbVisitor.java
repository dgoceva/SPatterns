/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package titlevisitorexample;

public class TitleShortBlurbVisitor extends TitleBlurbVisitor {
   public void visit(BookInfo bookInfo) {
       this.setTitleBlurb("SB-Book: " + bookInfo.getTitleName());
   }   
   
   public void visit(DvdInfo dvdInfo) {
       this.setTitleBlurb("SB-DVD: " + dvdInfo.getTitleName());
   }
   
   public void visit(GameInfo gameInfo) {
       this.setTitleBlurb("SB-Game: " + gameInfo.getTitleName());
   }
}