package com.bravedroid.context_reuse.problem1.before;

import java.io.IOException;
import java.io.InputStream;

public class StreamManager {
    //could'nt be a StreamPrinter ?
    public void printStream(InputStream inputStream) throws IOException {
        if (inputStream == null) return;

        IOException exception = null;
        try {
            int character = inputStream.read();

            while (character != -1) {
                //CAN BE EXTRACTED FROM ALL THIS CONTEXT (here we print)
                System.out.print((char) character);
                character = inputStream.read();
            }
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                if (exception == null) throw e;
            }
        }
    }

    //could'nt be a StreamToStringReader ?
    public String readStream(InputStream inputStream) throws IOException {
        StringBuffer buffer = new StringBuffer();

        if (inputStream == null) return null;

        IOException exception = null;
        try {
            int character = inputStream.read();

            while (character != -1) {
                //CAN BE EXTRACTED FROM ALL THIS CONTEXT (here we append the char to a string buffer)
                buffer.append((char) character);
                character = inputStream.read();
            }
            //THIS IS THE RESULT WHICH CAN BE A METHOD TO READ THE STRING
            return buffer.toString();
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
