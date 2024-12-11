import java.text.ParseException;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Player implements Comparable<Player> {
    private String codePlayer, name;
    private LocalTime checkInTime;
    private LocalTime checkOutTime;

    public Player(String codePlayer, String name, String checkInTime, String checkOutTime){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        this.codePlayer = codePlayer;
        this.name = name;
        this.checkInTime = LocalTime.parse(checkInTime, formatter);
        this.checkOutTime = LocalTime.parse(checkOutTime, formatter);
    }

    public int getDurationInMinutes(){
        return (int) Duration.between(checkInTime, checkOutTime).toMinutes();

    }
    public String timeSolution(){
        long temp = getDurationInMinutes();
        long hour = temp / 60;
        long minute = temp % 60;
        return hour + " gio " + minute + " phut";
    }
    public String toString(){
        return codePlayer + " " + name + " " + timeSolution();
    }

    @Override
    public int compareTo(Player o) {
        return o.getDurationInMinutes() - this.getDurationInMinutes();
    }
}
public class TinhGio {
    public static void main(String args[]) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        List<Player> players = new ArrayList<>();
        while(T-- >0){
            String codePlayer = sc.nextLine();
            String name = sc.nextLine();
            String checkInTime = sc.nextLine();
            String checkOutTime = sc.nextLine();
            players.add(new Player(codePlayer, name, checkInTime, checkOutTime));
        }
        Collections.sort(players);
        for (Player p : players){
            System.out.println(p);
        }
    }
}
