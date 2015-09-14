package demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DashboardController {

    @RequestMapping("/")
    @ResponseBody
    public String dashboard() {
        return "<html>" +
                "<body>" +
                "<script type=\"text/javascript\" src=\"/webjars/jquery/2.1.4/jquery.js\"></script>" +
                "<script type=\"text/javascript\" src=\"/scripts/main.js\"/></script>" +
                "<div id=\"messages\"></div>" +
                "</body>" +
                "</html>";
    }
}
