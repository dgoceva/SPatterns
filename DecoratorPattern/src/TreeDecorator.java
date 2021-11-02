
public class TreeDecorator implements ChristmasTree {

    private ChristmasTree tree;
    
   @Override
    public String decorate() {
        return tree.decorate();
    }

	public TreeDecorator(ChristmasTree tree) {
		super();
		this.tree = tree;
	}

}
