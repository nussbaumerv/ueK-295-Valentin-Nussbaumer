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

                "}" +
                "#myDIV {" +
                "  margin: auto;" +
                "  width: 200px;" +
                "  height: 100px;" +
                "  text-align:center;" +
                "  animation: mymove 5s infinite;" +
                "}" +
                "" +
                "@keyframes mymove {" +
                "  0% {transform: rotate(360deg);}" +
                "}" +
                "a{" +
                "color:grey;" +
                "font-size:18px;" +
                "} </style>" +
                "<body>" +
                "<br>" +
                "<div id= 'myDIV'>" +
                "<h1>Hi there</h1>" +
                "</div>" +
                "<br><br><br><br><a href='https://github.com/nussbaumerv/ueK-295-Valentin-Nussbaumer'> Click here for mor Information obout this Program</a>" +
                "</body>" +
                "<html>";
    }
}