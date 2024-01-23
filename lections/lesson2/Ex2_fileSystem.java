package lections.lesson2;

import java.io.File;

public class Ex2_fileSystem {
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/file.txt");
        File f3 = new File(pathFile);
        System.out.println(f3.getAbsolutePath());

        // System.out.println(pathFile);
        File f1 = new File("C:/programist/javaStudy/java_projects/file.txt");
        File f2 = new File("file.txt");
        System.out.println(f1.getAbsolutePath());
        System.out.println(f2.getAbsolutePath());

    }
}
