package Interface;

public class Hero implements HeroInterface {

    public int health;

    public Hero(int health){
        this.health = health;
    }

    @Override
    public boolean heal() {
        if(health < 100){
            health += 20;
            System.out.println("You used the healing spell, now you have: " + health + " health");
            return true;
        }
        else{
            System.out.println("You got full health!");
            return  false;
        }
    }
}
