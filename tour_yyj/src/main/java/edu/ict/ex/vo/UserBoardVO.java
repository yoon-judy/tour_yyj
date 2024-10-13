package edu.ict.ex.vo;

public class UserBoardVO {
    private String tour_code;
    private String tour_name;
    private String tour_address;
    private String tour_cmmt;
    private String tour_telno;
    private int custom_cnt;
    private int car_cnt;

    // 기본 생성자
    public UserBoardVO() {}

    // Getters and Setters
    public String getTour_code() {
        return tour_code;
    }

    public void setTour_code(String tour_code) {
        this.tour_code = tour_code;
    }

    public String getTour_name() {
        return tour_name;
    }

    public void setTour_name(String tour_name) {
        this.tour_name = tour_name;
    }

    public String getTour_address() {
        return tour_address;
    }

    public void setTour_address(String tour_address) {
        this.tour_address = tour_address;
    }

    public String getTour_cmmt() {
        return tour_cmmt;
    }

    public void setTour_cmmt(String tour_cmmt) {
        this.tour_cmmt = tour_cmmt;
    }

    public String getTour_telno() {
        return tour_telno;
    }

    public void setTour_telno(String tour_telno) {
        this.tour_telno = tour_telno;
    }

    public int getCustom_cnt() {
        return custom_cnt;
    }

    public void setCustom_cnt(int custom_cnt) {
        this.custom_cnt = custom_cnt;
    }

    public int getCar_cnt() {
        return car_cnt;
    }

    public void setCar_cnt(int car_cnt) {
        this.car_cnt = car_cnt;
    }

    @Override
    public String toString() {
        return "UserBoardVO{" +
                "tour_code='" + tour_code + '\'' +
                ", tour_name='" + tour_name + '\'' +
                ", tour_address='" + tour_address + '\'' +
                ", tour_cmmt='" + tour_cmmt + '\'' +
                ", tour_telno='" + tour_telno + '\'' +
                ", custom_cnt=" + custom_cnt +
                ", car_cnt=" + car_cnt +
                '}';
    }
}
