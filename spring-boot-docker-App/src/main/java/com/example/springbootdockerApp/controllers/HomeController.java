package com.example.springbootdockerApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.NoSuchElementException;
import java.text.ParseException;

// @RestController
@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private WorkTimeRepository workTimeRepository;

    @RequestMapping(method=RequestMethod.GET)
    public String home(@RequestParam("stampedTime") Optional<String> stampedTime) {
        if(stampedTime.isPresent()) {
            try {
                SimpleDateFormat dateParser = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                Date parseStampedTime = dateParser.parse(stampedTime.get());
                WorkTime workTime = new WorkTime();
                workTime.setStart_date(parseStampedTime);
                workTimeRepository.save(workTime);
                return "home";
            } catch(NoSuchElementException e) {
                return "home";
            } catch(ParseException e) {
                e.printStackTrace();
                return "home";
            }
        } else {
            return "home";
        }
    }
}