package com.optimus_prime.learningjhipster.repository;

import com.optimus_prime.learningjhipster.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long>{
}
