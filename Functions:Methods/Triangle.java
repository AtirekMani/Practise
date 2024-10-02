public class Triangle {
    public static float area(float a, float b, float c){
        float s=(a+b+c)/2;
        float ar=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));

        return ar;
    }
    public static void main(String[] args) {
        float f= area(2, 3, 4);
        System.out.println("Area of traingle is "+f);
    }
}
