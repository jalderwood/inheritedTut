public class Dueler extends Card {

    Usable attackBehavior = new _Attack();

    String team;

    int damage = 0;
    int health = 100;

    public Dueler(String name, String team) {
        super(name);
        this.team = team;
    }

    public Dueler(String name) {
        super(name);
    }

    public void use(Card card){
        behavior.use(card);
        System.out.println("Dueler.use (Dueler): " + this.name + " is " + this.getClass() + " with " + card);
    }

    void receiveDamage(int d){
        this.health -= d;
        System.out.println(this.name + " just took " + damage + "damage." );
    }

    void heal(){
        health = 100;
    }
}