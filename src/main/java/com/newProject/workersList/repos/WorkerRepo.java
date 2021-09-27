package com.newProject.workersList.repos;

import com.newProject.workersList.domain.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * Интерфейс репозитория Сотрудников.
 * Содержит стандартные методы работы с БД
 * и позволяет их расширять
 */
@Repository
public interface WorkerRepo extends JpaRepository<Worker, Long> {

    Worker getWorkerById(long id);
}
