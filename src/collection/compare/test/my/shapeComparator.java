package collection.compare.test.my;

import java.util.Comparator;
import java.util.HashMap;

public class shapeComparator implements Comparator<Card> {
  @Override
  public int compare(Card o1, Card o2) {
    HashMap<String, Integer> shapes = new HashMap<>();
    shapes.put("s", 1);
    shapes.put("h", 2);
    shapes.put("d", 3);
    shapes.put("c", 4);
    if (o1.getNum() == o2.getNum()) {
      return shapes.get(o1.getShape()).compareTo(shapes.get(o2.getShape()));
    } else {
      return 0;
    }

  }
}
