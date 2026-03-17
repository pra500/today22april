package pac1;

public class Gh {

    public static void main(String[] args) {
        try {

            int[] arr = {9, 0, 5};
            System.out.println(arr[9]);

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("final thing");
        }
        }


}
