package pl.sda.marcin.balicki.vector.paint.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SDAFileReader {

    private File file;

    public SDAFileReader(File file) {
        this.file = file;
    }

    public List<String> readFile() {
        List<String> data = new ArrayList<>();
        BufferedReader br = null;
        try {
            System.out.println(file.getAbsolutePath());
            java.io.FileReader fileReader = new java.io.FileReader(file);
            br = new BufferedReader(fileReader);

            String nextLine = br.readLine();
            while (nextLine != null) {
                System.out.println(nextLine);
                data.add(nextLine);
                nextLine = br.readLine();
            }

            System.out.println("Koniec pliku");
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
