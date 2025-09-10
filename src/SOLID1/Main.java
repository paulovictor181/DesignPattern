package SOLID1;

import SOLID1.Util.FileManage;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user = new User("Paulo", "paulo@gmail.com");

        FileManage fileManage = new FileManage();

        fileManage.saveTtoFile(user);

        System.out.println("Fim do programa");
    }
}