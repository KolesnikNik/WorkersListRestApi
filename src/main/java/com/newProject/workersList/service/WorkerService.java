package com.newProject.workersList.service;

import com.newProject.workersList.domain.Worker;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public interface WorkerService {

    /**
     * Добавляет сотрудника в базу данных
     *
     * @param firstName   - имя
     * @param lastName    - фамилия
     * @param midlName    - отчество
     * @param company     - название компании
     * @param position    - должность
     * @param phoneNumber - телефонный номер
     */
    @Transactional
    Worker addWorker(String firstName,
                     String lastName,
                     String midlName,
                     String company,
                     String position,
                     String phoneNumber);

    /**
     * Выводит всех псотрудников списком
     */
    List<Worker> getAllWorker();

    /**
     * Находит и выводит сотрудника по его ID
     * @param id - ID Сотрудника
     */
    Worker getWorkerById(long id);
    /**
     * Удаляет сотрудника по ID,
     * если он есть в БД
     * @param id - ID Сотрудника
     */
    void deleteWorkerById(long id);

    /**
     * Позволяет изменить данные сотрудника,
     * поиск по ID сдальнейшим сохранением изменений.
     *
     * @param id - ID Сотрудника
     * @param firstName   - имя
     * @param lastName    - фамилия
     * @param midlName    - отчество
     * @param company     - название компании
     * @param position    - должность
     * @param phoneNumber - телефонный номер
     */
    @Transactional
    void editWorker(long id,
                    String firstName,
                    String lastName,
                    String midlName,
                    String company,
                    String position,
                    String phoneNumber);
}
