package com.hsu.travelmaker.domain.profile.web.controller;

import com.hsu.travelmaker.domain.profile.service.ProfileServiceImpl;
import com.hsu.travelmaker.domain.profile.web.dto.ProfileUpdateDto;
import com.hsu.travelmaker.global.response.CustomApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/profile")
@RequiredArgsConstructor
public class ProfileController {

    private final ProfileServiceImpl profileService;

    @PostMapping("/update")
    public ResponseEntity<CustomApiResponse<?>> profileUpdate(@RequestBody ProfileUpdateDto dto) {
        return profileService.profileUpdate(dto);
    }

}