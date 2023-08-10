import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int Ax = sc.nextInt();
        int Ay = sc.nextInt();
        int Az = sc.nextInt();
        int Bx = sc.nextInt();
        int By = sc.nextInt();
        int Bz = sc.nextInt();
        int Cx = sc.nextInt();
        int Cy = sc.nextInt();
        int Cz = sc.nextInt();
        
        double distance = calculateMinDistance(Ax, Ay, Az, Bx, By, Bz, Cx, Cy, Cz);
        
        System.out.printf("%.6f\n", distance);
    }
    
    static double calculateMinDistance(int Ax, int Ay, int Az, int Bx, int By, int Bz, int Cx, int Cy, int Cz) {
        double ABx = Bx - Ax;
        double ABy = By - Ay;
        double ABz = Bz - Az;
        
        double ACx = Cx - Ax;
        double ACy = Cy - Ay;
        double ACz = Cz - Az;
        
        double dotProductABAC = ABx * ACx + ABy * ACy + ABz * ACz;
        double dotProductABAB = ABx * ABx + ABy * ABy + ABz * ABz;
        
        double t = dotProductABAC / dotProductABAB;
        
        double nearestX, nearestY, nearestZ;
        
        if (t < 0) {
            nearestX = Ax;
            nearestY = Ay;
            nearestZ = Az;
        } else if (t > 1) {
            nearestX = Bx;
            nearestY = By;
            nearestZ = Bz;
        } else {
            nearestX = Ax + t * ABx;
            nearestY = Ay + t * ABy;
            nearestZ = Az + t * ABz;
        }
        
        double distance = Math.sqrt((Cx - nearestX) * (Cx - nearestX) + 
                                    (Cy - nearestY) * (Cy - nearestY) + 
                                    (Cz - nearestZ) * (Cz - nearestZ));
        
        return distance;
    }
    
}
