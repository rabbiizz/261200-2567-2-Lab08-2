class TurtleThread extends Thread {
    private Turtle turtle;
    private int id;

    public TurtleThread(int id, double x, double y, String color) {
        this.id = id;
        this.turtle = new Turtle(x, y);
        this.turtle.penColor(color);
        turtle.speed(1);
    }

    @Override
    public void run() {
        if (id == 0) {
            drawBase();
        } else if (id == 1) {
            drawPetals();
        } else if (id == 2) {
            drawCandle();
        }
    }

    private void drawBase() {
        turtle.bgcolor("lightskyblue");
        turtle.width(2);
        turtle.dot("green", 40);
        turtle.hide();
    }

    private void drawPetals() {
        turtle.width(2);
        double radians = 20;
        for (int i = 0; i < 12; i++) {
            turtle.down();
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 60; k++) {
                    turtle.forward(radians * Math.PI / 180);
                    turtle.right(1);
                }
                turtle.right(120);
            }
            turtle.up();
            turtle.right(30);
        }
        turtle.hide();
    }

    private void drawCandle() {
        turtle.up();
        turtle.setPosition(0.5, 0.6);
        turtle.width(4);
        turtle.down();
        turtle.setPosition(0.5, 22.0);
        turtle.up();
        turtle.setPosition(0.5, 24);
        turtle.dot("orange", 5);
        turtle.hide();
    }
}