package ru.netology.ak1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        File dir = new File("C:/Games/src");
        if (dir.mkdir())
            sb.append("Директория src в папке Games успешно создана");
        sb.append("\n");
        File dir2 = new File("C:/Games/res");
        if (dir2.mkdir())
            sb.append("Директория res в папке Games успешно создана");
        sb.append("\n");
        File dir3 = new File("C:/Games/savegames");
        if (dir3.mkdir())
            sb.append("Директория savegames в папке Games успешно создана");
        sb.append("\n");
        File dir4 = new File("C:/Games/temp");
        if (dir4.mkdir())
            sb.append("Директория temp в папке Games успешно создана");
        sb.append("\n");
        File dir5 = new File("C:/Games/src/main");
        if (dir5.mkdir())
            sb.append("Директория main в каталоге src успешно создана");
        sb.append("\n");
        File dir6 = new File("C:/Games/src/test");
        if (dir6.mkdir())
            sb.append("Директория test в каталоге src успешно создана");
        sb.append("\n");

        File Main = new File("C:/Games/src/main/Main.java");

        try {
            if (Main.createNewFile())
                sb.append("Файл Main.java в подкаталоге main успешно создан");
            sb.append("\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File Utils = new File("C:/Games/src/main/Utils.java");

        try {
            if (Utils.createNewFile())
                sb.append("Файл Utils.java в подкаталоге main успешно создан");
            sb.append("\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        File dir7 = new File("C:/Games/res/drawables");
        if (dir7.mkdir())
            sb.append("Директория drawables в каталоге res успешно создана");
        sb.append("\n");

        File dir8 = new File("C:/Games/res/vectors");
        if (dir8.mkdir())
            sb.append("Директория vectors в каталоге res успешно создана");
        sb.append("\n");

        File dir9 = new File("C:/Games/res/icons");
        if (dir9.mkdir())
            sb.append("Директория icons в каталоге res успешно создана");
        sb.append("\n");

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
