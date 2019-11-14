package assignment05;

public class Tester {
    public static void main(String[] args) {

        MyString s1 = new MyString("ABCDE");
        System.out.println(s1.length());
        System.out.println(s1.charAt(3));
        MyString s2 = new MyString("DFID");
        System.out.println(s2.startsWith("BDE","SDS"));
        MyString s3 = new MyString("FDGKL");
        System.out.println(s3.endsWith("GKL","SD"));
        MyString s4 = new MyString("EFGHI");
        System.out.println(s4.replaceFirst('F','G'));
        System.out.println(s4.replaceAll('E', 'H'));
        System.out.println(s4.replaceLast('H','I'));  
        MyString s5 = new MyString("sABIha");
        System.out.println(s5.toLowerCase());
        System.out.println(s5.toUpperCase());
        System.out.println(s3.equals(s2));           
        //System.out.println(s3.equalsIgnoreCase("sabiha")); 
        MyString s6 = new MyString("ExoIsGreat");
       //System.out.println(s6.compareToIgnoreCase("lala"));
        MyString s7=new MyString("sabiha-afrin");
        System.out.println(s7.substring(6));
        MyString s8=new MyString("byun baekhyunn");
        System.out.println(s8.substring(8,9));
        MyString s9=new MyString("kyungsoo");
        //System.out.println(s9.indexOf('g'));
       // System.out.println(s9.lastIndexOf('o'));
       // System.out.println(s9.indexOf('o',6));
       // System.out.println(s9.lastIndexOf('o',7));            


    }
}
