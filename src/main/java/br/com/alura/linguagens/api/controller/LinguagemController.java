package br.com.alura.linguagens.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.linguagens.api.Linguagem;
import br.com.alura.linguagens.api.repository.LinguagemRepository;

@RestController
public class LinguagemController {
   
   @Autowired
   private LinguagemRepository repository;
   
   @GetMapping("/linguagens")
   public List<Linguagem> getLinguagens() {
      return repository.findAll();
   }

   @GetMapping("/linguagens/{id}")
   public Optional<Linguagem> getByLinguagens(@PathVariable String id) {
      return repository.findById(id);
   }

   @PostMapping("/linguagens")
   public Linguagem setLinguagens(@RequestBody Linguagem linguagem) {
      return repository.save(linguagem);

   }

   @DeleteMapping("/linguagens/{id}")
   public void deleteLinguagens(@PathVariable String id) {
      repository.deleteById(id);
   }
}
