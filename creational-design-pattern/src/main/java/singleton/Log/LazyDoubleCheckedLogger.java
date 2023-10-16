package singleton.Log;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LazyDoubleCheckedLogger {
    private static volatile LazyDoubleCheckedLogger instance;
    private PrintWriter logFile;
    private SimpleDateFormat dateFormat;

    private LazyDoubleCheckedLogger() {
        try {
            logFile = new PrintWriter(new FileWriter("double-checked-application.log", true), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    public static LazyDoubleCheckedLogger getInstance() {
        if (instance == null) {
            synchronized (LazyDoubleCheckedLogger.class) {
                if (instance == null) {
                    instance = new LazyDoubleCheckedLogger();
                }
            }
        }
        return instance;
    }

    public void log(String message) {
        String timestamp = dateFormat.format(new Date());
        logFile.println(timestamp + " - " + message);
    }

    public void close() {
        if (logFile != null) {
            logFile.close();
        }
    }
}