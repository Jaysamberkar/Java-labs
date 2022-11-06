import java.lang.* ;

class Mythread1 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<=12;i++){
            int n,62,i;

            System.out.println("62"+i+"="+n);
            try{
                Thread.sleep(500);
            }
            catch(Exception e){}
        }
    }
}

class cha implements Runnable{
    @Override
    public void run() {
        for (char i=45;i<91;i++){
            System.out.println(i);
        }
    }
}

public class Multithreading {
}
