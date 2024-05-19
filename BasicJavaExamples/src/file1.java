import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileWriter;
import java.io.Writer;
//public class file1 {
//    public static void main(String[] args) throws IOException {
//        File f = new File("C:\\Users\\Lakshay\\IdeaProjects\\firstclass\\BasicJavaExamples\\src\\day.java");
//        FileInputStream fr = null;
//        try {
//            fr = new FileInputStream(f);
//            String ch;
//            InputStreamReader input =new InputStreamReader(fr);
//            BufferedReader br=new BufferedReader(input);
//            while ((ch = br.readLine()) != null) {
//                System.out.println( ch);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (fr != null) {
//                fr.close();
//            }
//        }
//    }
//}


//public class file1 {
//    public static void main(String[] args) throws IOException {
//        File f = new File("C:\\Users\\Lakshay\\IdeaProjects\\firstclass\\BasicJavaExamples\\src\\day.java");
//        FileReader fr = null;
//        try {
//            fr = new FileReader(f);
//            BufferedReader br = new BufferedReader(fr);
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (fr != null) {
//                fr.close();
//            }
//        }
//    }
//}

//public class file1 {
//    public static void main(String[] args) {
//        String data = "hello lakshay how are you ?";
//        File f = new File("C:\\Users\\Lakshay\\Desktop\\vasu.txt");
//        FileWriter fw = null;
//        try {
//            fw = new FileWriter(f);
//            fw.write(data);
//            System.out.println("Data Inserted Successfully. ");
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                fw.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}

//public class file1 {
//    public static void main(String[] args) {
//        String data = "hello lakshay how are you ?";
//        File f = new File("C:\\Users\\Lakshay\\Desktop\\vasu.txt");
//        FileOutputStream fw = null;
//        try {
//            fw = new FileOutputStream(f);
//            fw.write(data.getBytes());
//            System.out.println("Data Inserted Successfully. ");
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                fw.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}

// How to copy data from one file to another ?
public class file1 {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\lakshay\\Desktop\\hello.txt");
        File f2 = new File("C:\\Users\\Lakshay\\Desktop\\vasu.txt");
        FileReader fw1 = null;
        FileWriter fw2 = null;
        try {
            fw1 = new FileReader(f1);
            fw2 = new FileWriter(f2,true);
            int ch;
            System.out.println("Content is copied successfully.");
            while ((ch = fw1.read()) != -1) {
                fw2.write((char) ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                    fw1.close();
                    fw2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}