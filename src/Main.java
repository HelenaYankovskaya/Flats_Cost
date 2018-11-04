
public class Main  {

    public static void main(String[] args) {

       Flat[] flats = new Flat[]{};
           BaseOfFlats basa = new BaseOfFlats(flats);

        basa.GetInfoAboutNumberOfRooms();
        basa.CorrectOfValueCentr();
        basa.CorrectOfValueRemont();

     Client client = new Client("Иван","Иванов");
     System.out.println("!!!!!!!!Уважаемый "+client.getFirstName()+" "+client.getLastName()+", вы можете продавать вашу квартиру за "+Math.round(basa.md)+ " долларов!!!");
    }

    }
