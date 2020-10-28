package Exercise1.Task3;

public class Resource {
    int counter;

    synchronized public int increment() {
        return counter++;
    }

}
