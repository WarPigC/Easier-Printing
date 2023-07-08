public class Print{
    public void p(){
        System.out.println(" ");
    }
    public void p(String a){
        System.out.println(a);
    }
    public void p(char a){
        System.out.println(a);
    }
    public void p(double a){
        System.out.println(a);
    }
    public void p(float a){
        System.out.println(a);
    }
    public void p(long a){
        System.out.println(a);
    }
    public void p(short a){
        System.out.println(a);
    }
    public void p(int a){
        System.out.println(a);
    }
    public void p(byte a){
        System.out.println(a);
    }
    public void p(int[] a){
        String i = "int Array: ";
        for (int x:a){
            i += x + " ";
        }
        System.out.println(i);
    }
    public void p(String[] a){
        String i = "String Array: ";
        for (String x:a){
            i += x + " ";
        }
        System.out.println(i);
    }
    public void p(char[] a){
        String i = "char Array: ";
        for (char x:a){
            i += x + " ";
        }
        System.out.println(i);
    }
    public void p(double[] a){
        String i = "double Array: ";
        for (double x:a){
            i += x + " ";
        }
        System.out.println(i);
    }
    public void p(float[] a){
        String i = "float Array: ";
        for (float x:a){
            i += x + " ";
        }
        System.out.println(i);
    }
    public void p(short[] a){
        String i = "short Array: ";
        for (short x:a){
            i += x + " ";
        }
        System.out.println(i);
    }
    public void p(byte[] a){
        String i = "byte Array: ";
        for (byte x:a){
            i += x + " ";
        }
        System.out.println(i);
    }
}