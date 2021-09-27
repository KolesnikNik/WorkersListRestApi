package com.newProject.workersList.service;

import com.newProject.workersList.domain.Worker;
import com.newProject.workersList.repos.WorkerRepo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WorkerServiceImpl implements WorkerService {
    private final WorkerRepo workerRepo;

    public WorkerServiceImpl(WorkerRepo workerRepo) {
        this.workerRepo = workerRepo;
    }

    @Override
    public Worker addWorker(String firstName,
                            String lastName,
                            String midlName,
                            String company,
                            String position,
                            String phoneNumber) {
            Worker worker = new Worker(
                    firstName,
                    lastName,
                    midlName,
                    company, position,
                    phoneNumber);
            workerRepo.save(worker);

        return worker;
    }

    @Override
    public List<Worker> getAllWorker() {
        return workerRepo.findAll();
    }

    @Override
    public Worker getWorkerById(long id) {
        return workerRepo.existsById(id) ? workerRepo.getWorkerById(id) : null;
    }

    @Override
    public void deleteWorkerById(long id) {
        if (workerRepo.existsById(id)) {
            workerRepo.deleteById(id);
        }
    }

    @Override
    public void editWorker(long id,
                           String firstName,
                           String lastName,
                           String midlName,
                           String company,
                           String position,
                           String phoneNumber) {
        if (workerRepo.existsById(id)) {
            Worker worker = workerRepo.getWorkerById(id);
            worker.setFirstName(firstName);
            worker.setLastName(lastName);
            worker.setMidlName(midlName);
            worker.setCompany(company);
            worker.setPosition(position);
            worker.setPhoneNumber(phoneNumber);
            workerRepo.save(worker);
        }

    }

}
