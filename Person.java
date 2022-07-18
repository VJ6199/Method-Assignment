public class Person {
    public static void main(String[] args){
        Moviecounter cinemark = new Moviecounter();
        cinemark.availablemovies();
        cinemark.selectedMovie(" Warrior");
        cinemark.selectedSeats(" F2");
        System.out.println("amount to be paid = "+cinemark.amountpaid(25));
        System.out.println("Taxes = "+5);
        System.out.println("ticket provided = "+cinemark.ticketprovided());
    }
}
class Moviecounter{
    void availablemovies(){
        System.out.println("1. Thor 2. Warrior 3. Jurassic world 4. top Gun");
    }
    void selectedMovie(String Warrior){
        System.out.println("Selected Movie" + Warrior);
    }
    void selectedSeats(String F2){
        System.out.println("Selected Seats" + F2);
    }
    int amountpaid(int amount) {
        return amount+5;
    }
    boolean ticketprovided(){
        return true;
    }
}