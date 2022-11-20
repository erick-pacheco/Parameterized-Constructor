class Main {
  public static void main(final String[] args) {
    Player player1 = new Player();
    Player player2 = new Player("Teddy", "Broadsword Slash", 100);
    Monster monster1 = new Monster("Minotaur", "ARGGHH", 100);

    Console.log(player1.name);
    Console.log(player1.skill);
    Console.log(player1.health);

    Console.log(player2.name);
    Console.log(player2.skill);
    Console.log(player2.health);

    /* Section 10 */
    for (int k = 1; k <= 5; k++) {
      player1.attack(monster1);
    }

  }
}