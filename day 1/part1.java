import java.util.*;

public class LargeInputProcessing {
    public static void main(String[] args) {
       
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your numbers :");
        
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("exit")) {
                break;
            }

            String[] parts = line.split("\\s+");
            left.add(Integer.parseInt(parts[0]));
            right.add(Integer.parseInt(parts[1]));
        }


        processLists(left, right);

        // Close the scanner
        scanner.close();
    }

    private static void processLists(List<Integer> left, List<Integer> right) {

        Collections.sort(left);
        Collections.sort(right);


        int totalDifference = 0;
        for (int i = 0; i < left.size(); i++) {
            totalDifference += Math.abs(left.get(i) - right.get(i));
        }

        System.out.println("Total Absolute Difference: " + totalDifference);
    }
}
