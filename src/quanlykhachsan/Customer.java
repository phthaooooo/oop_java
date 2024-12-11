package quanlykhachsan;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Customer {
    private static int id = 1;
    private String codeC, codeR, name;
    private LocalDate ngayDen, ngayDi;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public Customer(String codeR, LocalDate ngayDen, LocalDate ngayDi) {
        this.codeC = String.format("KH%02d", id++);
        this.codeR = codeR;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
    }

    public String getCodeR() {
        return codeR;
    }

    public void setCodeR(String codeR) {
        this.codeR = codeR;
    }

    public long days() {
        return ChronoUnit.DAYS.between(ngayDen, ngayDi);
    }


}
