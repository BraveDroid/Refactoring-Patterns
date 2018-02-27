package com.bravedroid.context_reuse.problem1.before;

import java.io.FileInputStream;
import java.io.IOException;

public class Client {
    public void useStreamManager() throws IOException {
        StreamManager streamManager = new StreamManager();
        FileInputStream fileInputStream = new FileInputStream("file");
        streamManager.printStream(fileInputStream);
        streamManager.readStream(fileInputStream);
    }


}
