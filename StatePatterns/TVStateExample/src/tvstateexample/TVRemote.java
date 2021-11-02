/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvstateexample;

public class TVRemote {

	public static void main(String[] args) {
		TVContext context = new TVContext();
		State tvStartState = new TVStartState();
		State tvStopState = new TVStopState();
		
		context.setState(tvStartState);
		context.doAction();
		
		
		context.setState(tvStopState);
		context.doAction();
		
	}

}