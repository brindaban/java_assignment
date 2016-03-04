import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void person_name_as_prefixed_firstname_lasname_format() {
        Person one = new Person("Sayoni", "Mondal", Gender.FEMALE, 21, "Bonga", "WestBengal", "India");
        assertEquals(one.invitationName(), "Ms Sayoni Mondal");
    }

    @Test
    public void person_name_as_prefixed_lasname_firstname_format() {
        Person one = new Person("Brindaban", "Patra", Gender.MALE, 18, "Ghatal", "WestBengal", "India");
        assertEquals(one.invitationNameLastFirst(), "Mr Patra, Brindaban");
        assertEquals(one.invitationName(), "Mr Brindaban Patra");
    }


}
