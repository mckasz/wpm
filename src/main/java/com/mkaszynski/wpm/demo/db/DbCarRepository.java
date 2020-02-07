package com.mkaszynski.wpm.demo.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DbCarRepository extends JpaRepository<CarEntity, String> {

}