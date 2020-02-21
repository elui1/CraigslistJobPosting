package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    JobRepository repository;

    @Override
    public void run(String... strings) throws Exception {
        Job job;
        job = new Job("Software Engineer", "blahblah", "2020-02-15", "Bond", "333");
        repository.save(job);

        job = new Job("Software Engineer", "blahblah", "2020-02-15", "Bond", "444");
        repository.save(job);

        job = new Job("Software Engineer", "blahblah", "2020-02-15", "Bond", "555");
        repository.save(job);

//        job = new Job("Software Engineer", "blahblah", "2020-02-15", "Bond", "666");
//        repository.save(job);
    }
}
