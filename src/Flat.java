
public class Flat {
    private String street;
    private String numOfHouse;
    private int numOfFlat;
    private int numberOfRooms;
    private boolean isItRenovation = false;
    private boolean isitCenterOfGrodno = false;
    private int middlecost;
    private boolean center = false;

    public Flat(int numberOfRooms, String street, String numOfHouse, int numOfFlat, int middlecost) {
        this.numberOfRooms = numberOfRooms;
        this.street = street;
        this.numOfHouse = numOfHouse;
        this.numOfFlat = numOfFlat;
        this.middlecost = middlecost;
    }


    public String getStreet() {
        return street;
    }

    public int getNumOfFlat() {
        return numOfFlat;
    }

    public String getNumOfHouse() {
        return numOfHouse;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getMiddlecost() {
        return middlecost;
    }

    public boolean getIsItRenovation() {
        return isItRenovation;
    }

     public boolean getIsitCenterOfGrodno() {
        return center;
     }

     public  void setIsitCenterOfGrodno(boolean center) {
            this.center = center;
     }

}

