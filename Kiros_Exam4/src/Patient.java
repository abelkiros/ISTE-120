/**
 *    Patient class - super class of all patient subclasses
 *
 *    ISTE-120 Practical 4
 *    @since 05-03-2020
 *    @author Abel Mengesha
 */
public class Patient implements Options {
    //attributes
    private String name;
    private int id;
    private String wing;
    private int tv;

    public Patient(){
        name = "Unidentified";
        wing = "Unidentified";
        id = UNKNOWN;
        tv = UNKNOWN;
    }

    public Patient(int _id, String _name,String _wing, int _tv){
        id = _id;
        name = _name;
        wing = _wing;
        tv = _tv;
    }


    /** Return a string representation of this object*/
    public String toString() {
        if(tv == 1){
            return String.format("Patient %05d:%s is in wing %s.%nThis is a room with a TV", id, name, wing);
        }else {
            return String.format("Patient %05d:%s is in wing %s.%nThis is a room without a TV", id, name, wing);
        }

    }
}