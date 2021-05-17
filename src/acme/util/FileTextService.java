/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acme.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

/**
 *
 * @author jhony
 */
public class FileTextService {

    public String readTxt(String path) {
        String text = "";
        try {
            BufferedReader bf = new BufferedReader(new FileReader(path));
            String temp = "";
            String bfRead;
            while ((bfRead = bf.readLine()) != null) {
                temp = temp + bfRead;
            }
            text = temp;

        } catch (Exception e) {
            System.out.println("Error in:" + e);
        }
        return text;
    }

    public String[] contentSeparatedInLines(String fileContent) {
        return fileContent.split(";");
    }

    public String getNameEmployee(String line) {
        return line.split("=")[0];
    }

    public String getDaySchedule(String line) {
        return line.substring(0, 2);
    }

    public String[] getSchedules(String line) {
        String schedulesLine = line.split("=")[1];
        return schedulesLine.split(",");
    }

    public String getInHour(String schedule) {
        String hour = "";
        hour = schedule.substring(2, 4);
        return hour;
    }

    public String getOutHour(String schedule) {
        String hour = "";
        hour = schedule.substring(8, 10);
        return hour;
    }

    public FileTextService() {
        super();
    }

}
