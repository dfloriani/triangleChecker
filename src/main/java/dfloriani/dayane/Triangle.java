package dfloriani.dayane;

public class Triangle {
    
    public static final int ERROR = 4;
    public static final int EQUILATERAL_TYPE = 3;
    public static final int ISOSCELES_TYPE = 2;
    public static final int SCALENE_TYPE = 1;
    
    public static int getTriangleType(int a, int b, int c){
	
        if (a <= 0 || b <= 0 || c <= 0 || b + c <= a || a + c <= b || a + b <= c) {
            return ERROR;
        } else if (a == b && b == c) {
            return EQUILATERAL_TYPE;
        } else if (a == b || b == c || a == c) {
            return ISOSCELES_TYPE;
        } else {
            return SCALENE_TYPE;
        }
    }
}
