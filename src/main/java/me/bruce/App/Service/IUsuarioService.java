package me.bruce.App.Service;

import me.bruce.App.Domain.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IUsuarioService {

    public List<Usuario> listaUsuarios();

    public void guardar(Usuario usuario);

    public void eliminar(Usuario usuario);

    public Usuario encontrarUsuario(Usuario usuario);
}
