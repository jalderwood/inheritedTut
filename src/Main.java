public class Main {
    public static void main(String[] args) {

        Usable h = new _A_List_Health_Potion();

        Card health = new Card("health",h);

        Card indio = new Card("indio");
        Dueler edgar = new Dueler("edgar");
        Dueler jaime = new Dueler("jaime");
        DuelerA adam = new DuelerA("adam");
        DuelerB bob = new DuelerB("bob");
        DuelerC ciaran = new DuelerC("ciaran");
        edgar.use(health);
//        indio.use(edgar);
//        edgar.use(indio);
//        jaime.use(edgar);
//
//        adam.use(ciaran);
//        adam.use(health);

    }
}
