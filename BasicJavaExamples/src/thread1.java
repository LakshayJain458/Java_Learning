class shared1{
    int items=0;
    void setItems(int i){
        this.items=i;
        System.out.println("Producer: "+items);
    }
    void getItems(){
        System.out.println("Consumers: "+items);
    }
}
class Producer1 extends Thread{
    shared1 s;
    Producer1(shared1 s){
        this.s=s;
        this.start();
    }
    public void run(){
        for(int i=1;i<=6;i++){
            s.setItems(i);
        }
    }
}
class Consumer1 extends Thread{
    shared1 s;
    Consumer1(shared1 s){
        this.s=s;
        this.start();
    }
    public void run(){
        for(int i=1;i<=6;i++){
            s.getItems();
        }
    }
}
public class thread1 {
    public static void main(String[]args){
        shared1 a=new shared1();
        new Producer1(a);
        new Consumer1(a);
    }
}
