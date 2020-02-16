public class Main {
    public static void main(String[] args) {

        Cardset c = new Cardset();

        Card health = new Card("health", c.a_List_Health_Potion);
        Dueler edgar = new Dueler("edgar");
        Dueler indio = new Dueler("indio");

        System.out.println("edgar about to take health \ncurrent health is " + edgar.health);
        // dueler uses this syntax with a Card
        edgar.use(health);

        // this syntax is also valid (calling behavior on target)
        c.plus_Ultra.use(indio);
    }
}
