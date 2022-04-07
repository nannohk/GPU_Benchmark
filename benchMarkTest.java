import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;


public class benchMarkTest
{

    // private String vid1path = "";
    // private String vid2path = "";
    // private String vid3path = "";
    // private String vid4path = "";
    // private static long time1 = 0;
    // private static long time2 = 0;
    // private static long time3 = 0;
    // private static long time4 = 0;

    private static String line="";

    public static void main(String[]args) throws IOException, InterruptedException
    {
        System.out.println("Obtaining System Data:\n");
 
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("systeminfo");
        try (BufferedReader systemInformationReader = new BufferedReader(new InputStreamReader(process.getInputStream())); 
             PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("Report.txt",true))))
        {

            output.append("------------------------------ New Device -----------------------------------------------");
            output.append(("Processor Architecture: " + System.getenv("PROCESSOR_ARCHITECTURE\n")));

            while ((line = systemInformationReader.readLine()) != null)
            {
                output.append(line);
                output.append(System.lineSeparator());
            }

            test1();
            test2();
            test3();
            test4();

            // output.append("Test 1 time elapsed: " + time1 + "\n");
            // output.append("Test 2 time elapsed: " + time2 + "\n");
            // output.append("Test 3 time elapsed: " + time3 + "\n");
            // output.append("Test 4 time elapsed: " + time4 + "\n");
            
        }
         catch (IOException e)
        {
            e.printStackTrace();
        }

    }


    public static void test1() throws IOException, InterruptedException
    {
        // long startTime = System.nanoTime();
        Desktop desk = Desktop.getDesktop();
        File vid = new File("171124_B1_HD_001.mp4");
        desk.open(vid);
        // long timeElapsed = System.nanoTime() - startTime;
        TimeUnit.SECONDS.sleep(19);
    }

    public static void test2()throws IOException, InterruptedException
    {
        // long startTime = System.nanoTime();
        Desktop desk = Desktop.getDesktop();
        File vid = new File("pexels-ambientnature-atmosphere-5956783.mp4");
        desk.open(vid);
        TimeUnit.SECONDS.sleep(22);
        // long timeElapsed = System.nanoTime() - startTime;
        // return timeElapsed;
    }

    public static void test3()throws IOException, InterruptedException
    {
        // long startTime = System.nanoTime(); 
        Desktop desk = Desktop.getDesktop();
        File vid = new File("pexels-bethe-observer-6906495.mp4");
        desk.open(vid);
        TimeUnit.SECONDS.sleep(30);
        // long timeElapsed = System.nanoTime() - startTime;
        // return timeElapsed;
    }

    public static void test4()throws IOException, InterruptedException
    {
        // long startTime = System.nanoTime();
        Desktop desk = Desktop.getDesktop();
        File vid = new File("pexels-laura-tancredi-7076548.mp4");
        desk.open(vid);
        TimeUnit.SECONDS.sleep(10);
        // long timeElapsed = System.nanoTime() - startTime;
        // return timeElapsed;
    }

 
}