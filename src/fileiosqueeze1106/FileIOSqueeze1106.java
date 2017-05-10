/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fileiosqueeze1106;

/**
 *
 * @author kms080
 */
import java.io.File;
import java.util.Scanner;
public class FileIOSqueeze1106 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in;
        try {
            File f = new File("squeeze.txt");
            in = new Scanner(f);
            int spaces = 0;
            String[] lines = new String[(int)f.length() - 1];
            int line = 0;
            while(in.hasNext()) {
                lines[line] = in.nextLine();
                line++;
            }
            for(int i = 0; i <= line; i++) {
                int k = 0;
                while(lines[i].substring(k, k + 1).equals(" ")) {
                    spaces++;
                    k++;
                }
                System.out.print(spaces + lines[i].substring(k) + "\n");
                spaces = 0;
            }
//            for(int i = 1; i <= line - 1; i++) {
//                System.out.print(revisedLines[i] + "\n");
//            }
        }
        catch(Exception i) {
            System.out.print("ERROR: " + i.getMessage());
        }
    }
}
