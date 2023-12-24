/**
 *    Surgical class- Subclass of the Patient class
 *
 *    ISTE-120 Practical 4
 *    @since 05-03-2020
 *    @author Abel Mengesha
 */
class Surgical extends Patient {
    private String procedure;

    /** Constructs a Surgical object */
    public Surgical(int _id, String _name, int _tv, String _procedure) {
        super(_id, _name, SURGICAL_WING, _tv);
        procedure = _procedure;
    }

    /** Return a string rep pf this obj */
    public String toString(){
        return "\nSurgical "+ super.toString() + "\nThe patient's procedure is "+procedure;
    }
}