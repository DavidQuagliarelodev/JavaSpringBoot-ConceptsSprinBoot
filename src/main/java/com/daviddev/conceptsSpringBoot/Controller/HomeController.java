package com.daviddev.conceptsSpringBoot.Controller;

import com.daviddev.conceptsSpringBoot.service.HomeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
    //Aqui eu Defini que vou ter um propriedade do tipo HomeService
    //Porem ela so vai passar a persistir quando eu instanciar o HomeController
    //Como o spring ja faz isso automaticamente quando iniciliza o projeto atravez do SpringBootApplication
    //E o spring ja faz a injeção de dependencia automaticamente
    //Eu consigo usar o HomeService aqui sem precisar instanciar ele manualmente pasando o objeto como parametro no construtor do HomeController
    //Isso é chamado de Injeção de Dependencia
    private HomeService homeService;

    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @GetMapping
    public String helloHome(){
        return homeService.helloHome();
    }

    @GetMapping("/secondpage")
    public String secondPage(){
        return homeService.secondPage();
    }
}
