public class Dueler extends Card {

    String team;
    Usable attack = new Usable(){public void use(Dueler d){d.inflictDamage(50);}};

    int damage = 0;
    int health = 50;

    public Dueler(String name, String team) {
        super(name);
        this.team = team;
    }

    public Dueler(String name) {
        super(name);
    }

    /**
     * Dueler uses card
     * @param card a non-dueler (powerup) card
     */
    public void use(Card card){
        card.behavior.use(this);
        System.out.println("Dueler.use (Card): " + this.name + " is " + this.getClass() + " with " + card);
    }

    /**
     * Attack.
     * Uses this attack behavior on target.
     * @param target dueler
     */
    public void use(Dueler target){
        this.attack.use(target);
        System.out.println("Dueler.use (Dueler): " + this.name + " is " + this.getClass() + attack);
    }

    /**
     * Alternate semantic. Ok to delete.
     * @param target dueler to attack
     */
    void attack(Dueler target){
        this.use(target);
    }

    /**
     * Sets behavior based on card.
     * @param card
     */
    public void setBehavior(Card card){
        this.behavior = card.behavior;
    }

///// test methods. ok to delete

    void receiveDamage(int d) {
        this.health -= d;
        System.out.println(this.name + " just took " + damage + "damage.");
    }

    void inflictDamage(int d){
        this.damage += d;
        System.out.println("i'm hit!");
    }
    void heal(){
        this.health = 100;
        System.out.println(this.name + " is feeling much better with " + this.health + " health");
    }
}