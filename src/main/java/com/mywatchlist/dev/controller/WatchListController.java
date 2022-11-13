package com.mywatchlist.dev.controller;

import com.mywatchlist.dev.entity.Show;
import com.mywatchlist.dev.service.WatchListServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v0")
public class WatchListController {

    @Autowired
    private WatchListServiceImpl watchListService;

    @GetMapping("/get-list")
    public ResponseEntity<String> getCompleteWatchList() {
        System.out.println("Called this method");
        List<Show> myWatchList = watchListService.getCompleteWatchList();
        System.out.println(Arrays.toString(myWatchList.toArray()));
        return ResponseEntity.accepted().body("HELP");
    }
}
