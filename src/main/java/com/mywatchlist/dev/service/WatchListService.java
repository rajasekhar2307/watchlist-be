package com.mywatchlist.dev.service;

import com.mywatchlist.dev.entity.Show;
import org.springframework.stereotype.Service;

import java.util.List;

public interface WatchListService {
    List<Show> getCompleteWatchList();

    Show addShowToWatchList(Show show);

    Show deleteShowFromWatchList(String showId);
}
