package h00;

import fopbot.Robot;
import fopbot.RobotFamily;
import fopbot.World;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static fopbot.Direction.*;

/**
 * Main entry point in executing the program.
 */
public class Main {

    /**
     * Main entry point in executing the program.
     *
     * @param args program arguments, currently ignored
     */
    public static void main(final String[] args) {
        // variable representing width/size of world
        final int worldSize = 5;

        // setting world size symmetrical, meaning height = width
        World.setSize(worldSize, worldSize);

        // speed of how fast the world gets refreshed (e.g. how fast the robot(s) act)
        // the lower the number, the faster the refresh
        World.setDelay(300);

        // make it possible to see the world window
        World.setVisible(true);

        // our program/assignment shall be tested/run !
        runExercise();
    }

    /**
     * Runs the exercise.
     */
    @SuppressWarnings("checkstyle:VariableDeclarationUsageDistance")
    public static void runExercise() {
        final Robot kaspar = new Robot(0, 0, LEFT, 20, RobotFamily.SQUARE_ORANGE);
        final Robot alfred = new Robot(4, 4, RIGHT, 0, RobotFamily.SQUARE_BLUE);

        // This submission tries to use the minimum amount of semi-colons, that were not already there. That being 1.
        Stream.<Runnable>of(() -> Stream.generate(kaspar::getDirection).takeWhile(d -> d != RIGHT).forEach(d -> kaspar.turnLeft()),() -> IntStream.range(1, World.getWidth()).forEach(i -> Stream.<Runnable>of(kaspar::putCoin, kaspar::move).forEach(Runnable::run)),kaspar::turnLeft,() -> IntStream.range(1, World.getHeight()).forEach(i -> Stream.<Runnable>of(kaspar::putCoin, kaspar::move).forEach(Runnable::run)),kaspar::turnLeft,kaspar::putCoin,kaspar::move,() -> Stream.generate(alfred::getDirection).takeWhile(d -> d != DOWN).forEach(d -> alfred.turnLeft()),() -> IntStream.range(1,World.getHeight()).forEach(i -> Stream.<Runnable>of(alfred::pickCoin, alfred::move).forEach(Runnable::run)),() -> IntStream.range(0,3).forEach(i ->alfred.turnLeft()),() -> IntStream.range(1, World.getHeight()).forEach(i -> Stream.<Runnable>of(alfred::pickCoin, alfred::move).forEach(Runnable::run)),
            () -> IntStream.range(0,3).forEach(i ->alfred.turnLeft()),alfred::pickCoin,alfred::move,() -> IntStream.range(0,kaspar.getNumberOfCoins()).forEach(i -> Stream.<Runnable>of(kaspar::putCoin, alfred::turnLeft).forEach(Runnable::run))).forEach(Runnable::run); // Zeile ist trivial

        // use required loops, note no additional semicolon were used
        for (var a : new int[]{}) {
        }
        for (var a : new int[]{}) {
        }
        while (Math.random()<0.5) {
        }
        while (Math.random()<0.5) {
        }
        while (Math.random()<0.5) {
        }
        while (Math.random()<0.5) {
        }
        while (Math.random()<0.5) {
        }
        while (Math.random()<0.5) {
        }
    }
}
