import java.util.Scanner;
class TrueCallerReplica {

    public static void main(String[] args) {

        String[][] data = new String[][]{
                {"Vasu", "987654321", "Bengaluru"},
                {"Durga", "987650123", "Hyderabad"},
                {"Sachin", "987654444", "Chennai"},
                {"Praveen", "987652244", "Mumbai"},
                {"Teja", "987650099", "Delhi"},
                {"Veer","8976543234","Bengaluru"},
                {"Vinay","879546231","Belgavi"}
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Name or Number to search: ");
        String input = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i][0].equals(input) || data[i][1].equals(input)) {
                System.out.println("\nName: " + data[i][0]);
                System.out.println("Number: " + data[i][1]);
                System.out.println("Address: " + data[i][2]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("\nNo records found!");
        }
    }
}
