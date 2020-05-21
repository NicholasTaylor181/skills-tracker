package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {


    @GetMapping
    public String skillsTracker() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>C++</li>" +
                "</ol>" +
                "</body>" +
                "<html>";

    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "language")
    public String createMessage(@RequestParam String name, String languageOne, String languageTwo, String languageThree) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + StringUtils.capitalize(languageOne) + "</li>" +
                "<li>" + StringUtils.capitalize(languageTwo) + "</li>" +
                "<li>" + StringUtils.capitalize(languageThree) + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";

    }

    @GetMapping("form")
    public String SkillsForm() {
        return "<html>" +
                "<body>" +
                "<form action='language' method='post'>" +
                "<h2>Name:</h1>" +
                "<input type='text' name='name'>" +
                "<h2>My favorite language</h2>" +
                "<select name='languageOne'>" +
                "<option value='javaScript'>JavaScript</option>" +
                "<option value='java'>Java</option>" +
                "<option value='c++'>C++</option>" +
                "<option value='c#'>C#</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<h2>My second favorite language</h2>" +
                "<select name='languageTwo'>" +
                "<option value='javaScript'>JavaScript</option>" +
                "<option value='java'>Java</option>" +
                "<option value='c++'>C++</option>" +
                "<option value='c#'>C#</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<h2>My third favorite language</h2>" +
                "<select name='languageThree'>" +
                "<option value='javaScript'>JavaScript</option>" +
                "<option value='java'>Java</option>" +
                "<option value='c++'>C++</option>" +
                "<option value='c#'>C#</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "<html>";
    }
}
