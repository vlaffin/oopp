package oopp;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileOperationImp implements FileOperation {
    private final String fileName;
    public FileOperationImp(String fileName) {
        this.fileName = fileName;
        try (FileWriter writer = new FileWriter(fileName, true)){
            writer.flush();
        } catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public List<String> readAllLines() {
        List<String> lines = new ArrayList<>();
        try {
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            if (line != null){
                lines.add(line);
            }
            while (line != null){
                line = bufferedReader.readLine();
                if (line != null){
                    lines.add(line);
                }
            }
            fileReader.close();
        } catch (IOException exception){
            exception.printStackTrace();
        }
        return lines;
    }

    @Override
    public void saveAllLines(List<String> lines) {
        try (FileWriter writer = new FileWriter(fileName, false)) {
            for (String line : lines){
                writer.write(line);
                writer.append('\n');
            }
            writer.flush();
        } catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}