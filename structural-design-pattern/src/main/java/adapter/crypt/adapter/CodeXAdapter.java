package adapter.crypt.adapter;

import adapter.crypt.CodeX;
import adapter.crypt.Crypt;

public class CodeXAdapter implements Crypt {

    private final CodeX codeX;

    public CodeXAdapter(CodeX codeX) {
        this.codeX = codeX;
    }

    @Override
    public void encrypt(String text) {
        codeX.textToCode(text);
    }

    @Override
    public void decrypt(String text) {
        codeX.codeToText(text);
    }
}
