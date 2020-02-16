public class Card {

    String name;

    Usable behavior;

    Card(String name){
        this.name = name;
    }
    Card(String name, Usable b){
        behavior = b;
    }

    public void use(Card card){
        System.out.println("Card.use: " + this.name + " is " + this.getClass() + " with " + card);
    }

    public void setBehavior(Usable b){
        behavior = b;
    }

}
