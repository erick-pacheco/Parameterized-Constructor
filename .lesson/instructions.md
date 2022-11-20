# Instructions  

  When creating objects, constructors are called to initialize their state. So far, you've mainly worked with **no-args constructors**. These constructors do not take in any values. You may also have seen constructors that *do* take in information. These are called **parameterized constructors**. 

In this activity, we will learn how to create and use parameterized constructors. Please complete the following steps:

  ## Steps
  1. Add in the following code to the Player.java file:
  ```Java
  public class Player {
    
    public String name;
    public String skill;
    public int health;

    public Player() {
      this.name = "Jerry";
      this.skill = "Flappy Flurry Fists";
      this.health = 100;
    }
    
}
  ```
  We created a Player class that defines three instance variables, which is the state, or characteristics, that every Player object will have. We also added a no-args constructor. If this constructor is called, it initializes the state of the object with the name `Jerry`, the skill `Flappy Flurry Fists`, and the starting health of `100`.

  Notice how the `this` keyword is used in the following statement: `this.name = "Jerry";`. The `this` keyword specifies that the variable *name* refers to the state of the object and we're assigning it the String value `Jerry`.
  
  2. Now add the following statements to the *main()* method:
  ```Java
  Player player1 = new Player();
  System.out.println(player1.name);
  System.out.println(player1.skill);
  System.out.println(player1.health);
  ```
  In the first statement, we created a player object and initialized it by calling the no-args constructor for the Player class. We then assigned the object to the reference variable named *player1*. The following statements print out the player's state. Run the program to see the results.

  3. What if you wanted to create a Player object with custom state? We can use a parameterized constructor to do this. Add in the following code inside of your player class:
 ```Java
   public Player(String name, String skill, int health) {
    this.name = name;
    this.skill = skill;
    this.health = health;
  }
 ```
 We added a parameterized constructor. Notice the difference between this constructor and the no-args constructor: This constructor has 3 parameters, one for each of the object's state. 
 
 Notice how the `this` keyword is used in the following statement: `this.name = name;`. The `this` keyword specifies that the variable *name* refers to the state of the object and we're assigning it the String value that is within the parameter called *name*.

 Once this constructor is called, the values that are passed into the constructor are then used to initialize the object's state.
 
  4. To test out our new constructor, add in the following code to the *main()* method, below any code you have so far:
  ```Java
     Player player2 = new Player("Teddy", "Broadsword Slash", 100);
    System.out.println(player2.name);
    System.out.println(player2.skill);
    System.out.println(player2.health);
  ```
  Run the program and see the output. We created a player object with starting values that we chose ourselves. 
  
  5. Now it's your turn. Add in the following class into the Monster.java file:
```Java
public class Monster {

  public String type;
  public String noise;
  public int health;
  
}
```
Our Monster class defines three instance variables.

  6. Create a parameterized constructor that takes in three parameters. The first and second parameters should be of the `String` type and the third parameter should be of the `int` type.
     
  7. In your parameter's code block, have it initialize the object's state using the 'this' keyword. Make sure it initializes all three instance variables.
      
  8. In the *main()* method, create a monster object and pass in the values: `Minotaur`, `ARGGHH`, and `100`. Assign it to a variable named **monster**. 
    
  9. Finally, let's test out what we have so far. Add in the following method to the Player class:
```Java
public void attack(Monster monster) {
    System.out.println(this.name + " attacks the " + monster.type + " and deals 20 damage!");
    monster.health -= 20;

    if (monster.health <= 0) {
      System.out.println("The " + monster.type + " lets out its death scream, \"" + monster.noise + "!\" and then dies.");
    } else {
      System.out.println("The " + monster.type + " is hurt and enraged!");
    }
  }
```
This method takes in a monster object and deals damage to that monster. If the monster has no more health, it dies.

10. In the **main()** method, add in the following code below what you have so far:
```Java
for (int i = 1; i <= 5; i++) {
      player1.attack(monster);
    }
```
We'll have the player attack the monster 5 times until it dies. Run the program and notice the output and run the tests provided.

Sample test output:
```
Jerry
Flappy Flurry Fists
100
Teddy
Broadsword Slash
100
Jerry attacks the Minotaur and deals 20 damage!
The Minotaur is hurt and enraged!
Jerry attacks the Minotaur and deals 20 damage!
The Minotaur is hurt and enraged!
Jerry attacks the Minotaur and deals 20 damage!
The Minotaur is hurt and enraged!
Jerry attacks the Minotaur and deals 20 damage!
The Minotaur is hurt and enraged!
Jerry attacks the Minotaur and deals 20 damage!
The Minotaur lets out its death scream, "ARGGHH!" and then dies.
```
  