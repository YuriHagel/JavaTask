package Interface01;
import java.util.Scanner;

public class Main {
    public static void playMe() {
        // Создаем экземпляр класса
        Scanner st = new Scanner(System.in);

        Player player = new Player();
        System.out.println("Choice program:" + "\nPlay" + "\nStop" + "\nRecord" + "\nPause");
        String input = st.next();
        if (input.equals("Play")){
            player.play();
        }else if(input.equals("Stop")){
            player.stop();
        }else if (input.equals("Record")){
            player.stop();
        }else{
            System.err.println("Choice correct is programm");
            playMe();
        }


    }

    public static void main(String[] args) {
        playMe();


    }
}
