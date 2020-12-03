package springBootInitial.repository;

import springBootInitial.dto.ResponseDto;

public interface IRepository {

    public ResponseDto getUser(String... data);
}
