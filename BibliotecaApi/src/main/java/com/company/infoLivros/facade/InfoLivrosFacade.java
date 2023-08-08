package com.company.infoLivros.facade;

import com.company.infoLivros.dto.infoLivrosDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
@Service

public class InfoLivrosFacade {
    private static final Map<Long, infoLivrosDTO> infoLivros = new HashMap<>();

    public infoLivrosDTO criar(infoLivrosDTO infoLivrosDTO) {
        Long proximoId = infoLivros.keySet().size() + 1L;
        infoLivrosDTO.setId(proximoId);
        infoLivros.put(proximoId, infoLivrosDTO);
        return infoLivrosDTO;
    }

    public infoLivrosDTO atualizar (infoLivrosDTO infoLivrosDTO, Long infoLivrosId) {
        infoLivros.put(infoLivrosId, infoLivrosDTO);
        return infoLivrosDTO;
    }

    public infoLivrosDTO getById (Long infoLivrosId) {
        return infoLivros.get(infoLivrosId);
    }

    public List<infoLivrosDTO> getAll () {
        return new ArrayList<>(infoLivros.values());
    }

    public String delete (Long infoLivrosId) {
        infoLivros.remove(infoLivrosId);
        return "DETETE";
    }
}

