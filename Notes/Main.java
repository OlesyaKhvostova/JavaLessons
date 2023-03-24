import NotesManager.NotesManager;
import model.FileOperation;
import model.FileOperationImpl;
import model.Repository;
import model.RepositoryFile;

    public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("notes.txt");
        Repository repository = new RepositoryFile(fileOperation);
        NotesManager notesmngr = new NotesManager(repository);
        notesmngr.run();
    }
}
