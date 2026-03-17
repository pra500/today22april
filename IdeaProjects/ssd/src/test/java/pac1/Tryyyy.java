package pac1;

public class Tryyyy {

    public static void main(String[] args) {

        try
        {
            String sy=null;
       boolean b= sy.contains("ds");
            System.out.println(b);

        } catch (Exception e) {
            e.printStackTrace();
        }
finally {
            System.out.println("executcxed");
        }
    }
}
