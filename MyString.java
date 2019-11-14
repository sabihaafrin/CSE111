package assignment05;

public class MyString {

    char[] c;

    public MyString(String s) {
        c = s.toCharArray();
    }

    public int length() {
        return c.length;
    }

    public char charAt(int a) {
        return c[a];
    }

    public boolean startsWith(MyString p)
  {
    if (p.length()> length())
    {
      return false;
    }
    else
    {
      for (int i=0; i<p.length(); i++)
      {
        if(c[i]!=p.charAt(i)) 
        {
          return false;
        } 
      }
      return true;
    }
  }
    public boolean endsWith(MyString s)
  {
    if((s.length())> length())
    {
      return false;
    } 
    else
    {
      for(int i=s.length()-1,j=c.length-1; i>=0; i--,j--)
      {
        if(s.c[i]!=this.c[j]){
          return false;
        }
      }
      return true;
    }
  }

    public char[] replaceFirst(char p, char q) {
        for (int i = 0; i < c.length; i++) {
            if (c[i] == p) {
                c[i] = q;
            }
        }
        return c;
    }

    public char[] replaceAll(char m, char n) {
        for (int k = 0; k < c.length; k++) {
            if (c[k] == m) {
                c[k] = n;
            }
        }
        return c;
    }

    public char[] replaceLast(char r, char s) {
        for (int l = c.length - 1; l >= 0; l--) {
            if (c[l] == r) {
                c[l] = s;
            }
        }
        return c;
    }

    public char[] toLowerCase() {
        for (int s = 0; s < c.length; s++) {
            if (c[s] < 91 && c[s] > 64) {
                c[s] = (char) (c[s] + 32);
            }
        }
        return c;
    }

    public char[] toUpperCase() {
        for (int i = 0; i < c.length; i++) {
            if (c[i] < 123 && c[i] > 96) {
                c[i] = (char) (c[i] - 32);
            }
        }
        return c;
    }

    public boolean equals(MyString exo) {
        for (int i = 0; i < exo.c.length; i++) {
            if (exo.c[i] == this.c[i]) {
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean equalsIgnoreCase(MyString exoL) {
        if (this.c.length == exoL.c.length) {
            char x[] = new char[exoL.c.length];
            char z[] = new char[exoL.c.length];
            for (int i = 0; i < exoL.c.length; i++) {
                if ((int) exoL.c[i] > 96) {
                    int temp = (int) x[i] - 32;
                    x[i] = (char) temp;
                }
            }
            for (int i = 0; i < z.length; i++) {
                if ((int) z[i] > 96) {
                    int temp = (int) z[i] - 32;
                    z[i] = (char) temp;
                }
            }
            for (int i = 0; i < x.length; i++) {
                if (x.length != z.length) {
                    return false;
                }
                if (x[i] != z[i]) {
                    return false;
                }

            }
            return true;
        }
    
    public int compareTo(MyString s)
    {
    if(s!=null)
    {
      for(int i=0;i<c.length;i++)
      {
        if(c[i]==s.c[i])
        {
          return 0;
        }
        else
        {
          if(c[i]>s.c[i])
          {
            return 1;
          }
          else
          {
            return -1;
          }
        }
        
      }
      
      
    }
    return 0;
  }
  
    public int compareToIgnoreCase(MyString s) {
        char[] a = new char[s.c.length];
        char[] b = new char[s.c.length];
        for (int i = 0; i < this.c.length; i++) {
            if ((int) c[i] >= 97 && (int) c[i] <= 122) {
                a[i] = (char) (c[i] - 32);
            } else {
                b[i] = c[i];
            }
        }
        for (int i = 0; i < s.c.length; i++) {
            if ((int) s.c[i] >= 97 && (int) s.c[i] <= 122) {
                a[i] = (char) (s.c[i] - 32);
            } else {
                b[i] = s.c[i];
            }
        }
        int count = 0;
        if (this.c.length == s.c.length) {
            for (int i = 0; i < 1; i++) {
                if ((int) a[i] != (int) b[i]) {
                    count = (int) a[i] - (int) b[i];
                }
            }
    
    public char[] substring(int a) {
        char p[] = new char[c.length - a];
        for (int i = 0; i < p.length;) {
            for (int j = a; j < c.length; j++) {
                p[i] = c[j];
                i++;
            }
        }
        return p;
    }

    public char[] substring(int p, int q) {
        char a[] = new char[q - p];
        for (int i = 0; i < a.length;) {
            for (int j = p; j < q; j++) {
                a[i] = c[j];
                i++;
            }
        }
        return a;
    }

    public char indexOf(char car) {
        char[] a = new char[c.length];
        for (int i = 0; i < c.length; i++) {
            if (c[i] == car) {
                System.out.println(i);
                return car;
            }
        }
        System.out.println("-1");
        return 0;
    }
     public char[] concat(MyString s){
        char[] d = new char[s.c.length];
        char combine[]=new char[c.length+d.length];
        for(int i=0;i<c.length;i++){
            combine[i]=c[i];
        }
        for(int i=c.length;i<c.length+d.length;i++){
            combine[i]=d[i-c.length];
        }
        return combine;
    }

public boolean isEmpty(){
        boolean b=false;
        if(c.length==0) {
            b = true;
        }
        return b;
    }
public String toString(){
        return new  String(c);
    }
   
    }
