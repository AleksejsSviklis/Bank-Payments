package io.codelex.bankpayments;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Valid
    @NotNull(message = "Amount must not be null")
    private BigDecimal amount;
    @Valid
    @NotBlank(message = "debtorIban must not be empty")
    private String debtorIban;
    @CreationTimestamp
    private LocalDateTime creationTimestamp;


}
