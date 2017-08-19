package week4;

import java.util.Random;

public class PasswordRandomizer
{
    private final String alphabet;
    private final int length;
    private final Random random;
    private String password;

    public PasswordRandomizer(int length) {
        alphabet = "abcdefghijklmnopqrstuvwxyz";
        password = "";
        this.length = length;
        random = new Random();
    }

    public String createPassword() {
        for (int i = 0; i < length; ++i) {
            final int num = this.random.nextInt(alphabet.length());
            final char letter = alphabet.charAt(num);
            password += letter;
        }

        return password;
    }

    public void resetPassword() {
        password = "";
    }
}
