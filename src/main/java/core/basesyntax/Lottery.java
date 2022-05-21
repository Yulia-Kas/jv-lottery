package core.basesyntax;

import java.util.Random;

public class Lottery{
    ColorSupplier supplier = new ColorSupplier();
    Random random = new Random();
    public Ball getRandomBall() {
        return new Ball(supplier.getRandomColor(), random.nextInt(100));
    }
 }

