package io.codelex.bankpayments;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public void create() {
    }

    public void createFromFile() {

    }

    public String getPayments() {
        return "Payments";
    }


}
