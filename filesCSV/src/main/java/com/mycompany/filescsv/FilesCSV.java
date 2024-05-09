package com.mycompany.filescsv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import manegeFile.ReadFile;

public class FilesCSV {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./data.csv");
        
        ReadFile readFile = new ReadFile(file);
        
        List<String> data = readFile.loadData();
        
        for(String line : data){
            String[] splited = new String [4];
            splited = line.split(";");
            System.out.println("hola " + splited[0] + " " + splited[1] + " " + splited[2] + " " + splited[3]);
            
        }
    }
}
