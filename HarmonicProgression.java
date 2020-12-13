import java.io.*;  
class HarmonicProgression  
{  
  
    float sum(float n)  
    {  
        // Base condition  
        if (n < 2)  
            return 1;  
  
        else
            return 1 / n + (sum(n - 1));  
    }  
  
    // Driven Code  
    public static void main(String args[])  
    {  
      HarmonicProgression g = new HarmonicProgression();  
      System.out.println(g.sum(8));  
      System.out.print(g.sum(10));  
    }  
}