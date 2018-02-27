package com.bravedroid.context_reuse.problem1.after.solution1;


import java.io.IOException;
import java.io.InputStream;

public class StreamProcessorContext {
    //the plugin interface
    public interface StreamProcessor {

        void process(int input);

    }


    //the stream processing context class

    public void processStream(InputStream inputStream,
                              StreamProcessor processor) throws IOException {

        if (inputStream == null) return;

        IOException exception = null;
        try {
            int character = inputStream.read();

            while (character != -1) {
                processor.process(character);
                character = inputStream.read();
            }
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                if (exception == null) throw e;
                throw exception;
            }
        }
    }
}
