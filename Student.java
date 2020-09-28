/**
 * This class creates the profile of a student. A student has the following attributes:
 */
public class Student {
    private String firstname;
    private String surname;
    private int coursework;
    private int testmark;

    /**
     *The Student constructor which contains student info
     * @param firstname firstname the first name of the student
     * @param surname surname the family name of the student
     * @param coursework coursework is the mark he got in the coursework
     * @param testmark testmark is the mark he received in a test
     */
    public Student(String firstname, String surname,int coursework, int testmark) {
        setFirstname(firstname);
        setSurname(surname);
        if(coursework<=0 && coursework>100)
        {
         System.out.println("You can not enter a number below 1 or bigger than 100");
        }
    }

    /**
     *
     * @return it returns the firstname of the student
     */
    public String getFirstname()
    {
        return firstname;
    }

    /**
     *
     * @return it returns the surname of the student
     */
    public String getSurname()
    {
        return surname;
    }

    /**
     *
     * @param name is the String I introduce as the name of the student by using the setter
     */
    public void setFirstname(String name)
    {
        if(!name.isEmpty()) //null validation
        {
            firstname = name;
        }
        else
            {
                System.out.println("Please enter something because right now it is null");
            }
    }

    public void setSurname(String famName)
    {
        if(!famName.isEmpty()) //null validation
        {
            surname = famName;
        }
        else
        {
            System.out.println("Please enter something because righ now it is null");
        }
    }

    /**
     *
     * @return the contantetion of the first name and surname
     */
    public String getFullName()
    {
        return firstname + " " + surname;

    }

    /**
     *
     * @return the average Mark
     */
    public double averageMark()
    {
        return (double)(coursework + testmark)/2;

    }

}
