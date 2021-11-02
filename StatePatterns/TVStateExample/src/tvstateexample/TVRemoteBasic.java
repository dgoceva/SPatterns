/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvstateexample;

public class TVRemoteBasic {

	private String state="";
	
	public void setState(String state){
		this.state=state;
	}
	
	public void doAction(){
		if(state.equalsIgnoreCase("ON")){
			System.out.println("TV is turned ON");
		}else if(state.equalsIgnoreCase("OFF")){
			System.out.println("TV is turned OFF");
		}
	}

	public static void main(String args[]){
		TVRemoteBasic remote = new TVRemoteBasic();
		
		remote.setState("ON");
		remote.doAction();
		
		remote.setState("OFF");
		remote.doAction();
	}

}