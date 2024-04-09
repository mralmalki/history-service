package edu.iu.mralmalk.historyservice.rabbitmq;

import edu.iu.mralmalk.historyservice.model.PrimesRecord;
import edu.iu.mralmalk.historyservice.repository.PrimesHistoryRepository;

public class MQReceiver {
    private final PrimesHistoryRepository primesHistoryRepository;

    public MQReceiver(PrimesHistoryRepository primesHistoryRepository) {
        this.primesHistoryRepository = primesHistoryRepository;
    }

    @RabbitListener(queues = {"primes"})
    public void receiveMessage(@Payload String message) {
        System.out.println(message);
        Gson gson = new Gson();
        PrimesRecord primesRecord = gson
                .fromJson(message, PrimesRecord, PrimesRecord.class);
        primesHistoryRepository.save(primesRecord);
    }
}