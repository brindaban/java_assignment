package Invitation_App;


import DataStorage.DataRead;
import Person_Entities.GuestList;

public class PrintLables {
    public static void main(String[] args) throws Exception {
        DataRead data = new DataRead(args[1]);
        String[] splittedData = data.getdata();

        GuestList list = new GuestList();

        for (String eachSplittedData : splittedData) {
            String[] individual = eachSplittedData.split(",");
            list.add(individual[0], individual[1], individual[2], individual[3], individual[4], individual[5], individual[6]);
        }

        String []guests  = list.getGuestOfCountryAccordingGivenFormat(args[0],"formal");
        for (String guest: guests) {
            System.out.println(guest);
        }

    }
}
