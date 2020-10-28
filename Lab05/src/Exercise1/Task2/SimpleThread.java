package Exercise1.Task2;

public class SimpleThread extends Thread{
    Resource resource;

     public void run() {
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
        Thread t = new SimpleThread(resource);
        Thread s = new SimpleThread(resource);
        Thread r = new SimpleThread(resource);
        Thread m = new SimpleThread(resource);
        Thread q = new SimpleThread(resource);

        t.start();
        s.start();
        r.start();
        m.start();
        q.start();

    }
}
