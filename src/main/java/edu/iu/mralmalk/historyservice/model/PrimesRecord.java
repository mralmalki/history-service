package edu.iu.mralmalk.historyservice.model;

@Entity
@Table
public class PrimesRecord {
    @Id
    @GenerateValue
    private int id;
    private String customer;
    private String n;
    private boolean isPrime;

    public int getId() {
        return id;
    }
}