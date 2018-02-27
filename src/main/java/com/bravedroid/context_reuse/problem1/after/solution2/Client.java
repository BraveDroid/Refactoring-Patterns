package com.bravedroid.context_reuse.problem1.after.solution2;

import java.io.FileInputStream;
import java.io.IOException;

public class Client {
    public void useStreamProcessorContext() throws IOException {

        FileInputStream inputStream = new FileInputStream("myFile");

        //the StreamPrinter is the default impl of StreamProcessorContext
        StreamProcessorContext streamProcessorContext = new StreamProcessorContext.DefaultImpl();
        streamProcessorContext.processStream(inputStream);

        //the StreamToStringReader
        StreamToStringReader streamToStringReader = new StreamToStringReader();
        streamProcessorContext.processStream(inputStream);
        streamToStringReader.getStreamString();

    }

    //an extension which extends StreamProcessorContext  and define its way to do the process algorithm for reading the steam as a String
    private static class StreamToStringReader extends StreamProcessorContext {
        private StringBuffer buffer = new StringBuffer();

        String getStreamString() {
            return this.buffer.toString();
        }

        @Override
        public void process(int input) {
            this.buffer.append((char) input);
        }
    }
}
