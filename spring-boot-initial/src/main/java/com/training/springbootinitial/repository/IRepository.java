package com.training.springbootinitial.repository;

import com.training.springbootinitial.dto.ResponseDto;

public interface IRepository {

    public ResponseDto getUser(String... data);
}
