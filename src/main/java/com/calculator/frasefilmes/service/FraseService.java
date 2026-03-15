package com.calculator.frasefilmes.service;

import com.calculator.frasefilmes.dto.FraseRequest;
import com.calculator.frasefilmes.model.FrasesEntity;
import com.calculator.frasefilmes.repository.FraseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FraseService {

    private final FraseRepository fraseRepository;

    public FraseRequest getFrases() {
        List<FrasesEntity> frases = fraseRepository.buscaFraseAleatoria();
        if (frases.isEmpty()) {
            return null;
        }
        FrasesEntity frase = frases.get(0);
        return new FraseRequest(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
