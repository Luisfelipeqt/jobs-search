package br.com.jobs.jobs.api.skills.mappers;

import br.com.jobs.jobs.api.skills.dtos.SkillRequest;
import br.com.jobs.jobs.api.skills.dtos.SkillResponse;
import br.com.jobs.jobs.core.models.Skill;

public interface SkillMapper {

    Skill toSkill(SkillRequest skillRequest);
    SkillResponse toSkillResponse(Skill skill);
}
