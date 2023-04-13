package DLG.SJC.Lab04_Springboot.service;

import java.util.List;

import DLG.SJC.Lab04_Springboot.entity.Usuario;

public interface IUsuarioService {

    public Usuario buscarPorId(Long id);
    public Usuario novoUsuario(Usuario usuario);
    public List<Usuario> buscarTodos();
    
}
