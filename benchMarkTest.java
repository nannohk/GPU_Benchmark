import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class benchMarkTest
{

    private String vid1path = "";
    private String vid2path = "";
    private String vid3path = "";
    private String vid4path = "";
    static String line="";

    public static void main(String[]args) throws IOException
    {
        // System.out.println("Obtaining System Data:\n");
        // System.out.println("Processor Identifier: " + System.getenv("PROCESSOR_IDENTIFIER"));
        // System.out.println("Processor Architecture: " + System.getenv("PROCESSOR_ARCHITECTURE")); 
        // System.out.println("Number of Processors: " + System.getenv("NUMBER_OF_PROCESSORS"));
        // System.out.println("Operating System: " + System.getenv("OS"));
        // System.out.println("Operating System: " + System.getenv("PROCESSOR_LEVEL"));

        StringBuilder stringBuilder = new StringBuilder();
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("systeminfo");
        try (BufferedReader systemInformationReader = new BufferedReader(new InputStreamReader(process.getInputStream())))
        {
            while ((line = systemInformationReader.readLine()) != null)
            {
                stringBuilder.append(line);
                stringBuilder.append(System.lineSeparator());
            }
        }
         catch (IOException e)
        {
            e.printStackTrace();
        }

System.out.println(stringBuilder);        
    }


    public long test1()
    {
        long startTime = System.nanoTime();
        long timeElapsed = System.nanoTime() - startTime;
        return timeElapsed;
    }

    public long test2()
    {
        long startTime = System.nanoTime();
        long timeElapsed = System.nanoTime() - startTime;
        return timeElapsed;
    }
    public long test3()
    {
        long startTime = System.nanoTime();
        long timeElapsed = System.nanoTime() - startTime;
        return timeElapsed;
    }
    public long test4()
    {
        long startTime = System.nanoTime();
        long timeElapsed = System.nanoTime() - startTime;
        return timeElapsed;
    }

 
}