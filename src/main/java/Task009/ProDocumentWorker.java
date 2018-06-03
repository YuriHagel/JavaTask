package Task009;

public class ProDocumentWorker extends DocumentWorker{
    @Override
    void editDocument(){
        System.out.println("Редактирование документа доступно в версии Про");
    }
    void saveDocument(){
        System.out.println("Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии Эксперт");
    }

}
