package SkillsContoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping("/")
    public String possibleLanguages() {
        return "<html>" +
                "<body>" +
                "<h1> Skills Tracker</h1>" +
                "<h2>Possible Languages</h2>" +
                "<ol>" +
                "<li> Java </li>" +
                "<li> JavaScript </li>" +
                "<li> Python </li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/form")
    public String displayForm() {
        return "<html>" +
                "<body>" +
                "<form action='/form' method='POST'>" +

                "label>" +
                "Name:" +
                "</label>" +
                "<br/>" +

                "<input type ='text' name= 'first name'/>" +

                "<label>" +
                "This is my first favorite programming language" +
                "</label>" +
                "<br/>" +

                "<select name = 'firstFav'>" +
                "<option value='Java'>Java </option>" +
                "<option value='Javascript'>Javascript </option>" +
                "<option value='Python'>Python </option>" +
                "</select>" +


                "<label>" +
                "My second favorite programming language" +
                "</label>" +
                "<br/>" +

                "<select name = 'secondFav'>" +
                "<option value='Java'>Java </option>" +
                "<option value='Javascript'>Javascript </option>" +
                "<option value='Python'>Python </option>" +
                "</select>" +


                "<label>" +
                "Myy third favorite programming language:" +
                "</label>" +
                "<br/>" +

                "<select name = 'thirdFav'>" +
                "<option value='Java'>Java </option>" +
                "<option value='Javascript'>Javascript </option>" +
                "<option value='Python'>Python </option>" +
                "</select" +
                "<br/>" +
                "<br/>" +

                "<button type='submit'>" +
                "Submit" +
                "</button>" +

                "</form>" +
                "</body>" +
                "</html>";
    }


    @PostMapping("/form")
    public String formResults(@RequestParam String firstName, String firstFav, String secondFav, String thirdFav) {
        return "<html>" +
               "<body>" +
                "<h1>" +
               firstName +
               "</h1>" +
               "<ol>" +
                "<li>" +
               firstFav +
               "</li>" +
               "<li>" +
                secondFav +
               "</li>" +
               "<li>" +
                thirdFav +
                "</li>" +
                "</body>" +
                "</html>";
    }
}



