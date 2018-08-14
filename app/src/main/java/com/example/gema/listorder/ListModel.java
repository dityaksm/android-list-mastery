package com.example.gema.listorder;

public class ListModel {
    String statusOrder, timeOrder, locationOrder;
    int imageOrder;

    //constructor
    public ListModel(String statusOrder, String timeOrder, String locationOrder, int imageOrder) {
        this.statusOrder = statusOrder;
        this.timeOrder = timeOrder;
        this.locationOrder = locationOrder;
        this.imageOrder = imageOrder;
    }

    public String getStatusOrder() {
        return statusOrder;
    }

    public void SetStatusOrder(String namaBuah) {
        this.statusOrder = statusOrder;
    }

    public String getTimeOrder() {
        return timeOrder;
    }

    public void SetTimeOrder(String namaBuah) {
        this.timeOrder = timeOrder;
    }


    public String getLocationOrder() {
        return locationOrder;
    }

    public void SetLocationOrder(String namaBuah) {
        this.locationOrder = locationOrder;
    }

    public int getImageOrder() {
        return imageOrder;
    }

    public void setImageOrder(int gambarBuah) {
        this.imageOrder = imageOrder;
    }
}
