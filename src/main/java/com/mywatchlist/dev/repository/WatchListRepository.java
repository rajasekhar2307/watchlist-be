package com.mywatchlist.dev.repository;

import com.mywatchlist.dev.entity.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchListRepository extends JpaRepository<Show, String> {
}
