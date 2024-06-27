package io.codelex.bankpayments;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payments")
    public void creation() {
        paymentService.create();
    }

    @PostMapping("/payment-files")
    public void creationFromFile() {
        paymentService.createFromFile();
    }

    @GetMapping("/payments")
    public String getPayments() {
        return paymentService.getPayments();
    }




}
