package filmography.dao;

import filmography.models.Title;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/*
    Класс, реализующий DAO интерфейс
 */

@Repository
public class TitleDAOImpl implements TitleDAO{

    private static final AtomicInteger AUTO_ID = new AtomicInteger( 0);
    private static Map<Integer, Title> titles = new HashMap<>();

    static {
        Title title1 = new Title();
        title1.setId(AUTO_ID.getAndIncrement());
        title1.setName("Naruto");
        title1.setYearOfPublication(1990);
        title1.setGenre("sennen");
        title1.setOvered(true);
        title1.setWatched(true);

        Title title2 = new Title();
        title2.setId(AUTO_ID.getAndIncrement());
        title2.setName("Dorohedoro");
        title2.setYearOfPublication(2020);
        title2.setGenre("seinen");
        title2.setOvered(true);
        title2.setWatched(true);

        Title title3 = new Title();
        title3.setId(AUTO_ID.getAndIncrement());
        title3.setName("Gintama");
        title3.setYearOfPublication(1995);
        title3.setGenre("sennen/parody");
        title3.setOvered(true);
        title3.setWatched(true);

        Title title4 = new Title();
        title4.setId(AUTO_ID.getAndIncrement());
        title4.setName("Magic battle");
        title4.setYearOfPublication(2020);
        title4.setGenre("seinen");
        title4.setOvered(false);
        title4.setWatched(false);

        titles.put(title1.getId(), title1);
        titles.put(title2.getId(), title2);
        titles.put(title3.getId(), title3);
        titles.put(title4.getId(), title4);
    }

    @Override
    public List<Title> allTitles() {
        return new ArrayList<>(titles.values());
    }

    @Override
    public void add(Title title) {
        title.setId(AUTO_ID.getAndIncrement());
        titles.put(title.getId(), title);
    }

    @Override
    public void delete(Title title) {
        titles.remove(title);
    }

    @Override
    public void edit(Title title) {
        titles.put(title.getId(),title);
    }

    @Override
    public Title getById(int id) {
        return titles.get(id);
    }
}
