package com.literalura.gutendexapi.service;

import lombok.Data;

import java.util.List;

@Data
public class GutendexResponse {
    private List<GutendexBook> results;
}

