package com.bravedroid.context_reuse.problem1.after.solution1;

import java.io.FileInputStream;
import java.io.IOException;

public class Client {
    public void useStreamProcessorContext() throws IOException {

        FileInputStream inputStream = new FileInputStream("myFile");

        //the StreamPrinter
        StreamProcessorContext streamProcessorContext = new StreamProcessorContext();
        streamProcessorContext.processStream(inputStream, new StreamProcessorContext.StreamProcessor() {
            public void process(int input) {
                System.out.print((char) input);
            }
        });

        //the StreamToStringReader
        StreamToStringReader streamToStringReader = new StreamToStringReader();
        streamProcessorContext.processStream(inputStream, streamToStringReader);
        streamToStringReader.getStreamString();

    }


    private static class StreamToStringReader implements StreamProcessorContext.StreamProcessor {
        private StringBuffer buffer = new StringBuffer();

        String getStreamString() {
            return this.buffer.toString();
        }

        public void process(int input) {
            this.buffer.append((char) input);
        }
    }
}
