public class Operation {
    public void task(){
        String iplTeam = "RCB will win the match";
        System.out.println("Before: " + iplTeam);
        String[] statement = iplTeam.split(" ");
        for (String state: statement) {
            if (state.equals("win")) {
                reverse("win");
            } else if (state.equals("the")) {
                reverse("the");
            }
            else {
                System.out.println(state);
            }
        }
    }

    public void reverse(String word) {
        String reverse = "";
        for (int index = 0; index<word.length();index++) {
            reverse = word.charAt(index) + reverse;
        }
        System.out.println(reverse + " ");;
    }

    public static void main(String[] args) {
        Operation operation = new Operation();
        operation.task();

    }
}
