public class Main {
    public static void main(String[] args)
    {
        TurtleThread baseThread = new TurtleThread(0, 0.5, 0.5, "brown");
        TurtleThread petalsThread = new TurtleThread(1, 0.5, 0.5, "pink");
        TurtleThread candleThread = new TurtleThread(2, 0.5, 0.6, "yellow");

        baseThread.start();
        petalsThread.start();
        candleThread.start();
    }
}