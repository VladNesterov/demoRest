package com.rest.demoRest.controller;

import com.rest.demoRest.dto.StudentRequestDto;
import com.rest.demoRest.dto.StudentRequestFilterDto;
import com.rest.demoRest.dto.StudentResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("shop/student")
public class StudentController {

    @PutMapping("create")
    @Operation(summary = "Get a book by its id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the book",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = StudentRequestDto.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Book not found",
                    content = @Content) })
    public ResponseEntity<List<StudentResponseDto>> createStudent(@Valid @RequestBody List<StudentRequestDto> roles) {
        //creation logic
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.CREATED);
    }

    @PutMapping("change")
    public ResponseEntity<StudentResponseDto> changeStudent(@PathVariable Long id, @Valid @RequestBody StudentRequestDto role) {
        //creation logic
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    @GetMapping("getByFilter")
    public ResponseEntity<List<StudentResponseDto>> getProductsByFilter(@RequestParam(value = "offset", defaultValue = "0") Integer offset,
                                                                                   @RequestParam(value = "limit", defaultValue = "10") Integer limit,
                                                                                   @Valid @RequestBody StudentRequestFilterDto studentRequestDto) {
        //retrieval logic
        return ResponseEntity.ok(new ArrayList<>());
    }

    @DeleteMapping
    public ResponseEntity<Void> removeStudent(@Valid @RequestBody List<Long> id) {
        //retrieval logic
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
