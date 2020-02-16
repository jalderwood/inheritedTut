public class _A_List_Health_Potion implements Usable {
    public void use(Card c, Dueler d){
        d.setBehavior(c.behavior);
//        d.heal();
        System.out.println("healing?" + d.name);
    }
}
