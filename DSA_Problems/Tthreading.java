
public class Tthreading {
    public static void main(String[] args) {
        
        Mythread obj=new Mythread();
        Thread thread=new Thread(obj);
        thread.start();
    }
}
//  class Mythread extends Thread{

//     public void run(){
//         System.out.println("Hello thread");
//     }
// }
class Mythread implements Runnable{
    public void run(){
        System.out.println("Hello worild");
}
}