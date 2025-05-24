package repository;

import dto.DetailsDto;

public interface FormRepository {
    boolean persist(DetailsDto detailsDto);
}
