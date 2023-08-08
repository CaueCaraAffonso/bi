package com.company.infoLivros.api;

import com.company.infoLivros.dto.infoLivrosDTO;
import com.company.infoLivros.facade.InfoLivrosFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@Controller
@RequestMapping(value = "/infoLivros", produces = MediaType.APPLICATION_JSON_VALUE)
public class InfoLivrosAPI {
    @Autowired
    private InfoLivrosFacade infoLivrosFacade;

@PostMapping
@ResponseBody
    public infoLivrosDTO criar(@RequestBody infoLivrosDTO infoLivrosDTO) {
        return infoLivrosFacade.criar(infoLivrosDTO);
}
    @PutMapping("/{infoLivrosId}")
    @ResponseBody
    public infoLivrosDTO atualizar(@PathVariable("infoLivrosId")Long infoLivrosId,
                                   @RequestBody infoLivrosDTO infoLivrosDTO) {
    return infoLivrosFacade.atualizar(infoLivrosDTO, infoLivrosId);
    }

    @GetMapping
    @ResponseBody
    public List<infoLivrosDTO> getAll() {
        return infoLivrosFacade.getAll();
    }

    @DeleteMapping("/{infloLivrosID}")
    @ResponseBody
    public String deletar(@PathVariable("infoLivrosId")Long infloLivrosID) {
        return infoLivrosFacade.delete(infloLivrosID);
    }
}
