// most fields in this class are for testing purposes.
// need to bring in isaac's work

public class Dueler extends Card {

    String team;    // could be an enum if that makes anyone feel better
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
     * @param card a non-dueler ("trainer") card
     */
    public void use(Card card){
        card.behavior.use(this);
        System.out.println("Dueler.use(Card): " + this.name + " is " + this.getClass() + " with " + card);
    }

    /**
     * Attack.
     * Uses Dueler's attack behavior on target.
     * @param target Dueler to attack
     */
    public void use(Dueler target){
        this.attack.use(target);
        System.out.println("Dueler.use(Dueler): " + this.name + " is " + this.getClass() + attack);
    }

    /**
     * Alternate semantics if you like.
     * @param target Dueler to attack
     */
    void attack(Dueler target){
        this.use(target);
    }

    /**
     * Gets behavior from Card.
     * Not public.
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