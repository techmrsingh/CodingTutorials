package Basics;

public class StringBasics {


    public static void main(String[] args) {
        String s1 ="Welcome"; // String literal
        String s2=new String("Hello World"); // new keyword (two objects pool, heap)

        System.out.println(s1.length());  // length of the string
        System.out.println(s2.length());  // length including space

        String s3="Hello";
        String s4="Hello";

        System.out.println(s3.compareTo(s4)); //0  this function returns integer

        String s5="Helmo";

        System.out.println(s3.compareTo(s5)); // l m --> -1

        String s6="How are you";
        System.out.println(s3.concat(s6));

        String s7="";
        System.out.println(s7.isEmpty());
        System.out.println(s6.isEmpty());

        String s8=" How are you ";
        System.out.println(s8.trim()); // leading and trailing spaces

        System.out.println(s8.toLowerCase()); // covert all upper case characters to lowercase
        System.out.println(s8.toUpperCase()); // covert all upper case characters to uppercase

        int value=20;
        String s9=String.valueOf(20); // "20"
        System.out.println(s9+23); //2023 // when you add string + int --> internal converstion of that int to String -->"20" + "23" --> "2023"

        String replacedString=s8.replace('o','a');
        System.out.println(replacedString); // replacing a single character with a single character

        String replacedStringword=s8.replace("How","hey");
        System.out.println(replacedStringword);

        String name="Hey How are you Rahul";
        System.out.println(name.contains("How are you"));
        System.out.println(name.contains("Rahul"));
        System.out.println(name.contains("fine"));

        System.out.println(s3.equals(s4));
        System.out.println(s3.equals(s5));

        String s10="hello";

        System.out.println(s3.equals(s10)); //s3=Hello and s10=hello

        System.out.println(s3.equalsIgnoreCase(s10));

        char test[]=s6.toCharArray(); // String s6="How are you";
        for(int i=0;i<test.length;i++){
            System.out.print(test[i]+"|");
        }

        //String is immutable
        StringBuffer sb=new StringBuffer();
        StringBuilder sb1=new StringBuilder();
        sb.append(s10);
        System.out.println();
        System.out.println(name.indexOf('e'));//     String name="Hey How are you Rahul";
        System.out.println(name.lastIndexOf('e'));

    }


}
