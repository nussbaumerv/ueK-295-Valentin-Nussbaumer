package ch.noseryoung.uek295Order.domain.welcome;

import io.swagger.v3.oas.annotations.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class Welcome {

    @Hidden
    @GetMapping("/welcome")
    public String index(){
        return "<html>" +
        "<head>" +
                "<style>" +
                "body{" +
                "background-color: black;" +
                "text-align: center;" +
                "color:white;" +
                "font-family: arial;" +
                "} </style>" +
                "<body>" +
                "<br>" +
                "<h1>Hi there</h1>" +
                "</body>" +
                "<html>";
    }
}