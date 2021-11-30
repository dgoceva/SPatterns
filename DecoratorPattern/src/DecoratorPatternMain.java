
public class DecoratorPatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChristmasTree tree1 = new Garland(new ChristmasTreeImpl()); 
		System.out.println(tree1.decorate());
		
		ChristmasTree tree2 = new BubbleLight(new Garland(new ChristmasTreeImpl()));
		System.out.println(tree2.decorate());
	}

}
