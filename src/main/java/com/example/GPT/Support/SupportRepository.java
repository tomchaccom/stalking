package com.example.GPT.Support;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SupportRepository extends JpaRepository<SupportProgram, Long> {

    Optional<SupportProgram> findById(Long id);
}
