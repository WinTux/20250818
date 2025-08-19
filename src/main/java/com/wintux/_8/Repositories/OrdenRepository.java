package com.wintux._8.Repositories;

import com.wintux._8.Models.Orden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdenRepository extends JpaRepository<Orden, Long> {
}