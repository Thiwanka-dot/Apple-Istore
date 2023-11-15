package apple.istore;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class SmartPhoneLab {
    String myFile = "C:\\Users\\lenovo\\OneDrive\\Documents\\NetBeansProjects\\Apple iStore\\Products.txt";
        public void makeconnection(String Record, String file){
            try {
               myFile = myFile + file;
               FileWriter myWriter = new FileWriter(myFile, true);
               BufferedWriter buffer = new BufferedWriter(myWriter);
               
               buffer.write(Record);
               buffer.newLine();
               buffer.close();
               myWriter.close();
               
               JOptionPane.showMessageDialog(null, "Successfully inserted to the file!");
            }
            catch (IOException e){
                System.out.println("Error occured!");
                e.printStackTrace();
            }
        }
        
        public void search(String value,String file){
            try {
                myFile = myFile + file;
                boolean found = true;
                String[] words = null;
                FileReader FileT = new FileReader(myFile);
                BufferedReader RT = new BufferedReader(FileT);
                
                String FindLine, input = value;
                
                outerLoop:
                while ((FindLine = RT.readLine()) != null){
                    words = FindLine.split(" ");
                    for (String word : words){
                        if (word.equals(input)){
                            found = true;
                            System.out.println(FindLine);
                            break outerLoop;
                        }
                        else {
                            found = false;
                        }
                    }
                }
                if (found){
                    JOptionPane.showMessageDialog(null, "The value is in the list!");
                }
                else {
                    JOptionPane.showMessageDialog(null, "The value is not in the list!");
                }
                FileT.close();
                RT.close();
            }
            catch (Exception e){
                System.err.println("Error occured!" + e);
            }
        }
        String myFile2 = "C:\\Users\\lenovo\\OneDrive\\Documents\\NetBeansProjects\\Apple iStore\\SmartPhoneLab.txt";
        public void makeconnection2(String Record,String file){
            try {
               myFile2 = myFile2 + file;
               FileWriter myWriter = new FileWriter(myFile2, true);
               BufferedWriter buffer = new BufferedWriter(myWriter);
               
               buffer.write(Record);
               buffer.newLine();
               buffer.close();
               myWriter.close();
               
               JOptionPane.showMessageDialog(null, "Successfully inserted to the file!");
            }
            catch (IOException e){
                System.out.println("Error occured!" + e);
                e.printStackTrace();
            }
        }
    public static void main(String args[]){
        Startup StartupFrame = new Startup();
        StartupFrame.setVisible(true);
        StartupFrame.pack();
        StartupFrame.setLocationRelativeTo(null);          
    }
}
