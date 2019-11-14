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

    public boolean startsWith(String a, String b) {
        if ("".equals(a) && "".equals(b)) {
            return true;
        }
        if ("".equals(a) && !"".equals(b)) {
            return false;
        }
        if (!"".equals(a) && "".equals(b)) {
            return false;
        }
        char op[] = a.toCharArray();
        char opp[] = b.toCharArray();
        for (int i = 0; i < opp.length; i++) {
            if (op[i] != opp[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean endsWith(String x, String y) {
        char exo[] = x.toCharArray();
        char xexo[] = y.toCharArray();
        int k = exo.length - 1;
        for (int i = xexo.length - 1; i >= 0; i--) {
            if (exo[k] != xexo[i]) {
                return false;
            }
            k--;
        }
        return true;
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
    

//    public int compareToIgnoreCase(MyString s) {
//        int x = 0;
//        if (c.length == c.length) {
//            for (int i = 0; i < c.length; i++) {
//                if (c[i] == c[i] || c[i] + 32 == c[i] || c[i] - 32 == c[i]) {
//                } else {
//                    x = c[i] - c[i];
//                    break;
//                }
//            }
//        } else {
//            x = c.length - c.length;
//        }
//        return x;
//    }

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

//    public void indexOf(String input, char car) {
//        char carar[] = input.toCharArray();
//        for (int i = 0; i < carar.length; i++) {
//            if (carar[i] == car) {
//                System.out.println(i);
//                return;
//            }
//        }
//        System.out.println("-1");
//    }
    
}
