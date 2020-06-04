package com.conference.conferencespringboot.repositories;

import com.conference.conferencespringboot.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
