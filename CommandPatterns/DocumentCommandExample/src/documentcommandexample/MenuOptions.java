/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documentcommandexample;

public class MenuOptions {

	private ActionListenerCommand openCommand;
    private ActionListenerCommand saveCommand;
 
    public MenuOptions(ActionListenerCommand open, ActionListenerCommand save) {
        this.openCommand = open;
        this.saveCommand = save;
    }
    public void clickOpen(){
       openCommand.execute();
    }
    public void clickSave(){
      saveCommand.execute();
    }

	
}
