
public class Garland extends TreeDecorator {

	public Garland(ChristmasTree tree) {
		super(tree);
		// TODO Auto-generated constructor stub
	}

    public String decorate() {
        return super.decorate() + decorateWithGarland();
    }
     
    private String decorateWithGarland() {
        return " with Garland";
    }

}
