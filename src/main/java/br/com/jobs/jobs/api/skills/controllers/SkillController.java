package br.com.jobs.jobs.api.skills.controllers;

import br.com.jobs.jobs.api.skills.dtos.SkillResponse;
import br.com.jobs.jobs.api.skills.mappers.SkillMapper;
import br.com.jobs.jobs.core.repositories.SkillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/skills/v1")
public class SkillController {

    private final SkillMapper skillMapper;
    private final SkillRepository skillRepository;

    @GetMapping
    public ResponseEntity<List<SkillResponse>> findAll() {
        var skills = skillRepository.findAll()
                .stream()
                .map(skillMapper::toSkillResponse)
                .toList();
        return ResponseEntity.status(HttpStatus.OK).body(skills);
    }
}
