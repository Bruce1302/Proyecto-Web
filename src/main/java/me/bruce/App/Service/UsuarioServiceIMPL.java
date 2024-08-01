package me.bruce.App.Service;

import me.bruce.App.Dao.IUsuarioDAO;
import me.bruce.App.Domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioServiceIMPL implements IUsuarioService {

    @Autowired
    private IUsuarioDAO usuarioDAO;

    @Override
    @Transactional(readOnly = true) //readonly va cuando el metodo no hace alguna modificacion en la bd, solo se leera
    public List<Usuario> listaUsuarios()
    {
        return (List<Usuario>) usuarioDAO.findAll();
    }

    @Override
    @Transactional
    public void guardar(Usuario usuario)
    {
        usuarioDAO.save(usuario);
    }

    @Override
    @Transactional
    public void eliminar(Usuario usuario)
    {
        usuarioDAO.delete(usuario);
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario encontrarUsuario(Usuario usuario)
    {
        return usuarioDAO.findById(usuario.getIdUsuario()).orElse(null);
    }
}
