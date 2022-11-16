package org.devexperts.Blog;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/api")
@Controller
public class BlogController {

    @GetMapping("/status")
    public ResponseEntity<?> getResponse(){

        return ResponseEntity.ok("hi its controller response");
    }

}
