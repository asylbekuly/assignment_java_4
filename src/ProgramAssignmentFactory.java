public class ProgramAssignmentFactory {
    public Assignment get_assignment(String input){
        if (input.equals("java")){
            return new Java();
        } else if (input.equals("cpp")) {
            return new Cpp();
        } else if (input.equals("python")) {
            return new Python();
        }
        else {
            return null;
        }
    }
}
