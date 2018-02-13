package io.github.mbarre.drhfpncrest.domain;

import java.util.Date;

public class Post {

        String cadre;
        String post;
        String urlPdf;
        String category;
        String employer;
        String direction;
        String sector;
        Date closureDate;


        public String getCadre() {
        return cadre;
    }

        public void setCadre(String cadre) {
        this.cadre = cadre;
    }

        public String getPost() {
        return post;
    }

        public void setPost(String post) {
        this.post = post;
    }

        public String getUrlPdf() {
        return urlPdf;
    }

        public void setUrlPdf(String urlPdf) {
        this.urlPdf = urlPdf;
    }

        public String getCategory() {
        return category;
    }

        public void setCategory(String category) {
        this.category = category;
    }

        public String getEmployer() {
        return employer;
    }

        public void setEmployer(String employer) {
        this.employer = employer;
    }

        public String getDirection() {
        return direction;
    }

        public void setDirection(String direction) {
        this.direction = direction;
    }

        public String getSector() {
        return sector;
    }

        public void setSector(String sector) {
        this.sector = sector;
    }

        public Date getClosureDate() {
        return closureDate;
    }

        public void setClosureDate(Date closureDate) {
        this.closureDate = closureDate;
    }

        @Override
        public String toString() {
        return "Post{" +
                "cadre='" + cadre + '\'' +
                ", post='" + post + '\'' +
                ", urlPdf='" + urlPdf + '\'' +
                ", category='" + category + '\'' +
                ", employer='" + employer + '\'' +
                ", direction='" + direction + '\'' +
                ", sector='" + sector + '\'' +
                ", closureDate=" + closureDate +
                '}';
    }
}
