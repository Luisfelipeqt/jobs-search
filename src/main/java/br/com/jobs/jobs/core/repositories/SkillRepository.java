package br.com.jobs.jobs.core.repositories;

import br.com.jobs.jobs.core.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}
