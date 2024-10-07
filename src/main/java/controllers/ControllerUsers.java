package controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class ControllerUsers {

    ServiceController serviceController = new ServiceController();
    @GetMapping("/")
    public String getAllUsers(){
        return serviceController.getAllUsers();
    }


}
