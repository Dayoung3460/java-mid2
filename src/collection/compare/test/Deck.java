package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
  private List<Card> cards = new ArrayList<>();

  public Deck() {
    initCard();
    shuffle();
  }

  private void shuffle() {
    Collections.shuffle(cards);
  }

  private void initCard() {
    for (int i = 1; i <= 13; i++) {
      // Suit.values(): Suit의 상수값들을 배열로 반환함
      for (Suit suit : Suit.values()) {
        cards.add(new Card(i, suit));
      }
    }
  }

  public Card drawCard() {
    // List에서 데이터를 앞에서부터 꺼내고 있음
    // 맨 앞에꺼 꺼내면 나머지 뒤에 있는 애들을 앞으로 다 밀어야겠지
    // 데이터가 많으면 LinkedList 고려.
    // 지금은 사이즈가 52개라서 이정도는 뭐 걍 ArrayList
    // removeFirst(): remove(0)이랑 같은건데 자바 21부터 가능
    return cards.removeFirst();
  }
}
