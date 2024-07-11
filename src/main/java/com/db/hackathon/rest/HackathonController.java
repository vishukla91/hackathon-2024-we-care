package com.db.hackathon.rest;

import com.db.hackathon.model.HackthonResponse;
import jakarta.websocket.server.PathParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HackathonController {

    @GetMapping(value = "/hackthon/{hackthonId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HackthonResponse> getHackathonDetails(@PathVariable(value = "hackthonId") long hackthonId){
        HackthonResponse response  = HackthonResponse.builder().id("001").name("Vibha").build();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
