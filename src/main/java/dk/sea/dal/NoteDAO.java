package dk.sea.dal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NoteDAO {
    public List<String> readFile(File file) {

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            List<String> lines = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null){
                lines.add(line);
            }
            return lines;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
