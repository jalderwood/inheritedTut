interface Usable {
    default void use(Dueler target){
        System.out.println("default used: "+ target.name + this);
    }
}