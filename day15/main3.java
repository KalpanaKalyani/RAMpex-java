package day15;
class a  extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(i);
        }
    }
}
class b extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(i);
        }
    }
}
public class main3 {
    public static void main(String[] args){
        a a1=new a();
        b b1=new b();
        a1.start();
        b1.start();
        a1.setPriority(10);
    }
}
