package filmography.services;
import filmography.models.Title;
import java.util.List;

/*
    Слой сервиса для дополнительных операций над моделью помимо CRUD.
    В этой простой реализации пока просто копируем методы из DAO.
 */

public interface TitleService {

    List<Title> allTitles();

    void add(Title title);

    void delete(Title title);

    void edit(Title title);

    Title getById(int id);
}
