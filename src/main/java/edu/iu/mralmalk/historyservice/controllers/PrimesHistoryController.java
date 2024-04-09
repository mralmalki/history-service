package edu.iu.mralmalk.historyservice.controllers;

import edu.iu.mralmalk.historyservice.model.PrimesRecord;
import edu.iu.mralmalk.historyservice.repository.PrimesHistoryRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/primes")
public class PrimesHistoryController {
    private final PrimesHistoryRepository primesHistoryRepository;

    public PrimesHistoryController(PrimesHistoryRepository primesHistoryRepository) {
        this.primesHistoryRepository = primesHistoryRepository;
    }

    @GetMapping("/{customer}")
    public List<PrimesRecord> findAll(@PathVariable String customer) {
        return primesHistoryRepository.findAllByCustomer(customer);
    }
}