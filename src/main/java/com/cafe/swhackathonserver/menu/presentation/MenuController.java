package com.cafe.swhackathonserver.menu.presentation;

import com.cafe.swhackathonserver.menu.application.MenuService;
import com.cafe.swhackathonserver.menu.application.dto.MenuCreateDto;
import com.cafe.swhackathonserver.menu.presentation.dto.request.MenuCreateRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/menu")
public class MenuController {
    private final MenuService menuService;

    @PostMapping
    public ResponseEntity<Long> create(@RequestBody MenuCreateRequest request){
        Long id = menuService.create(request.getCafeId(), MenuCreateDto.from(request));
        return ResponseEntity.ok(id);
    }

    @DeleteMapping("/{menuId}")
    public ResponseEntity<Long> delete(@PathVariable Long menuId){
        Long id = menuService.delete(menuId);
        return ResponseEntity.ok(id);
    }

}
