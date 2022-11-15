package com.mywatchlist.dev.controller;

import com.mywatchlist.dev.entity.Show;
import com.mywatchlist.dev.service.WatchListServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v0")
public class WatchListController {

    @Autowired
    private WatchListServiceImpl watchListService;

    @GetMapping("/get-list")
    public ResponseEntity<List<Show>> getCompleteWatchList() {
        List<Show> myWatchList = watchListService.getCompleteWatchList();
        return new ResponseEntity<List<Show>>(myWatchList, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Show> addToWatchList(@RequestBody Show show){
        watchListService.addShowToWatchList(show);
        return new ResponseEntity<Show>(show, HttpStatus.CREATED);
    }


}
