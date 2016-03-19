package com.minhtien.bthinhom;

import java.util.List;

/**
 * Created by MinhTien on 3/18/2016.
 */
public class Response {

    /**
     * type : AUD
     * imageurl : http://tigia.hunggiasaigon.com/AUD.gif
     * muatienmat : 15770
     * muack : 15750
     * bantienmat : 15850
     * banck : 15830
     */

    private List<ItemsBean> items;

    public List<ItemsBean> getItems() {
        return items;
    }

    public void setItems(List<ItemsBean> items) {
        this.items = items;
    }

    public static class ItemsBean {
        private String type;
        private String imageurl;
        private String muatienmat;
        private String muack;
        private String bantienmat;
        private String banck;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getImageurl() {
            return imageurl;
        }

        public void setImageurl(String imageurl) {
            this.imageurl = imageurl;
        }

        public String getMuatienmat() {
            return muatienmat;
        }

        public void setMuatienmat(String muatienmat) {
            this.muatienmat = muatienmat;
        }

        public String getMuack() {
            return muack;
        }

        public void setMuack(String muack) {
            this.muack = muack;
        }

        public String getBantienmat() {
            return bantienmat;
        }

        public void setBantienmat(String bantienmat) {
            this.bantienmat = bantienmat;
        }

        public String getBanck() {
            return banck;
        }

        public void setBanck(String banck) {
            this.banck = banck;
        }
    }
}
