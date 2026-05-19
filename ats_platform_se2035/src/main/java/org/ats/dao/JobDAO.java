package org.ats.dao;

import org.ats.entities.Jobs;

import java.util.List;

public interface JobDAO {
    Jobs createJob(Jobs job);
    List<Jobs> findByTitle(String title);
}
