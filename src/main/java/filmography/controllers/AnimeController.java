package filmography.controllers;

import filmography.models.Title;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*
    Класс-контроллер, определяется Spring через @Controller
 */

@Controller
public class AnimeController {

    private static Title title;

    static {
        title = new Title();
        title.setName("My Hero Academy");
        title.setYearOfPublication(2017);
        title.setGenre("sennen");
        title.setOvered(true);
        title.setWatched(true);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView allTitles(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("titles");
        modelAndView.addObject("title", title);
        return modelAndView;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView editPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        return modelAndView;
    }

}
