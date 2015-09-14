package demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarController {

    @RequestMapping(value = "/cars", method = RequestMethod.POST)
    @ResponseBody
    public void create() {

    }

    @RequestMapping(value = "/cars/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable String id) {
        return "{}";
    }
}
