package com.mywatchlist.dev.service;

import com.mywatchlist.dev.entity.Show;
import com.mywatchlist.dev.repository.WatchListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WatchListServiceImpl implements WatchListService {

    @Autowired
    private WatchListRepository watchListRepository;

    @Override
    public List<Show> getCompleteWatchList() {
        return watchListRepository.findAll();
    }

    @Override
    public void addShowToWatchList(Show show) {
        watchListRepository.save(show);
    }

    @Override
    public Show deleteShowFromWatchList(String showId) {
        return null;
    }
}
