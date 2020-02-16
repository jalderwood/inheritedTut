// working // aside from moving a lot of isaac's code into these methods.
// thinking we could load one of these as a static in the Usable interface

import java.util.HashMap;

/**
 * Cardset is a one stop shop for Card creation,
 * a container class for all Usables, with a map that
 * links input file strings to strategy instances.
 *
 * When instantiated it contains an instance of each strategy
 * which can be used in Card constructors.
 */
public class Cardset implements Usable {

    Cardset() {
        System.out.println("creating cardset");
    }

    _A_List_Health_Potion a_list = new _A_List_Health_Potion();
    _B_List_Health_Potion b_list = new _B_List_Health_Potion();
    _C_List_Health_Potion c_list = new _C_List_Health_Potion();
    _X_List_Health_Potion x_list = new _X_List_Health_Potion();
    _Instant_Confrontation instant = new _Instant_Confrontation();
    _Recover recover = new _Recover();
    _Plus_Ultra plus = new _Plus_Ultra();
    _Lucky_Draw lucky = new _Lucky_Draw();
    _Status_Advance status = new _Status_Advance();

    _Puppy_Xylo p_xylo = new _Puppy_Xylo();
    _Kitten_Xin k_xin = new _Kitten_Xin();
    _Puppy_Claire p_claire = new _Puppy_Claire();
    _Kitten_Carlos k_carlos = new _Kitten_Carlos();
    _Puppy_Bob p_bob = new _Puppy_Bob();
    _Kitten_Bea k_bea = new _Kitten_Bea();
    _Puppy_Ash p_ash = new _Puppy_Ash();
    _Kitten_Alex k_alex = new _Kitten_Alex();


    public class _A_List_Health_Potion implements Usable {
        public void use(Dueler target) {
            target.heal();
        }
    }

    public class _B_List_Health_Potion implements Usable {
        public void use(Dueler target) {
            // do stuff
        }
    }

    public class _C_List_Health_Potion implements Usable {
        public void use(Dueler target) {
            // do stuff
        }
    }

    public class _X_List_Health_Potion implements Usable {
        public void use(Dueler target) {
            // do stuff
        }
    }

    public class _Instant_Confrontation implements Usable {
        public void use(Dueler target) {
            // do stuff
        }
    }

    public class _Recover implements Usable {
        public void use(Dueler target) {
            // do stuff
        }
    }

    public class _Plus_Ultra implements Usable {
        public void use(Dueler target) {
            // do stuff
        }
    }

    public class _Lucky_Draw implements Usable {
        public void use(Dueler target) {
            // do stuff
        }
    }

    public class _Status_Advance implements Usable {
        public void use(Dueler target) {
            // do stuff
        }
    }

    public class _Puppy_Xylo implements Usable {
        public void use(Dueler target) {
            // do stuff
        }
    }

    public class _Kitten_Xin implements Usable {
        public void use(Dueler target) {
            // do stuff
        }
    }

    public class _Puppy_Claire implements Usable {
        public void use(Dueler target) {
            // do stuff
        }
    }

    public class _Kitten_Carlos implements Usable {
        public void use(Dueler target) {
            // do stuff
        }
    }

    public class _Puppy_Bob implements Usable {
        public void use(Dueler target) {
            // do stuff
        }
    }

    public class _Kitten_Bea implements Usable {
        public void use(Dueler target) {
            // do stuff
        }
    }

    public class _Puppy_Ash implements Usable {
        public void use(Dueler target) {
            // do stuff
        }
    }

    public class _Kitten_Alex implements Usable {
        public void use(Dueler target) {
            // do stuff
        }
    }


// i think we've done some iterations of something like this, but this one is not
// working. would contain the stuff needed to make a card i.e. string that we read
// off the file and instance of the Usables (strategy/method).

//    HashMap<String, Usable> cardset = new HashMap<String, Usable>(16);
////    HashMap <> cardset = new HashMap <>(16);
//        cardset.put("A List Health Potion",a_list );
//        cardset.put("B List Health Potion",b_list );
//        cardset.put("C List Health Potion",c_list );
//        cardset.put("X List Health Potion",x_list );
//        cardset.put("Instant Confrontation",instant );
//        cardset.put("Recover",recover );
//        cardset.put("Plus Ultra",plus );
//        cardset.put("Lucky Draw",lucky );
//        cardset.put("Status Advance",status );
//        cardset.put("Puppy Xylo",p_xylo );
//        cardset.put("Kitten Xin",k_xin );
//        cardset.put("Puppy Claire",p_clair );
//        cardset.put("Kitten Carlos",k_carlo );
//        cardset.put("Puppy Bob",p_bob );
//        cardset.put("Kitten Bea",k_bea);
//        cardset.put("Puppy Ash",p_ash );
//        cardset.put("Kitten Alex",k_alex );

}


