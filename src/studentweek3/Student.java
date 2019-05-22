/*
 * Shehnazdeep Kaur
 * Student Id- 991539256
 * PROG 24178-P05
 */
package studentweek3;

/**
 *
 * @author brata
 */
public class Student {
    
    private int ID;
    private String firstName;
    private int maxCourse;

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
        System.out.println("Edited");
    }
    
}
