package me.bruce.App.Web;

import lombok.extern.slf4j.Slf4j;
import me.bruce.App.Dao.IUsuarioDAO;
import me.bruce.App.Service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class controllerIndex {

    @Autowired //Inyectamos los metodos del servicio para poder acceder a la bd desde aqui mediante los metodos del servicio
    private IUsuarioService usuarioService;

    @GetMapping("/")
    public String inicio(Model model)
    {
        log.info("Ejecutando el controlador");

        var usuarios = usuarioService.listaUsuarios();
        model.addAttribute("usuarios", usuarios);

        return "index";
    }
}
