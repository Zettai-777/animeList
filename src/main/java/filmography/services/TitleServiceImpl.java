package filmography.services;

/*
    Реализации сервиса
 */

import filmography.dao.TitleDAO;
import filmography.models.Title;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TitleServiceImpl implements TitleService{

    private TitleDAO dao;

    @Autowired
    public void setDao(TitleDAO dao) {
        this.dao = dao;
    }

    @Transactional
    @Override
    public List<Title> allTitles() {
        return dao.allTitles();
    }

    @Transactional
    @Override
    public void add(Title title) {
        dao.add(title);
    }

    @Transactional
    @Override
    public void delete(Title title) {
        dao.delete(title);
    }

    @Transactional
    @Override
    public void edit(Title title) {
        dao.edit(title);
    }

    @Transactional
    @Override
    public Title getById(int id) {
        return dao.getById(id);
    }
}
