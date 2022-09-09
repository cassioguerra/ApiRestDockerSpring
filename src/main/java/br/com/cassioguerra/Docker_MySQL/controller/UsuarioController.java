package br.com.cassioguerra.Docker_MySQL.controller;

import br.com.cassioguerra.Docker_MySQL.model.UsuarioModel;
import br.com.cassioguerra.Docker_MySQL.reposytori.UsuarioReposytori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {


    @Autowired
    private UsuarioReposytori usuarioReposytori;

    @GetMapping
    public List<UsuarioModel> findAll(){
      List<UsuarioModel> resultado = usuarioReposytori.findAll();
        return  resultado;
    }


    @GetMapping(value = "{id}")
    public UsuarioModel findById(@PathVariable Long id){
        UsuarioModel resultado = usuarioReposytori.findById(id).get();
        return resultado;

    }
@PostMapping
    public  UsuarioModel insert(@RequestBody UsuarioModel usuarioModel){
        UsuarioModel resultado = usuarioReposytori.save(usuarioModel);
        return resultado;
    }

}
