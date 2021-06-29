package Queue;
public class QueueApps {
     public static void main(String[] args) {
        Antrian antrian=new Antrian(5);
        antrian.enqueue(7);
        antrian.display();
        antrian.enqueue(8);
        antrian.display();
        System.out.println("yang diambil dari antrian = "+ antrian.peek());
        System.out.println("Nama Saya Adalah Sutrisno");
        antrian.display();
        System.out.println(" ");
        antrian.enqueue(7);
        antrian.display();
        antrian.enqueue(6);
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek());
         
         
     }
    
}