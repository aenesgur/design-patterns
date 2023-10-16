package singleton.Log;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LazySafeLogger {
    private static LazySafeLogger instance;
    private PrintWriter logFile;
    private SimpleDateFormat dateFormat;

    private LazySafeLogger() {
        try {
            logFile = new PrintWriter(new FileWriter("lazy-safe-application.log", true), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    public static synchronized LazySafeLogger getInstance() {
        if (instance == null) {
            instance = new LazySafeLogger();
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
