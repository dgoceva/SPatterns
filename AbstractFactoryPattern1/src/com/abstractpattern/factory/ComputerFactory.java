package com.abstractpattern.factory;

import com.abstractpattern.computer.Computer;

public class ComputerFactory {
	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}

}
