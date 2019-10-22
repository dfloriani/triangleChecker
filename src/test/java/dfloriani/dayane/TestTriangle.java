package dfloriani.dayane;

import org.junit.Test;
import static dfloriani.dayane.Triangle.ERROR;
import static dfloriani.dayane.Triangle.EQUILATERAL_TYPE;
import static dfloriani.dayane.Triangle.ISOSCELES_TYPE;
import static dfloriani.dayane.Triangle.SCALENE_TYPE;
import static org.junit.Assert.*;

public class TestTriangle {
    
    @Test
    public void invalidValuesShouldReturnError() {
        assertEquals("Should return 4 (Error).", ERROR, Triangle.getTriangleType(0, 0, 0));
        assertEquals("Should return 4 (Error).", ERROR, Triangle.getTriangleType(0, 10, 10));
        assertEquals("Should return 4 (Error).", ERROR, Triangle.getTriangleType(10, 0, 10));
        assertEquals("Should return 4 (Error).", ERROR, Triangle.getTriangleType(10, 10, 0));
        assertEquals("Should return 4 (Error).", ERROR, Triangle.getTriangleType(-1, -1, -1));
        assertEquals("Should return 4 (Error).", ERROR, Triangle.getTriangleType(-1, 10, 10));
        assertEquals("Should return 4 (Error).", ERROR, Triangle.getTriangleType(10, -1, 10));
        assertEquals("Should return 4 (Error).", ERROR, Triangle.getTriangleType(10, 10, -1));
        assertEquals("Should return 4 (Error).", ERROR, Triangle.getTriangleType(1, 2, 3));
    }
    
    @Test
    public void allEqualShouldReturnEquilateralType() {
        assertEquals("Should return 3 (Equilateral).", EQUILATERAL_TYPE, Triangle.getTriangleType(1, 1, 1));
        assertEquals("Should return 3 (Equilateral).", EQUILATERAL_TYPE, Triangle.getTriangleType(10, 10, 10));
    }
    
    @Test
    public void twoEqualValuesShouldReturnIsoscelesType() {
        assertEquals("Should return 2 (Isosceles).", ISOSCELES_TYPE, Triangle.getTriangleType(4, 4, 3));
        assertEquals("Should return 2 (Isosceles).", ISOSCELES_TYPE, Triangle.getTriangleType(10, 10, 1));
    }
    
    @Test
    public void noEqualValuesShouldReturnOne() {
        assertEquals("Should return 1 (Scalene).", SCALENE_TYPE, Triangle.getTriangleType(3, 2, 4));
        assertEquals("Should return 1 (Scalene).", SCALENE_TYPE, Triangle.getTriangleType(10, 11, 12));
    }


}
