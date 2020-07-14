package io.microservice.SpringbootActuator.genericController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/generic")
public class ActuatorController {

    @GetMapping("/actuator")
    public String getActuatorEndPoint(){
        return "";
    }
}
