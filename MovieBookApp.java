class BookTheatreApp{
    int total_seat = 10;
    synchronized void bookseat(int seats){
        if(total_seat >= seats){
            System.out.println("Your ticket is booked");
            total_seat -= seats;
            System.out.println("Remaining seats are "+total_seat);
        }
        else{
            System.out.println("seats could not be booked");
            System.out.println("seats left are: "+total_seat);
        }
    }
}
public class MovieBookApp extends Thread{
    static BookTheatreApp b;
     int seats;
    public void run(){
        b.bookseat(seats);
    }
    public static void main(String[] args) {
        b = new BookTheatreApp();
        MovieBookApp amit = new MovieBookApp();
        amit.seats = 7;
        amit.start();

        MovieBookApp andrew = new MovieBookApp();
        andrew.seats = 6;
        amit.start();
    }
}
