interface Usable {
    default void use(){
        System.out.println("default used");
    }
    default void use(Card c){
        System.out.println("default method that takes Usable?");
    }
    void use(Card source, Dueler target);
}
