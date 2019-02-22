package calculator;

public class Geometry { // класс

    // calculate Square
    public int calculateSquarePerimetr(int sideLength) {
        int perimetr = sideLength * 4;
        return perimetr;
    }

    public void calculateSquareSurface(int sideLength) { // ВЫШЕ ЕЩЕ ОДНА ТАКАЯ ЖЕ ПЕРЕМЕННАЯ!
        int surface = sideLength * sideLength;
        System.out.println("Surface: " + surface);
    }

    // calculate Rectange
    public void calculateRectanglePerimetr(int sideLength, int sideWidth) {
        int perimetr = (sideLength + sideWidth) * 2;
        System.out.println("Perimetr: " + perimetr);
    }

    public void calculateRectangeSurface(int sideLength, int sideWidth) {
        int surface = sideLength * sideWidth;
        System.out.println("Surface: " + surface);
    }

    // calculate Rhombus
    public void calculateRhombusPerimetr(int sideLength) {
        int perimetr = sideLength * 4;
        System.out.println("Perimetr: " + perimetr);
    }
    
    public void calculateRhombusSurface(int sideLength, int height){
        int surface = sideLength * height;
        System.out.println("Surface: " + surface);
    }

    // calculate Triangle
    public void calculateTrianglePerimetr(int aSide, int bSide, int cSide){
        int perimetr = aSide + bSide + cSide;
        System.out.println("Perimetr: " + perimetr);
    }
    
    public void calculateTriangleSurface(int aSide, int bSide, int cSide){ // 6 6 8
        double pVar = (aSide + bSide + cSide) / 2; //ОШИБКА!!! // 10
        System.out.println(pVar);
        double surface = Math.sqrt (pVar * (pVar - aSide) * (pVar - bSide) * (pVar - cSide)); // 
        System.out.println("Surface: " + surface);
    }
}
