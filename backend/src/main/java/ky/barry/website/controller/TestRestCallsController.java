package ky.barry.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class TestRestCallsController {

    @RequestMapping(value= "/api/name", method = RequestMethod.GET, produces = "text/html")
    @ResponseBody
    public String getName() {
        return "backend";
    }
}