package sapxeplichthi;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class CaThi {
    private static int id = 1;
    private String code, room;
    private String date;
    private String time;

    public CaThi(String date, String time, String room) {
        this.code = String.format("C%03d", id++);
        this.date = date;
        this.time = time;
        this.room = room;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    @Override
    public String toString() {
        return date + " " + time + " " + room;
    }


}
