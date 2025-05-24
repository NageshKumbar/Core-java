package service;

import dto.DetailsDto;
import repository.FormRepository;
import repository.FormRepositoryImplementation;

public class FormServiceImplementation implements FormService{
    @Override
    public boolean save(DetailsDto detailsDto) {
        String username=detailsDto.getUsername();
        String email=detailsDto.getEmail();
        double contact =detailsDto.getContact();
        String complaint=detailsDto.getComplaint();
        if(username!=null&&username.length()>3&&username.length()<20){
            System.out.println("valid name");
        }
        else {
            System.out.println("not valid");
            return false;
        }
        if(email!=null&&email.length()>3&&email.length()<200){
            System.out.println("valid mail");
        }
        else {
            System.out.println("not valid");
            return false;
        }
        if(contact>5000000000L && contact<100000000000L){
            System.out.println("valid contact");
        }
        else {
            System.out.println("not valid");
            return false;
        }
        if(complaint!=null&&complaint.length()>3&&complaint.length()<200){
            System.out.println("valid complaint");
        }
        else {
            System.out.println("not valid");
            return false;
        }
        {
            FormRepository formRepository = new FormRepositoryImplementation();
            boolean repo = formRepository.persist(detailsDto);
            System.out.println("block running");
            return repo;
        }





    }

}
