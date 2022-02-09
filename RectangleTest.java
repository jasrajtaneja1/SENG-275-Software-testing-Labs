/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    void testHarnessWorking() {
        assertTrue(true);
    }

    @Test
    void defaultRectangleX() {
        Rectangle r = new Rectangle();
        assertEquals(0, r.getX());
        assertEquals(0, r.getY());
        assertEquals(1, r.getWidth());
        assertEquals(1, r.getHeight());
    }


    @Test
    void customRectangle(){
        Rectangle r = new Rectangle(5,5,10,10);
        assertEquals(5, r.getX());
        assertEquals(5, r.getY());
        assertEquals(10, r.getWidth());
        assertEquals(10, r.getHeight());
    }
    @Test
    void changeWidthInvalid(){
        Rectangle r = new Rectangle(5,5,10, 10);

        assertThrows(IllegalArgumentException.class,
                () -> {r.setWidth(-10);} );
    }

    @Test
    void changeHeightInvalid(){
        Rectangle r = new Rectangle(5,5,10, 10);

        assertThrows(IllegalArgumentException.class,
                () -> {r.setHeight(-10);} );


    }

    @Test
    void change_x_y(){
        Rectangle r = new Rectangle(5,5,10,10);
        r.setX(7);
        r.setY(7);

        assertEquals(7, r.getX());
        assertEquals(7, r.getY());

    }
    @Test
    void checkIfEqual(){
        Rectangle r = new Rectangle(5,5,10,10);
        Rectangle s = new Rectangle(5,5,10,10);

        assertEquals(true,r.equals(s) );
    }

    @Test
    void checkArea(){
        Rectangle r = new Rectangle(5,5,10,10);


        assertEquals(25, r.getArea(r));
    }
    @Test
    void checkContains(){
        Rectangle r = new Rectangle(5,5,10,10);
        Rectangle s = new Rectangle(4,3,9,9);


        assertEquals(true, r.rectangleContains(s));
    }


}
