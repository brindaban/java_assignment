package Invitation_App;

import Person_Entities.GuestList;

import java.util.Arrays;

public class OptionHandler {
    private GuestList list;
    private String[] commandLineAgruments;
    private String nameFormat;
    private String [] result;

    public OptionHandler(GuestList list, String[] commandLineAgruments) {
        this.list = list;
        this.commandLineAgruments = commandLineAgruments;
    }

    private void getUserRequirments(){
        int countryCommandIndex = Arrays.asList(commandLineAgruments).indexOf("-country");
        int ageCommandIndex = Arrays.asList(commandLineAgruments).indexOf("-age");
        if(countryCommandIndex==-1&&ageCommandIndex==-1){
            result = list.getAllGuestNameAsFormat(nameFormat);
        }
        if(countryCommandIndex>=0&&ageCommandIndex==-1) {
            String countryOption = commandLineAgruments[countryCommandIndex + 1];
            result = list.getGuestOfCountryAccordingGivenFormat(countryOption, nameFormat);
        }
        if(countryCommandIndex==-1&&ageCommandIndex>=0) {
            int age = Integer.parseInt(commandLineAgruments[ageCommandIndex+1]);
            result = list.getAllGuestAboveTheGivenAge(age,nameFormat);
        }
        if (countryCommandIndex>=0&&ageCommandIndex>=0){
            String countryOption = commandLineAgruments[countryCommandIndex+1];
            int age = Integer.parseInt(commandLineAgruments[ageCommandIndex+1]);
            result = list.getAllGuestWithCountryAboveTheGivenAge(countryOption,age,nameFormat);
        }
    }

    private void setNameFormat(){
        int nameFormatIndex = Arrays.asList(commandLineAgruments).indexOf("-nameFormat");
        nameFormat = commandLineAgruments[nameFormatIndex+1];
    }

    public void operate(){
        setNameFormat();
        getUserRequirments();
    }

    public void printResult(){
        for (String guest: result) {
            System.out.println(guest);
        }
    }

}
