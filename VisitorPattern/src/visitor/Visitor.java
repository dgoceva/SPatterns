package visitor;

import shape.Circle;
import shape.CompoundShape;
import shape.Dot;
import shape.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);

}
