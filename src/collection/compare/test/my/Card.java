package collection.compare.test.my;

import java.util.HashMap;

public class Card implements Comparable<Card> {
  private Integer num;
  private String shape;

  public Card(Integer num, String shape) {
    this.num = num;
    this.shape = shape;
  }

  public Integer getNum() {
    return num;
  }

  public String getShape() {
    return shape;
  }

  @Override
  public String toString() {
    String result = null;

    HashMap<String, String> shapeCode = new HashMap<>();
    shapeCode.put("s", "\u2660");
    shapeCode.put("h", "\u2665");
    shapeCode.put("d", "\u2666");
    shapeCode.put("c", "\u2663");

    for (String key : shapeCode.keySet()) {
      if (key.equals(shape)) {
        result = num + "(" + shapeCode.get(key) + ")";
      }
    }
    return result;
  }

  @Override
  public int compareTo(Card card) {
    return this.num.compareTo(card.num);
  }
}
