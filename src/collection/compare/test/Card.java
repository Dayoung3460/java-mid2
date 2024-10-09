package collection.compare.test;

public class Card implements Comparable<Card> {
  private final int rank;
  private final Suit suit;

  public Card(int rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public int getRank() {
    return rank;
  }

  @Override
  public int compareTo(Card anotherCard) {
    if (this.rank != anotherCard.rank) {
      return Integer.compare(this.rank, anotherCard.rank);
    } else {
      // Suit 타입은 Enum class를 상속받고 있음
      // Enum은 자바에서 Comparable를 구현하고 있음
      // Comparable의 메소드인 compareTo는 Suit에서 객체를 생성한 순서대로 비교를 함
      // 즉, SPADE("♠"),
      //  HEART("❤"),
      //  DIAMOND("⬥"),
      //  CLUB("♣") 순서임
      // 이넘에서 구현하고 있는 compareTo 메소드는 final이라서 Suit에서 따로 오버라이딩해서 사용할 수 없음
      // 재정의하고 싶으면 비교자를 직접 만들어야함
      return this.suit.compareTo(anotherCard.suit);
    }
  }

  @Override
  public String toString() {
    return rank + "(" + suit.getIcon() + ")";
  }
}
