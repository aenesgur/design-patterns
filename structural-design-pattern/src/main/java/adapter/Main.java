package adapter;

import adapter.crypt.CodeX;
import adapter.crypt.Crypt;
import adapter.crypt.CryptA;
import adapter.crypt.CryptB;
import adapter.crypt.adapter.CodeXAdapter;

public class Main {
    public static void main(String[] args) {

        Crypt cryptA = new CryptA();
        cryptA.encrypt("12345");

        Crypt cryptB = new CryptB();
        cryptB.decrypt("213dsa1");

        Crypt codeX = new CodeXAdapter(new CodeX());
        codeX.encrypt("sa12112");
    }
}
