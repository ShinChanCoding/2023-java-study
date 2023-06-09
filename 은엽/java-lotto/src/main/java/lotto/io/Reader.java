package lotto.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class Reader {

    private static final BufferedReader br;

    static {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    private Reader() {

    }

    public static String read() {
        try {
            return br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
