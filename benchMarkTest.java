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

            output.append("------------------------------ New Device -----------------------------------------------\n");
            output.append("Processor Architecture: " + System.getenv("PROCESSOR_ARCHITECTURE") +"\n");
            output.append("Total number of Processors: " + System.getenv("NUMBER_OF_PROCESSORS") +"\n");
            output.append("Number of processors used: " + System.getenv("PROCESSOR_LEVEL")+ "\n");

            while ((line = systemInformationReader.readLine()) != null)
            {
                output.append(line +"\n");
               // output.append(System.lineSeparator());
            }

            output.append("Test 1 number of processors used:\t" + test1() +"\n");
            output.append("Test 2 number of processors used:\t" + test2() +"\n");
            output.append("Test 3 number of processors used:\t" + test3() +"\n");
            output.append("Test 4 number of processors used:\t" + test4() +"\n");

        }
         catch (IOException e)
        {
            e.printStackTrace();
        }

    }


    public static String test1() throws IOException, InterruptedException
    {
        Desktop desk = Desktop.getDesktop();
        File vid = new File("171124_B1_HD_001.mp4");
        desk.open(vid);
        TimeUnit.SECONDS.sleep(9);
        String numproc = System.getenv("PROCESSOR_LEVEL");
        TimeUnit.SECONDS.sleep(9);
        return numproc;
    }

    public static String test2()throws IOException, InterruptedException
    {
        Desktop desk = Desktop.getDesktop();
        File vid = new File("pexels-ambientnature-atmosphere-5956783.mp4");
        desk.open(vid);
        TimeUnit.SECONDS.sleep(12);
        String numproc = System.getenv("PROCESSOR_LEVEL");
        TimeUnit.SECONDS.sleep(10);
        return numproc;
    }

    public static String test3()throws IOException, InterruptedException
    {
        Desktop desk = Desktop.getDesktop();
        File vid = new File("pexels-bethe-observer-6906495.mp4");
        desk.open(vid);
        TimeUnit.SECONDS.sleep(15);
        String numproc = System.getenv("PROCESSOR_LEVEL");
        TimeUnit.SECONDS.sleep(15);
        return numproc;
    }

    public static String test4()throws IOException, InterruptedException
    {
        Desktop desk = Desktop.getDesktop();
        File vid = new File("pexels-laura-tancredi-7076548.mp4");
        desk.open(vid);
        TimeUnit.SECONDS.sleep(5);
        String numproc = System.getenv("PROCESSOR_LEVEL");
        TimeUnit.SECONDS.sleep(5);
        return numproc;
    }

 
}