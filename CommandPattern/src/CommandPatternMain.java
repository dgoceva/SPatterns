
public class CommandPatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 version
		TextFileOperationExecutor textFileOperationExecutor
		= new TextFileOperationExecutor();
		System.out.println(textFileOperationExecutor.executeOperation(
				new OpenTextFileOperation(new TextFile("file1.txt"))));
		System.out.println(textFileOperationExecutor.executeOperation(
				new SaveTextFileOperation(new TextFile("file2.txt"))));
		
		// 2 version
		System.out.println(textFileOperationExecutor.executeOperation(() -> 
				"Opening file1.txt"));
		System.out.println(textFileOperationExecutor.executeOperation(() -> 
				"Saving file1.txt"));

		// 3 version
		TextFile textFile = new TextFile("file1.txt");
		System.out.println(
				textFileOperationExecutor.executeOperation(textFile::open));
		System.out.println(
				textFileOperationExecutor.executeOperation(textFile::save));
		
		// functor pattern invoke
		functorPattern(() ->{
			System.out.println("hello " + Thread.currentThread().getName());
		});
		
	}
	
	public static void functorPattern(Runnable method) {
		for(int i = 0; i < 2; i++)
		       method.run();
		Thread t;
		for(int i=0;i<10;i++) {
			t = new Thread(method);
			t.start();
			t.interrupt();
		}
		
	}

}
