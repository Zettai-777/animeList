package filmography.dao;

import filmography.models.Title;

import java.util.List;

/*
    Интерфейс DAO, инкапсулирующий в себе CRUD операции
 */

public interface TitleDAO {

    List<Title> allTitles();

    void add(Title title);

    void delete(Title title);

    void edit(Title title);

    Title getById(int id);

}
