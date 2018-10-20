package ky.barry.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class TestRestCallsController {

    @RequestMapping(value= "/testRestCall", method = RequestMethod.GET, produces = "text/html")
    @ResponseBody
    public String performTestRestCalls() {
        RestTemplate template = new RestTemplate();
        String result = template.getForObject("https://api.pubgtracker.com/v2/profile/pc/ApollyonVeyron?TRN-Api-Key=5596f0de-2e8a-4b3f-8fa6-499701859a77", String.class);
        return result;
    }
}
