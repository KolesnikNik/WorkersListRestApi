package com.newProject.workersList.controller;

import com.newProject.workersList.domain.Worker;
import com.newProject.workersList.service.WorkerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Класс Rest контроллера для работы со списком сотрудников
 * содержит следующие методы работы со списком сотрудников:
 * добавление;
 * удаление;
 * изменение;
 * и чтение;
 */
@RestController
@RequestMapping("/Workers")
public class WorkerController {

    private final WorkerService workerService;

    public WorkerController(WorkerService workerService) {
        this.workerService = workerService;
    }

    /**
     * Метод запроса всех сотрудников
     */
    @GetMapping
    public List<Worker> getAll() {
        return workerService.getAllWorker();
    }

    /**
     * Метод добавления сотрудника в базу данных
     *
     * @param firstName   - имя
     * @param lastName    - фамилия
     * @param midlName    - отчество
     * @param company     - название компании
     * @param position    - должность
     * @param phoneNumber - телефонный номер
     */
    @PostMapping("/addWorker")
    public ResponseEntity<Worker> addWorker(@RequestParam String firstName,
                                            @RequestParam String lastName,
                                            @RequestParam String midlName,
                                            @RequestParam String company,
                                            @RequestParam String position,
                                            @RequestParam String phoneNumber) {
        return new ResponseEntity<Worker>(workerService.addWorker(firstName,
                lastName,
                midlName,
                company,
                position,
                phoneNumber), HttpStatus.OK);
    }

    /**
     * Метод запроса сотрудника из БД по его ID
     *
     * @param workerId - ID
     */
    @GetMapping("/{workerId}")
    public Worker findWorkerById(@PathVariable long workerId) {
        return workerService.getWorkerById(workerId);
    }

    /**
     * Метод удаления сотрудника из БД по его ID
     *
     * @param workerId - ID
     */
    @DeleteMapping("/delete/{workerId}")
    public void deleteWorker(@PathVariable long workerId) {
        workerService.deleteWorkerById(workerId);
    }

    /**
     * Метод изменения данных сотрудника
     *
     * @param id          - ID
     * @param firstName   - имя
     * @param lastName    - фамилия
     * @param midlName    - отчество
     * @param company     - название компании
     * @param position    - должность
     * @param phoneNumber - телефонный номер
     */
    @PatchMapping("/editWorker")
    public void editWorker(@RequestParam long id,
                           @RequestParam String firstName,
                           @RequestParam String lastName,
                           @RequestParam String midlName,
                           @RequestParam String company,
                           @RequestParam String position,
                           @RequestParam String phoneNumber) {
        workerService.editWorker(id,
                firstName,
                lastName,
                midlName,
                company,
                position,
                phoneNumber);
    }
}
