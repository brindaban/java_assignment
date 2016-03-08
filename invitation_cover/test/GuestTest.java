import Person_Entities.Address;
import Person_Entities.Guest;
import Person_Entities.Name;
import org.junit.Assert;
import org.junit.Test;

public class GuestTest {
    @Test
    public void testTostringReturnNameInCasualFormat() throws Exception {
        Guest myGuest = new Guest(new Name("Brindaban","Patra"),"Male","21",new Address("Ghatal","West Bengal","India"));
        String casualFormattedName = myGuest.toString("casual");
        Assert.assertEquals("Mr Brindaban Patra",casualFormattedName);
    }

    @Test
    public void testTostringReturnsNameInFormalFormat() throws Exception {
        Guest myGuest = new Guest(new Name("Sampriti","Patra"),"Female","21",new Address("Ghatal","West Bengal","India"));
        String formalFormattedName = myGuest.toString("formal");
        Assert.assertEquals("Ms Patra, Sampriti",formalFormattedName);
    }
}
