package com.bravedroid.context_reuse.problem1.after.solution2;


import java.io.IOException;
import java.io.InputStream;

public abstract class StreamProcessorContext {
    //the plugin interface

    abstract void process(int input);


    //the stream processing context class

    public void processStream(InputStream inputStream) throws IOException {

        if (inputStream == null) return;

        IOException exception = null;
        try {
            int character = inputStream.read();

            while (character != -1) {
                process(character);
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

    //the printer
    public static class DefaultImpl extends StreamProcessorContext {
        @Override
        void process(int input) {
            System.out.print((char) input);
        }
    }
}
