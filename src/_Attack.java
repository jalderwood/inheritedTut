public class _Attack implements Usable {
    public void use(Card source, Dueler target){
        target.receiveDamage(5);
        System.out.println(source.name + " attacked " + target.name);
    }
}
