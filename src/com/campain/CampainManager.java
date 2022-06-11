package com.campain;

public class CampainManager implements  CampainService{

    @Override
    public void addCampain(Campain campain) {
        CampainList.addCampains(campain);
        System.out.println(campain.getName()+" isimli kampanya sisteme eklendi.");
    }

    @Override
    public void updateCampain(Campain campain) {
        for (Campain c: CampainList.getCampains()){
            if(campain.getName().equals(c.getName())){
                c.setName(campain.getName());
                c.setDiscountRate(campain.getDiscountRate());
                c.setFinishDate(campain.getFinishDate());
                c.setStartDate(campain.getStartDate());
                System.out.println("Kampanya güncellemesi başarıyla gerçekleşti.");
            }
            else {
                System.out.println("Böyle bir kampanya bulunmamaktadır.");
            }
        }
    }

    @Override
    public void deleteCampain(Campain campain) {
        for (Campain c:CampainList.getCampains()){
            if(c.getName().equals(campain.getName())){
                CampainList.campains.remove(c);
                System.out.println("Kampanya silindi.");
            }
            else {
                System.out.println("Böyle bir kampanya yok.");
            }
        }
    }
}
