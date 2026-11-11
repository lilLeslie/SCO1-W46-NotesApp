package dk.sea.dal;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class NoteDAO {
    public List<String> readFile(Path filePath) throws IOException {
        try {
            return Files.readAllLines(filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeToFile(Path filePath, List<String> data) {
        try{
            Files.write(filePath, data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
