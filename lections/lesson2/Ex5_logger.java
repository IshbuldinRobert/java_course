package lections.lesson2;

import java.io.IOException;
import java.util.logging.*;

public class Ex5_logger {
    public static void main(String[] args) throws IOException {
        
        // 1 (File)
        // Logger logger = Logger.getLogger(Ex5_logger.class.getName());
        // FileHandler fh = new FileHandler("C:/programist/javaStudy/java_projects/lesson2/log.txt");
        // logger.addHandler(fh);

        // SimpleFormatter sFormat = new SimpleFormatter();
        // fh.setFormatter(sFormat);

        // logger.log(Level.WARNING, "Тестовое логирование 1");
        // logger.info("Тестовое логирование 2");
        // logger.log(Level.CONFIG, "Тестовое логирование 3");

        // 2 (Console)
        Logger logger2 = Logger.getLogger(Ex5_logger.class.getName());
        ConsoleHandler ch = new ConsoleHandler();
        logger2.addHandler(ch);

        XMLFormatter xml = new XMLFormatter();
        ch.setFormatter(xml);

        logger2.setLevel(Level.INFO);
        logger2.log(Level.WARNING, "Тестовое логирование 1");
        logger2.info("Тестовое логирование 2");
    }
}