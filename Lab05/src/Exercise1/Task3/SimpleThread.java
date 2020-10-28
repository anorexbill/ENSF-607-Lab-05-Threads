package Exercise1.Task3;

public class SimpleThread implements Runnable{
    Resource resource;

    synchronized public void run() {
        for(int i = 0; i<10; i++){
            try {
                System.out.println(resource.increment());

                Thread.sleep(1);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    SimpleThread(Resource resource){
        this.resource = resource;
    }

    public static void main(String args[]) throws InterruptedException {
        Resource resource = new Resource();
        Runnable t = new SimpleThread(resource);
        Thread t1 = new Thread(t);
        Runnable s = new SimpleThread(resource);
        Thread s1 = new Thread(s);
        Runnable r = new SimpleThread(resource);
        Thread r1 = new Thread(r);
        Runnable m = new SimpleThread(resource);
        Thread m1 = new Thread(m);

        t1.start();
        s1.start();
        r1.start();
        m1.start();

    }
}
