package com.appcicd.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class JenkinsController {
    /// 1
    /// //2
    ///  /// 3
    ///  //// 4
    /// 5 5

    @GetMapping("/carga")
    public String carga(){
        return "Hola jenkins";
    }

    @GetMapping("/cargando")
    public String cargando(){
        return "Hola jenkins con webhook";
    }

    @GetMapping("/webhook")
    public String webhook(){
        return "Prueba en subir al git  con efectos de webhook";
    }

    @GetMapping("/webhooks")
    public String webhooks(){
        return "Prueba en subir al git  con efectos de webhooks";
    }

    @GetMapping("/uniendocomir")
    public String uniendocomir(){
        return "Prueba cambios al git  +  webhooks";
    }
}
