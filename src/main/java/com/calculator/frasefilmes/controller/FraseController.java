package com.calculator.frasefilmes.controller;

import com.calculator.frasefilmes.dto.FraseRequest;
import com.calculator.frasefilmes.service.FraseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
@RequiredArgsConstructor
public class FraseController {

    private final FraseService fraseService;

    @GetMapping("/frases")
    public ResponseEntity<FraseRequest> getFrases() {
        FraseRequest frase = fraseService.getFrases();
        if (frase == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(frase);
    }
}
