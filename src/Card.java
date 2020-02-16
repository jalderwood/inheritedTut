public class Card implements Usable {

    String name = "none";
    String team = "none";

    Usable behavior = new Usable(){
        public void use(Dueler target){
            // roll your own
        }
    };

    Card(String name){
        this.name = name;
    }

    Card(String name, Usable behavior){
        this.name = name;
        this.behavior = behavior;
    }

    public void setBehavior(Usable behavior){
        this.behavior = behavior;
    }

    public void use(Card card){
        System.out.println("Card.use: " + this.name + " is " + this.getClass() + " with " + card);
    }

    public void setBehavior(Card card){
        this.behavior = card.behavior;
    }
}
