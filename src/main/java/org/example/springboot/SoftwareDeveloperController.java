package org.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-dev")
public class SoftwareDeveloperController {

    @GetMapping
    public List<SoftwareDeveloper> getSoftwareDevs(){
        return List.of(
                new SoftwareDeveloper(
                        1,
                        "Moe",
                        "Moe@gmail.com",
                        List.of("Java", "JS", "Node")
                ),
                new SoftwareDeveloper(
                        2,
                        "Moe",
                        "Moe@gmail.com",
                        List.of("Java", "JS", "Node")
                )
        );
    }
}
