/**
 *Example using Threads
 * @author ashish
 */
public class ThreadsUsingLambda {
     static public void main(String[] args) {
        Thread thread=new Thread(()-> System.out.println("Basic Thread"));
        thread.start();
    }
}
