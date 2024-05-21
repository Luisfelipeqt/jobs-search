package br.com.jobs.jobs.api.skills.mappers;

import br.com.jobs.jobs.api.skills.dtos.SkillRequest;
import br.com.jobs.jobs.api.skills.dtos.SkillResponse;
import br.com.jobs.jobs.core.models.Skill;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ModelMapperSkillMapper implements SkillMapper {

    private final ModelMapper modelMapper;

    @Override
    public Skill toSkill(SkillRequest skillRequest) {
        return modelMapper.map(skillRequest, Skill.class);
    }

    @Override
    public SkillResponse toSkillResponse(Skill skill) {
        return modelMapper.map(skill, SkillResponse.class);
    }
}
