public class DuelerC extends Dueler {
    DuelerC(String name) {
        super(name);
    }
    // C against A, disadvantage path
    public void use(DuelerA card){
        System.out.println("DuelerA.use (DuelerA): " + this.name + " is " + this.getClass() + " with " + card);
    }
    // C with itself / evolution
    public void use(DuelerC card){
        System.out.println("DuelerA.use (DuelerB): " +  this.name + " is " + this.getClass() + " with " + card);
    }
    // C against other Duelers
    public void use(Dueler card){
        System.out.println("DuelerA.use (DuelerB): " +  this.name + " is " + this.getClass() + " with " + card);
    }
}
