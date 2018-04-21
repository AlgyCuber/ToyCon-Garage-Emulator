package net.zero918nobita.NLEmulator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final String ls = System.lineSeparator();
    private static final String version = "1.0";

    public static void main(String[] args) {
        if (args.length == 0) {
            usage();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String str;

            while (true) {
                System.out.print(ls + "> ");

                try {
                    str = bufferedReader.readLine();
                    if (str.equals("exit") || str.equals("quit")) break;
                } catch (IOException e) {
                    e.printStackTrace();
                    break;
                }
            }
        }
    }

    private static void usage() {
        System.out.println(
                "  _   _ _       _                 _         _          _                  " + ls +
                " | \\ | (_)_ __ | |_ ___ _ __   __| | ___   | |    __ _| |__   ___        " + ls +
                " |  \\| | | '_ \\| __/ _ \\ '_ \\ / _` |/ _ \\  | |   / _` | '_ \\ / _ \\ " + ls +
                " | |\\  | | | | | ||  __/ | | | (_| | (_) | | |__| (_| | |_) | (_) |      " + ls +
                " |_|_\\_|_|_| |_|\\__\\___|_| |_|\\__,_|\\___/  |_____\\__,_|_.__/ \\___/ " + ls +
                " | ____|_ __ ___  _   _| | __ _| |_ ___  _ __                             " + ls +
                " |  _| | '_ ` _ \\| | | | |/ _` | __/ _ \\| '__|                          " + ls +
                " | |___| | | | | | |_| | | (_| | || (_) | |                               " + ls +
                " |_____|_| |_| |_|\\__,_|_|\\__,_|\\__\\___/|_|                      " + ls + ls +
                "Version: " + version);
    }
}
