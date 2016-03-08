package Person_Entities;

import java.util.ArrayList;
import java.util.List;

public class GuestList {
    private List<Guest> list;
    private List<Country> countries;

    public GuestList() {
        list = new ArrayList<>();
        countries = new ArrayList<>();
    }

    public boolean add(String firstName, String lastName, String gender, String age, String city, String state, String country) {
        Name name = new Name(firstName, lastName);
        Address address = new Address(city, state, country);
        Guest guest = new Guest(name, gender, age, address);
        Country newCountry = new Country(country);
        return addGuestAccordingToCountry(newCountry, guest);
    }

    public void addAllGuest(String[] splittedData) {
        for (String eachSplittedData : splittedData) {
            String[] individual = eachSplittedData.split(",");
            add(individual[0], individual[1], individual[2], individual[3], individual[4], individual[5], individual[6]);
        }
    }

    private boolean addGuestAccordingToCountry(Country newCountry, Guest guest) {
        if (!countries.contains(newCountry))
            countries.add(newCountry);
        int position = countries.indexOf(newCountry);
        countries.get(position).add(guest);
        return list.add(guest);
    }

    public String[] getAllGuestNameAsFormat(String format) {
        List<String> allGuestWithTheAge = new ArrayList<>();
        for (Guest eachGuest : list) {
            allGuestWithTheAge.add(eachGuest.toString(format));
        }
        String[] allGuest = new String[allGuestWithTheAge.size()];
        return allGuestWithTheAge.toArray(allGuest);
    }

    public String[] getGuestOfCountryAccordingGivenFormat(String country, String format) {
        Country countryToRetrieve = new Country(country);
        if (!countries.contains(countryToRetrieve))
            return new String[0];
        int position = countries.indexOf(countryToRetrieve);
        return countries.get(position).getAll(format);
    }

    public String[] getAllGuestWithCountryAboveTheGivenAge(String country, int age, String format) {
        Country countryToRetrieve = new Country(country);
        if (!countries.contains(countryToRetrieve))
            return new String[0];
        int position = countries.indexOf(countryToRetrieve);
        return countries.get(position).getAllWithTheAge(age, format);
    }

    public String[] getAllGuestAboveTheGivenAge(int age, String format) {
        List<String> allGuestWithTheAge = new ArrayList<>();
        for (Guest eachGuest : list) {
            if (eachGuest.isAbove(age))
                allGuestWithTheAge.add(eachGuest.nameWithAge(format));
        }
        String[] allGuest = new String[allGuestWithTheAge.size()];
        return allGuestWithTheAge.toArray(allGuest);
    }
}
