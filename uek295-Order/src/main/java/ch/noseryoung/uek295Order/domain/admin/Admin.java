package ch.noseryoung.uek295Order.domain.admin;

import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Admin {

    @Hidden
    @GetMapping("/admin")
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
                "<h1>Hi admin</h1>" +
                "Some relly confidential Information" +
                "</body>" +
                "<html>";
    }
}