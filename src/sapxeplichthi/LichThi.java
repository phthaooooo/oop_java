package sapxeplichthi;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class LichThi {
    private static int id = 1;
    private String date;
    private String time;
    private String code, subject_name, group;
    private int numofStudent;
    private Subject subject;
    private CaThi cathi;
    private String idRoom;

    public LichThi(String subject_name, String group, int numofStudent, Subject subject, CaThi cathi) {
        this.subject = subject;
        this.subject_name = subject.getName();
        this.group = group;
        this.numofStudent = numofStudent;
        this.cathi = cathi;
    }

    public String getDate() {
        return cathi.getDate();
    }

    public void setDate(String date) {
        this.date = cathi.getDate();
    }

    public String getTime() {
        return cathi.getTime();
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getIdRoom() {
        return cathi.getRoom();
    }

    public void setIdRoom(String idRoom) {
        this.idRoom = idRoom;
    }

    @Override
    public String toString() {
        return getDate() + " " + getTime() + " " + getIdRoom() + " " + subject_name + " " + group + " " + numofStudent;
    }


}
