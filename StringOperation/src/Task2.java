public class Task2 {
    public void letter(String name) {
        String[] arr = name.split(" ");
        int[] len = new int[arr.length];
        for (int index = 0; index < arr.length; index++) {
              len[index] = arr[index].length();
        }
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
            System.out.print(len[index] + " ");
        }
    }

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.letter("RCB will win the match");
    }
}
