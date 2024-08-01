package me.bruce.App.Web;

import lombok.extern.slf4j.Slf4j;
import me.bruce.App.Service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
public class controllerAddUser {

    @Autowired //Inyectamos los metodos del servicio para poder acceder a la bd desde aqui mediante los metodos del servicio
    private IUsuarioService usuarioService;


}
