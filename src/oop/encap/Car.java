package oop.encap;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Car {
//    자동차의 브랜드(brand), 모델(model), 연식(year)을 캡슐화하는 Car 클래스를 만드세요.
//    모든 필드는 private로 선언하고, 각 필드의 정보를 반환하거나 설정하는 getter와 setter 메소드를 포함하세요.
//    setter 메소드에서는 유효하지 않은 입력(예: 미래의 연식)을 거부할 수 있도록 검증 로직을 추가하세요.
    private String brand;
    private String model;
    private int year;

    Car(){
        Calendar cal=Calendar.getInstance();
        year = cal.get(Calendar.YEAR);
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        if(year> this.year){
            System.out.println("연식이 잘못되었습니다.");
            return;
        }
        this.year = year;
    }
}
