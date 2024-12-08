import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        System.out.println("Enter numbers separated by space: ");
        Scanner sc = new Scanner(System.in);


        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.equalsIgnoreCase("exit"))
                break;

            String[] parts = line.split("\\s+");
            left.add(Integer.parseInt(parts[0]));
            right.add(Integer.parseInt(parts[1]));

        }
        processLists(left, right);
        sc.close(); 
    }

    private static void processLists(List<Integer> left, List<Integer> right) {
        int similarity = 0;
        for (Integer integer : left) {
            int cpt = 0;
            for (Integer value : right) {
                if (integer.equals(value)) { 
                    cpt++;
                }
            }
            similarity += integer * cpt;
        }
        System.out.println("result :" +similarity);
    }
}
