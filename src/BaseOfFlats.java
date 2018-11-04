import java.util.Scanner;

public class BaseOfFlats {

    private Flat[] flats;        // содержит все предложения по продаже квартир

    public BaseOfFlats(Flat[] flats) {
        this.flats = flats;
    }

    Flat flat1 = new Flat(1,"ул.Репина","18а", 58, 25000);
    Flat flat2 = new Flat(2,"ул.Богушевича", "50а", 41, 33000);
    Flat flat3 = new Flat(3,"ул. О.Соломовой", "152б", 60, 43000);
    Flat flat4 = new Flat(4,"ул.Тавлая", "44", 185, 50000);


    double md=0;
    boolean center = false;
    public void GetInfoAboutNumberOfRooms() {

        boolean exit = false;
        int numberOfRooms;
        System.out.println("Сколько комнат в квартире, которую вы хотите продать? (от 1 до 4)");
        Scanner input = new Scanner(System.in);
        for (int i = 1; i<=5; i++) {
            if (exit == true)
                break;
             numberOfRooms = input.nextInt();
            switch (numberOfRooms) {
                case 1:
                    System.out.println("В качестве аналога можно рассмотреть " + flat1.getNumberOfRooms() + "комнатную квартиру по адресу: " + flat1.getStreet() + ", " + flat1.getNumOfHouse() + ", " + flat1.getNumOfFlat() + " c ремонтом = " + flat1.getIsItRenovation());
                    md = flat1.getMiddlecost();
                    System.out.println("Ее стоимость =" + md);
                    flat1.setIsitCenterOfGrodno(true);
                    center = flat1.getIsitCenterOfGrodno();
                    exit=true;
                    break;
                case 2:
                    System.out.println("В качестве аналога можно рассмотреть " + flat2.getNumberOfRooms() + "комнатную квартиру по адресу: " + flat2.getStreet() + ", " + flat2.getNumOfHouse() + ", " + flat2.getNumOfFlat() + " c ремонтом = " + flat2.getIsItRenovation());
                    md = flat2.getMiddlecost();
                    System.out.println("Ее стоимость =" + md);
                    flat2.setIsitCenterOfGrodno(false);
                    center = flat2.getIsitCenterOfGrodno();
                    exit = true;
                    break;
                case 3:
                    System.out.println("В качестве аналога можно рассмотреть " + flat3.getNumberOfRooms() + "комнатную квартиру по адресу: " + flat3.getStreet() + ", " + flat3.getNumOfHouse() + ", " + flat3.getNumOfFlat() + " c ремонтом = " + flat3.getIsItRenovation());
                    md = flat3.getMiddlecost();
                    System.out.println("Ее стоимость =" + md);
                    flat3.setIsitCenterOfGrodno(false);
                    center = flat3.getIsitCenterOfGrodno();
                    exit = true;
                    break;
                case 4:
                    System.out.println("В качестве аналога можно рассмотреть " + flat4.getNumberOfRooms() + "комнатную квартиру по адресу: " + flat4.getStreet() + ", " + flat4.getNumOfHouse() + ", " + flat4.getNumOfFlat() + " c ремонтом = " + flat4.getIsItRenovation());
                    md = flat4.getMiddlecost();
                    System.out.println("Ее стоимость =" + md);
                    flat4.setIsitCenterOfGrodno(false);
                    center = flat4.getIsitCenterOfGrodno();
                    exit = true;
                    break;
                default:
                    System.out.println("!!!! Предложений на продажу таких квартир нет !!!! Попробуйте еще раз (от 1 до 4)");
            }
        }
    }
    public void CorrectOfValueCentr() {  //корректировка цены  аналога в зависимости от расположения квартиры в центре или нет
        Scanner input1 = new Scanner(System.in);
        System.out.println("Находится ли ваша квартира в центральной части Гродно? (1-да; 0-нет)");
        int n1 = input1.nextInt();
        switch (n1) {
            case 0: if (center == false) {
                 md = md * 1;
                System.out.println(md+" - стоимость не изменилась");
            }else {  md = md * 0.9;
                System.out.println(md+" - стоимость уменьшилась на 10% ");}
                break;
            case 1: if (center == false) {
                md = md * 1.1;
                System.out.println(Math.round(md)+" - стоимость квартиры увеличилась на 10%");
            } else { md = md * 1;
                System.out.println(Math.round(md)+" - стоимость не изменилась");
            }
                break;
        }
    }
    public void CorrectOfValueRemont() {       //корректировка цены  аналога в зависимости от наличия хорошего ремонта
        Scanner input2 = new Scanner(System.in);
        System.out.println("Ваша квартира с хорошим ремонтом? (1-да; 0-нет)");
        int n2 = input2.nextInt();
        switch (n2) {
            case 0:
                md = md * 1;
                System.out.println((Math.round(md)));
                break;
            case 1:
                md = md * 1.2;
                System.out.println((Math.round(md))+" - стоимость квартиры увеличилась на 20%");
                break;
        }
    }
}

