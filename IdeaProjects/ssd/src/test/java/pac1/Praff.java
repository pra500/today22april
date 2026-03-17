package pac1;

public class Praff {
    public static void main(String[] args) {


    try
    {
        String s=null;
       char[] aaa= s.toCharArray();
        System.out.println(aaa.length);

    } catch (Exception e) {
         e.printStackTrace();
    }
    finally {
        System.out.println("finally");
    }
    }

}
