class BookTheatreSeats{
    int total_seats = 20;
    synchronized void bookseat(int seats)
    {
        if(total_seats >= seats){
            System.out.println(seats + " seats booked successfully!!!");
            total_seats -= seats;
            System.out.println("Total seats left are: "+total_seats);
        }
        else{
            System.out.println("seats cannot be booked");
            System.out.println("Total seats left are: "+total_seats);
        }
    }
}

class Thread1 extends Thread{
    BookTheatreSeats b;
    int seats;
    public Thread1(BookTheatreSeats b,int seats){
        this.b = b;
        this.seats = seats;
    }
    public void run(){
        b.bookseat(seats);
    }
}
class Thread2 extends Thread{
    BookTheatreSeats b;
    int seats;
    public Thread2(BookTheatreSeats b,int seats){
        this.b = b;
        this.seats = seats;
    }
    public void run(){
        b.bookseat(seats);
    }
}
public class MyMovieApp {
    public static void main(String[] args) {
        BookTheatreSeats b = new BookTheatreSeats();
        Thread1 t1 = new Thread1(b,7);
        t1.start();

        Thread2 t2 = new Thread2(b,8);
        t2.start();

        BookTheatreSeats b2 = new BookTheatreSeats();
        Thread1 t3 = new Thread1(b2,9);
        t3.start();

        Thread2 t4 = new Thread2(b2,10);
        t4.start();

    }
}
