package repository;

import dto.DetailsDto;

public class FormRepositoryImplementation implements FormRepository{

    @Override
    public boolean persist(DetailsDto detailsDto) {
        if(detailsDto!=null){
            return true;
        }
        return false;
    }
}
