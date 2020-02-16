public class DuelerA extends Dueler {
    DuelerA(String name) {
        super(name);
    }
    // A with itself / (don't need this)
    public void use(DuelerA card){
        System.out.println("DuelerA.use(DuelerA): " + this.name + " is " + this.getClass() + " with " + card);
    }
    // A against other Duelers
    public void use(Dueler card){
        System.out.println("DuelerA.use(DuelerB): " +  this.name + " is " + this.getClass() + " with " + card);
    }
    // A against C, advantage
    public void use(DuelerC card){
        System.out.println("DuelerA.use(DuelerC): " +  this.name + " is " + this.getClass() + " with " + card);
    }
    public void use(Card any){
        System.out.println(("we came in to testme, its'a riot." + any.name));
    }
}
