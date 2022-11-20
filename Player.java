public class Player {

  public String name;
  public String skill;
  public int health;

  public Player() {
    this.name = "Jerry";
    this.skill = "Flappy Flurry Fists";
    this.health = 100;
  }

  public Player(String name, String skill, int health) {
    this.name = name;
    this.skill = skill;
    this.health = health;
  }

  public void attack(Monster monster) {
    String message = this.name + " attacks the " + monster.type + " and deals 20 damage!";
    Console.log(message);
    monster.health -= 20;

    if (monster.health <= 0) {
      String message1 = "The " + monster.type + " lets out its death scream, \"" + monster.noise + "!\" and then dies.";
      Console.log(message1);
    } else {
      String message2 = "The " + monster.type + " is hurt and enraged!";
      Console.log(message2);
    }
  }

}