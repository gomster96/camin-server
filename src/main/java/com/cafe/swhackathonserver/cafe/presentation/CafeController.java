package com.cafe.swhackathonserver.cafe.presentation;

import com.cafe.swhackathonserver.cafe.application.CafeService;
import com.cafe.swhackathonserver.cafe.presentation.dto.request.CafeCreateRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/cafe")
public class CafeController {
    private final CafeService cafeService;

    @PostMapping
    public ResponseEntity<Long> create(@RequestBody CafeCreateRequest request){

        Long createdId = cafeService.create(request);
        return ResponseEntity.ok(createdId);
    }
}
