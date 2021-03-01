package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld {

    public static void main(String[] args) throws IOException {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        String userName = inputReader.readLine();
        System.out.println("Hello,\n" + userName);
    }
}
