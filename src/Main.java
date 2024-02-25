import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Assignment assignment = new ProgramAssignmentFactory().get_assignment(input);
        System.out.println(assignment.get_assignment());
    }
}