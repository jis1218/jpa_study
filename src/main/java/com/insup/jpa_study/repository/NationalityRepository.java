package com.insup.jpa_study.repository;

import com.insup.jpa_study.domain.Nationality;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface NationalityRepository extends JpaRepository<Nationality, Long> {

    @Query("select n from Nationality n")
//    @Query("select n from Nationality n join fetch n.players p left join fetch p.club")
    List<Nationality> findAllByFetchJoin(Pageable pageable);


}
