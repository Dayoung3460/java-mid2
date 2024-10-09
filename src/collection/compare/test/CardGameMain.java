package collection.compare.test;

public class CardGameMain {
  public static void main(String[] args) {
    Deck deck = new Deck();
    Player player1 = new Player("플레이어1");
    Player player2 = new Player("플레이어2");

    for (int i = 0; i < 5; i++) {
      player1.drawCard(deck);
      player2.drawCard(deck);
    }

    player1.showHand();
    player2.showHand();

    // Player winner;
    // 이렇게 변수 선언해 놓고 로직 쭉쭉 짜다가
    // 밑에서 winner에 값을 넣는 방식 보다
    // 변수 선언 동시에 값을 넣어주는게 좋음
    // 그래서 메소드로 뺀거.
    // 메소드롤 뽑는 기준을
    // 그 메소드를 재사용 안하면 굳이 안 뽑아도 된다고 생각했는데
    // 이런 이점 때문에 메소드를 따로 뺄 수도 있구나!
    Player winner = getWinner(player1, player2);

    if (winner != null) {
      System.out.println(winner.getName() + " 승리");
    } else {
      System.out.println("무승부");
    }
  }

  private static Player getWinner(Player player1, Player player2) {
    int sum1 = player1.rankSum();
    int sum2 = player2.rankSum();

    if (sum1 > sum2) {
      return player1;
    } else if (sum1 == sum2) {
      return null;
    } else {
      return player2;
    }
  }
}
