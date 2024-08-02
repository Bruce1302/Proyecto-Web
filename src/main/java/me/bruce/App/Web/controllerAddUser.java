package me.bruce.App.Web;

import lombok.extern.slf4j.Slf4j;
import me.bruce.App.Domain.Usuario;
import me.bruce.App.Service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class controllerAddUser {

    @Autowired //Inyectamos los metodos del servicio para poder acceder a la bd desde aqui mediante los metodos del servicio
    private IUsuarioService usuarioService;

    @PostMapping("/saveUser")
    public String saveUser(Usuario usuario) //Al pasar como parametro Usuario usuario, se esta buscando un usuario y no lo encuentra lo crea
    {
        usuarioService.guardar(usuario);
        log.info("Usuario guardado");
        return "redirect:/";
    }
}


