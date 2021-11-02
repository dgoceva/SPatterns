/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvstateexample;

public class TVContext implements State {

	private State tvState;

	public void setState(State state) {
		this.tvState=state;
	}

	public State getState() {
		return this.tvState;
	}

	@Override
	public void doAction() {
		this.tvState.doAction();
	}

}