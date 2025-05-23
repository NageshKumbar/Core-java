package service;

import dto.UserDetailsDto;

public class ProductServiceImplementation implements ProductService{
    public ProductServiceImplementation(){
        System.out.println("No - argument constructor of Service implementation ");
    }
    @Override
    public boolean save(UserDetailsDto userDetailsDto) {
        if (userDetailsDto!=null){
            return true;
        }
        String name = userDetailsDto.getName();
        if (name!=null&&name.length()>3&&name.length()<20){
            return true;
        }
        String type= userDetailsDto.getType();
        if (type!=null&&type.length()>3&&type.length()<25){
            return true;
        }
        int Iprice= userDetailsDto.getIprice();
        if (Iprice!=0&&Iprice>1&&Iprice<5000){
            return true;
        }
        int Sprice= userDetailsDto.getSprice();
        if (Sprice!=0&&Sprice>1&&Sprice<5000){
            return true;
        }
        double mrp= userDetailsDto.getMrp();
        if (mrp!=0&&mrp>1&&mrp<5000){
            return true;
        }
        String description = userDetailsDto.getDescription();
        if (description!=null&&description.length()>3&&description.length()<25){
            return true;
        }
        String brand = userDetailsDto.getBrand();
        if (brand!=null&&brand.length()>3&&brand.length()<25){
            return true;
        }
        int quantity= userDetailsDto.getQuantity();
        if (quantity!=0&&quantity>1&&quantity<5000){
            return true;
        }
        String colour=userDetailsDto.getColour();
        if (colour!=null&&colour.length()>3&&colour.length()<25){
            return true;
        }
        double weight=userDetailsDto.getWeight();
        if (weight!=0&&weight>1&&weight<5000){
            return true;
        }

        String mfd=userDetailsDto.getMfd();
        if (mfd!=null&&mfd.length()>3&&mfd.length()<25){
            return true;
        }
        String Warranty=userDetailsDto.getWarranty();
        if (Warranty!=null&&Warranty.length()>3&&Warranty.length()<25){
            return true;
        }
        boolean check=userDetailsDto.isCheck();

        return true;
    }
}
