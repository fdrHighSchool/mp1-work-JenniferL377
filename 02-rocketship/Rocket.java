
/**
 * Write a description of class Rocket here.
 *
 * @author (Jennifer Liu)
 * @version (9/23/22)
 */
public class Rocket { 
    public static void main (String[] args) {
        triangle();
        square();
        us();
        square();
        triangle();
    } //end main method
    public static void triangle() {
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
    } //end of triangle
    public static void square() {
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
    } //end of square
    public static void us() {
        System.out.println("|United|");
        System.out.println("|States|");
    } //end of us
} //end class
