package assignment05;

public class Tester {

    public static void main(String[] args) {

        MyString s1 = new MyString("ABCDE");
        System.out.println(s1.length());
        System.out.println(s1.charAt(3));
        MyString s2 = new MyString("DFID");
        System.out.println(s2.startsWith(s1));
        MyString s3 = new MyString("BD");
        System.out.println(s2.endsWith(s1));
        MyString s4 = new MyString("EFL");
        System.out.println(s4.replaceFirst('F', 'G'));
        System.out.println(s4.replaceAll('E', 'H'));
        System.out.println(s4.replaceLast('H', 'I'));
        MyString s5 = new MyString("sABIha");
        System.out.println(s5.toLowerCase());
        System.out.println(s5.toUpperCase());
        System.out.println(s3.equals(s2));
        // System.out.println(s3.equalsIgnoreCase(s1));    
        MyString s6 = new MyString("ExoIsGreat");
        System.out.println(s6.compareTo(s1));
        //System.out.println(s1.compareToIgnoreCase(s5));
        MyString s7 = new MyString("sabiha-afrin");
        System.out.println(s7.substring(6));
        MyString s8 = new MyString("byun baekhyunn");
        System.out.println(s8.substring(8, 9));
        MyString s9 = new MyString("kyungsoo");
         System.out.println(s9.indexOf('g'));
        // System.out.println(s9.lastIndexOf('o'));
        // System.out.println(s9.indexOf('o',6));
        // System.out.println(s9.lastIndexOf('o',7));            
        MyString s10 = new MyString("Sabihaaa");
        System.out.println(s10.concat(s9));
        MyString s11 = new MyString("");
        System.out.println(s11.isEmpty());
                MyString s12 = new MyString("SAREGAMA");

        System.out.println(s11.toString());

    }
}
