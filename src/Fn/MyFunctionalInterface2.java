package Fn;

import java.io.IOException;
import java.io.PrintWriter;

public interface MyFunctionalInterface2 {
    public void execute();

    public default void print1(String text) {
        System.out.println(text);
    }

    public static void print2(String text, PrintWriter writer) throws IOException {
        writer.write(text);
    }
}
