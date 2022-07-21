package com.bootcamp.customer.model.service;

import com.bootcamp.customer.model.document.Customer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerService {

    Flux<Customer> getAll();
    Mono<Customer> save(Customer customer);

    Mono<Customer> findById(String id);
    Mono<Boolean> existById(String id);

    Mono<Void> delete(String id);

    Mono<Customer> update(String id, Customer customer);
}
