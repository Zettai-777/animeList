package filmography.controllers;

import filmography.models.Title;
import filmography.services.TitleService;
import filmography.services.TitleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/*
    Класс-контроллер, определяется Spring через @Controller
 */

@Controller
public class AnimeController {

    private TitleService service;

    @Autowired
    public void setService(TitleService service) {
        this.service = service;
    }

    //метод для получения списка всех аниме тайтлов
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView allTitles(){
        List<Title> titles = service.allTitles();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("titles");
        modelAndView.addObject("titleList", titles);
        return modelAndView;
    }

    //метод для получения страницы редактирования модели (тайтла)
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editPage(@PathVariable("id") int id){
        Title title = service.getById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        modelAndView.addObject("title", title);
        return modelAndView;
    }

    //метод для редактирования самой модели
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ModelAndView editTitle(@ModelAttribute("title") Title title){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        service.edit(title);
        return modelAndView;
    }

    //метод для получения страницы добавления нового тайтла
    //тоже ссылается на editPage, но без переданного id
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView addPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        return modelAndView;
    }

    //метод добавления нового тайтла
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView addTitle(@ModelAttribute("title") Title title){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        service.add(title);
        return modelAndView;
    }

    //метод удаления тайтла
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteTitle(@PathVariable("id") int id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        Title title = service.getById(id);
        service.delete(title);
        return modelAndView;
    }
}
