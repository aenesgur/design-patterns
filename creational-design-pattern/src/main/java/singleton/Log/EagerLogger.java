package singleton.Log;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EagerLogger {
    private static final EagerLogger instance = new EagerLogger();
    private PrintWriter logFile;
    private SimpleDateFormat dateFormat;

    private EagerLogger() {
        try {
            logFile = new PrintWriter(new FileWriter("eager-application.log", true), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    public static EagerLogger getInstance() {
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