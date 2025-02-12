public class Main {
    public static void main(String[] args)
    {
        TurtleThread baseThread = new TurtleThread(0, 0.5, 0.5, "green");
        TurtleThread petalsThread = new TurtleThread(1, 0.5, 0.5, "yellow");
        TurtleThread candleThread = new TurtleThread(2, 0.5, 0.6, "orange");

        baseThread.start();
        petalsThread.start();
        candleThread.start();
    }
}