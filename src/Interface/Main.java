package Interface;

public class Main {

    public static void main(String[] args) {

        Hero hero = new Hero(100);
        System.out.println("Before he took damage his health was: " + hero.health);

        hero.health -= 20;
        System.out.println("The health of the hero is: " + hero.health);

        hero.heal();


    }
}
