package ch.noseryoung.sbdemo01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "<html>" +
                "<head>" +
                "<style>" +
                "body{" +
                "background-color:black;" +
                "font-family:arial;" +
                "text-align:center;" +
                "color:white;" +
                "}" +
                "</style>" +
                "<body>" +
                "<br>" +
                "<h1>Greetings from Spring Boot!</h1>" +
                "</body>" +
                "<html>";
    }
}
