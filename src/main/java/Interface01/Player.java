package Interface01;


public class Player implements Playable, Recodable {
    // Реализуем абстрактные методы интерфейсов

    public void play() {
       System.out.println("Play");
    }


    public void record() {
        System.out.println("Record");
    }


    public void pause() {
        System.out.println("Pause");
    }


    public void stop() {
        System.out.println("Stop");
    }


}
