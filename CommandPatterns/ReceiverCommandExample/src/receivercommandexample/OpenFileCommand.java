/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receivercommandexample;

public class OpenFileCommand implements Command {

	private FileSystemReceiver fileSystem;
	
	public OpenFileCommand(FileSystemReceiver fs){
		this.fileSystem=fs;
	}
	@Override
	public void execute() {
		//open command is forwarding request to openFile method
		this.fileSystem.openFile();
	}

}