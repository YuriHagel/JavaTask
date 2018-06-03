package Task007;

public class ClassRoom {
    // Конструктор с параметром
    public ClassRoom(Pupil pupil) {
        pupil.read();
        pupil.relax();
        pupil.study();
        pupil.write();
    }
}
