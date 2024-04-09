package edu.iu.mralmalk.historyservice.repository;

import edu.iu.mralmalk.historyservice.model.PrimesRecord;

import java.util.List;

public interface PrimesHistoryRepository extends CrudRepostiory<PrimesRecord, Integer> {
    List<PrimesRecord> findAllByCustomer(String customer);
}