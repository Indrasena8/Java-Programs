#Note: Provide an Input file called ABC.txt
import java.io.*;                                                                    
public class InputStreamDemo                                                             
{                                                                                    
    public static void main(String[] args) throws FileNotFoundException, IOException                                                                                     
    {                                                                               
                                                                     
        // initializing FileInputStream  
        try {
            FileInputStream geek = new FileInputStream("ABC.txt");       
            System.out.println("File opened...");                                                                    
            // Initializing InputStreamReader object                     
            InputStreamReader in_strm = new InputStreamReader(geek);                                                         
            int t;                                                      
            String read_reslt="";                                        
                                                                        
            // Use of read() method                                      
            while((t = in_strm.read()) != -1)                            
            {                                                            
                read_reslt = read_reslt+(char)t;                         
            }                                                            
                                                                        
            // print the result read from the file                       
            System.out.println(read_reslt);                              
        }     
        catch(IOException e){
            System.err.println("File opening failed:");
            e.printStackTrace();
        }                     
    }
}   
