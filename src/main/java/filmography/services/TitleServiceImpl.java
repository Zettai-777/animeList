package filmography.services;

/*
    Реализации сервиса
 */

import filmography.dao.TitleDAO;
import filmography.models.Title;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TitleServiceImpl implements TitleService{

    private TitleDAO dao;

    @Autowired
    public void setDao(TitleDAO dao) {
        this.dao = dao;
    }

    @Override
    public List<Title> allTitles() {
        return dao.allTitles();
    }

    @Override
    public void add(Title title) {
        dao.add(title);
    }

    @Override
    public void delete(Title title) {
        dao.delete(title);
    }

    @Override
    public void edit(Title title) {
        dao.edit(title);
    }

    @Override
    public Title getById(int id) {
        return dao.getById(id);
    }
}
