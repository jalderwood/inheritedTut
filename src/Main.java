import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Cardset c = new Cardset();

        Card health = new Card("health", c.a_list);
        Dueler edgar = new Dueler("edgar");
        Dueler indio = new Dueler("indio");

        System.out.println("edgar about to take health \ncurrent health is " + edgar.health);
        // dueler uses this syntax with a Card
        edgar.use(health);

        // this syntax is also valid (calling behavior on target)
        c.plus.use(indio);
    }
}
