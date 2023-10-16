package singleton.Log;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public enum EnumLogger {
    INSTANCE;

    private PrintWriter logFile;
    private SimpleDateFormat dateFormat;

    private EnumLogger() {
        try {
            logFile = new PrintWriter(new FileWriter("enum-application.log", true), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
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
