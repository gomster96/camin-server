package com.cafe.swhackathonserver.cafe.presentation;


import com.cafe.swhackathonserver.cafe.application.SectionService;
import com.cafe.swhackathonserver.cafe.presentation.dto.request.SectionCreateRequest;
import com.cafe.swhackathonserver.user.presentation.dto.request.CafeCreateRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/section")
public class SectionController {

    private final SectionService sectionService;

    @PostMapping
    public ResponseEntity<Long> createSection(@RequestBody SectionCreateRequest request){
        Long sectionId = sectionService.createSection(request.getName());
        return ResponseEntity.ok(sectionId);
    }

    @DeleteMapping("{sectionId}")
    public ResponseEntity<Long> deleteSection(@PathVariable Long sectionId){
        Long deletedId = sectionService.deleteSection(sectionId);
        return ResponseEntity.ok(deletedId);
    }
}