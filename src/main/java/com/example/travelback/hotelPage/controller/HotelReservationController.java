package com.example.travelback.hotelPage.controller;

import com.example.travelback.hotelPage.domain.Reservation;
import com.example.travelback.hotelPage.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/reserv")
public class HotelReservationController {
    private final ReservationService reservationService;



    @GetMapping("/{id}")
    public ResponseEntity<Reservation> getReservationById(@PathVariable Long id){
        Reservation reservation=reservationService.getReservationById(id);
        return ResponseEntity.ok(reservation);
    }

}
