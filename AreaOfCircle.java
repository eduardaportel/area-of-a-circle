public class AreaOfCircle {
    public static void main(String[] args) {
        // define pi
        double pi = 3.14159;

        // read the radius
        double R = Double.parseDouble(System.console().readLine());

        // define area
        double area = pi * R * R;
        
        // print area
        System.out.printf("A = %.4f", area);
    } 
}