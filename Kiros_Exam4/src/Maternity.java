/**
 *    Maternity class - Subclass of the Patient class
 *
 *    ISTE-120 Practical 4
 *    @since 05-03-2020
 *    @author Abel Mengesha
 */
public class Maternity extends Patient {
    private String childsName;

    /** Constructs a Maternity object */
    public Maternity(int _id, String _name, int _tv, String _childsName){
        super(_id, _name, MATERNITY_WING, _tv);
        childsName= _childsName;
    }

    /** Return a string rep pf this obj */
    public String toString(){
        return "\nMaternity " + super.toString() + "\nThe chosen name for the child is "+ childsName;
    }

}
