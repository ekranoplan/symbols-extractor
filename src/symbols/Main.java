package symbols;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ekranoplan on 2016/06/18.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        List<String> symbols = loadSymbols("./data/symbollist.txt");
        String str = loadFile("./data/sample.txt");
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

    private static List<String> loadSymbols(String filePath) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(new File(filePath)));
        String str;
        while ((str = br.readLine()) != null) {
            list.add(str);
        }
        br.close();
        return list;
    }
    
}
