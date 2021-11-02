
public class SaveTextFileOperation implements TextFileOperation {

    private TextFile textFile;

	public SaveTextFileOperation(TextFile textFile) {
		super();
		this.textFile = textFile;
	}

	@Override
	public String execute() {
		// TODO Auto-generated method stub
		return textFile.save();
	}

}
