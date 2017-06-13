package com.chen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chen.model.Spittle;

public interface SpittleRepository extends JpaRepository<Spittle, Long> {
	List<Spittle> findSpittles(long max, int count);
}
