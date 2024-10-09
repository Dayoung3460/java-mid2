package collection.compare.test.my;

import java.util.ArrayList;
import java.util.Collections;

public class CardGameMain {
  public static void main(String[] args) {
    // 카드는 1~ 13까지 있고
    // 문양은 s, h, d, c
    // 총 13 * 4 = 52장
    // 2명이 진행

    // 덱에 있는 카드 랜덤하게 섞기
    // 각 플레이어는 5장씩 뽑음
    // 뽑으 카드 정렬된 순서대로 출력
    // 작은 숫자가 먼저, 같은 숫자의 경우 s, h, d, c 순으로 보여줌
    // 카드 숫자의 합계가 큰 사람이 승리. 합계가 같으면 무승부

    ArrayList<Integer> numbers = new ArrayList<>();
    ArrayList<String> shapes = new ArrayList<>();
    ArrayList<Card> deck = new ArrayList<>();

    for (int i = 1; i <= 13; i++) {
      numbers.add(i);
    }
    shapes.add("s");
    shapes.add("h");
    shapes.add("d");
    shapes.add("c");

    for (Integer num : numbers) {
      for (String shape : shapes) {
        Card card = new Card(num, shape);
        deck.add(card);
      }
    }
    Collections.shuffle(deck);

    ArrayList<Card> player1Cards = new ArrayList<>();
    ArrayList<Card> player2Cards = new ArrayList<>();

    int player1NumSum = 0;
    int player2NumSum = 0;

    for (int i = 0; i < 5; i++) {
      player1Cards.add(deck.remove(i));
      player1NumSum += deck.get(i).getNum();
    }


    for (int i = 0; i < 5; i++) {
      player2Cards.add(deck.remove(i));
      player2NumSum += deck.get(i).getNum();
    }
    player1Cards.sort(null);
    player2Cards.sort(null);
    player1Cards.sort(new shapeComparator());
    player2Cards.sort(new shapeComparator());

    System.out.print("플레이어1의 카드: ");
    System.out.println(player1Cards + ",  합계: " + player1NumSum);
    System.out.print("플레이어2의 카드: ");
    System.out.println(player2Cards + ",  합계: " + player2NumSum);

    if (player1NumSum > player2NumSum) {
      System.out.println("플레이어1 승리");
    } else if (player1NumSum < player2NumSum) {
      System.out.println("플레이어2 승리");
    } else {
      System.out.println("무승부");
    }
  }
}
