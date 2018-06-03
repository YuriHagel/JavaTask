package Task009;

public class ExpertDocumentWorker extends DocumentWorker {
    @Override
    void saveDocument(){
        System.out.println("Документ сохранен в новом формате");
    }
}
