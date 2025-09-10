package SOLID1.Util;

import SOLID1.User;

import java.io.FileWriter;
import java.io.IOException;

public class FileManage {
    public void saveTtoFile(User user){
        try(FileWriter fileWriter = new FileWriter(user.getName() + ".txt")) {
            fileWriter.write(user.getEmail());
            fileWriter.write("\n");
            fileWriter.write(user.getName());
            fileWriter.flush();
            System.out.println("Arquivo Salvo com Sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }
}
