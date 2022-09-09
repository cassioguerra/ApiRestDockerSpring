package br.com.cassioguerra.Docker_MySQL.reposytori;

import br.com.cassioguerra.Docker_MySQL.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioReposytori extends JpaRepository<UsuarioModel, Long> {
}
