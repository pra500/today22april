package Speedpac;

public class Pgm {
    public static void main(String[] args) {


//
//        Block 2: Java Logic Flash Coding (20 min)
//
//        Task (choose ONE only):
//        1️⃣ Check if a string is palindrome
//        2️⃣ Count vowels in a string
//        3️⃣ Find second largest number in array

        //palindrome trial:

        String str="madam";
        String str1="";


        for(int i=str.length()-1;i>=0;i--)
        {
            str1=str1+str.charAt(i);
        }

        if(str1.equalsIgnoreCase(str))
        {
            System.out.println("yes plaindro");
        }
        else {
            System.out.println("no plaindro");
        }






        String str2="prgaio";
        int count=0;

        for(int i=0;i<=str2.length()-1;i++)
        {
            if(str2.charAt(i)=='a' || str2.charAt(i)=='e' ||str2.charAt(i)=='i' || str2.charAt(i)=='o' || str2.charAt(i)=='u')
            {
                System.out.println(str2.charAt(i));
                count++;
            }
        }

        System.out.println("total vowels are " + count);




//second largest:

        int[] arr={9, 0, 7, 17};
        int temp;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {

                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }


        System.out.println(arr[arr.length-2]);





















    }
}
