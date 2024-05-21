package br.com.jobs.jobs.core.repositories;

import br.com.jobs.jobs.core.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
