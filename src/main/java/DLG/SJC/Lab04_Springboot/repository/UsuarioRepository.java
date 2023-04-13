package DLG.SJC.Lab04_Springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import DLG.SJC.Lab04_Springboot.entity.Usuario;



public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}