package symbols;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2016/06/18.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        List<String> symbols = new ArrayList<>();
        symbols.add("�B");
        symbols.add("�A");
        symbols.add("�u");
        symbols.add("�v");
        symbols.add("�i");
        symbols.add("�j");
        symbols.add("�c");
        
        String str = loadFile("./data/sangetsuki.txt");
        String c;
        for (int i = 0; i < str.length(); i++) {
            c = String.valueOf(str.charAt(i));
            if (symbols.contains(c)) {
                System.out.print(c);
            }
        }
        
    }
    
    private static String loadFile(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(filePath)));
        String str;
        StringBuilder sb = new StringBuilder();
        while((str = br.readLine()) != null){
            sb.append(str);
        }
        br.close();
        return sb.toString();
    }

}
