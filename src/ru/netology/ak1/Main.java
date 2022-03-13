package ru.netology.ak1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        String[] gamesNewDir = {"src", "res", "savegames", "temp"};

        for (int i = 0; i < gamesNewDir.length; i++) {
            File dir = new File("C:/Games/" + gamesNewDir[i]);
            if (dir.mkdir())
                sb.append("Директория " + gamesNewDir[i] + " в папке Games успешно создана");
            sb.append("\n");
        }

        String[] srcNewDir = {"main", "test"};

        for (int i = 0; i < srcNewDir.length; i++) {
            File dir = new File("C:/Games/src/" + srcNewDir[i]);
            if (dir.mkdir())
                sb.append("Директория " + srcNewDir[i] + " в каталоге src успешно создана");
            sb.append("\n");
        }

        String[] resNewDir = {"drawables", "vectors", "icons"};

        for (int i = 0; i < resNewDir.length; i++) {
            File dir = new File("C:/Games/res/" + resNewDir[i]);
            if (dir.mkdir())
                sb.append("Директория " + resNewDir[i] + " в каталоге res успешно создана");
            sb.append("\n");
        }

        String[] mainNewFile = {"Main.java", "Utils.java"};

        for (int i = 0; i < mainNewFile.length; i++) {
            File newFile = new File("C:/Games/src/main/" + mainNewFile[i]);
            try {
                if (newFile.createNewFile()) {
                    sb.append("Файл " + mainNewFile[i] + " в подкаталоге main успешно создан");
            sb.append("\n");
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

        File tempTxt = new File("C:/Games/temp/temp.txt");

        try {
            if (tempTxt.createNewFile())
                sb.append("Файл temp.txt в директории temp успешно создан");
            sb.append("\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        String result = sb.toString();
        System.out.println(result);

        File file = new File("C:/Games/temp/temp.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
