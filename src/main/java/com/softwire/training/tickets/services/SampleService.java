package com.softwire.training.tickets.services;

import org.jdbi.v3.core.Jdbi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class SampleService {

    private final Jdbi jdbi;

    @Autowired
    public SampleService(Jdbi jdbi) {
        this.jdbi = jdbi;
    }

    public List<Timestamp> sample() {
        return jdbi.withHandle(handle -> {
            handle.execute("CREATE TABLE IF NOT EXISTS ticks (tick timestamp)");
            handle.execute("INSERT INTO ticks VALUES (now())");
            return handle.createQuery("SELECT tick FROM ticks")
                    .mapTo(Timestamp.class)
                    .list();
        });
    }


}
