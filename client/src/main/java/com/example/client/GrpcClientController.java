package com.example.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/grpc")
public class GrpcClientController {

    @Autowired
    private FoobarService grpcClientService;

    @GetMapping("/message")
    public String printMessage(@RequestParam(defaultValue = "Michael") String name) {
        return grpcClientService.receiveGreeting(name);
    }

}
