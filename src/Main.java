import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] argsddd) {

        float sideX;
        float sideY;
        float sideZ;

        Scanner scanner = new Scanner(System.in);
        sideX = scanner.nextInt();
        sideY = scanner.nextInt();
        sideZ = scanner.nextInt();

        if (sideX + sideY > sideZ && sideY + sideZ > sideX && sideX + sideZ > sideY){
            System.out.println("равносторонний");
        }else {
            System.out.println("");
        }
        {
            System.out.println("");
        }

        float cosTriangleB = ((sideX * sideX) + (sideY + ( sideZ * sideZ)) - ( sideY * sideY));
        float cosTriangleA = ((sideX * sideX) + (sideZ * sideZ) - (sideY * sideY)) / (2 * sideX * sideZ);
        if (cosTriangleA > 0){
            System.out.println("Угол А - острый");
        }else if (cosTriangleA == 0){
            System.out.println("Угол А - прямой");
        }else if (cosTriangleA < 0){
            System.out.println("Угол А - тупой");
        }

        float c = Math.max(Math.max(sideX, sideY), sideZ);

    }
}