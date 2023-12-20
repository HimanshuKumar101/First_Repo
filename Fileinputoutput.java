import java.io.*;

public class Fileinputoutput {
    public static void main(String[] args) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\himan\\OneDrive\\Desktop\\textfile"))) {

            bw.write("himans");
            bw.newLine(); // Add a newline between each write
            bw.write("chitrang");
            bw.newLine();
            bw.write("anil");

            // No need to explicitly close when using try-with-resources

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        /*
         * try{
         * BufferedReader br = new BufferedReader(
         * new FileReader(new file(""));
         * String s;
         * while((s = br.readLine()) != null){
         * System.out.println(s);
         * }
         * br.close();
         * }catch(exception ex){
         * return;
         * }
         * 
         */

        /*
         * // copy from file
         * {
         * try
         * }
         */
    }
}
