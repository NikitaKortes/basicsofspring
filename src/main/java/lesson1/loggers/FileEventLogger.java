package lesson1.loggers;

import lesson1.beans.Event;

import java.io.File;
import java.io.IOException;

import static org.apache.commons.io.FileUtils.writeStringToFile;

public class FileEventLogger implements EventLogger {

    private String filename;
    private File file;

    public FileEventLogger(String filename) {
        this.filename = filename;
    }

    public void init() throws IOException {
        this.file = new File(filename);

        if ( ! file.exists()){
            if ( ! file.createNewFile())
                throw new IllegalArgumentException("Can't create file");
        } else if ( ! file.canWrite())
            throw new IllegalArgumentException("Can't write to file " + filename);
    }

    public void logEvent(Event event) {
        try {
            writeStringToFile(file, event.toString(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
