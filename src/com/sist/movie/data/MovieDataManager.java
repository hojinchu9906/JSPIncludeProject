package com.sist.movie.data;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

import static javafx.beans.binding.Bindings.select;
import static org.jsoup.Jsoup.connect;

/**
 * Created by sist on 2016-03-22.
 */
public class MovieDataManager {
    public static List<MovieDTO> movieAllData(){
        //컬랙션 클래스 생성
        List<MovieDTO> list=new ArrayList<>();
        try{
            Document document=Jsoup.connect("http://www.cgv.co.kr/movies/").get();

            Elements titleElemet=document.select("div.box-contents strong.title");
            Elements percentElement=document.select("div.box-contents strong.percent");
            Elements imgElement=document.select("div.box-image span.thumb-image img");

            Elements likeElement=document.select("div.box-contents span.like span.count strong i");
            Elements rElement=document.select("div.box-contents span.txt-info strong");
            Elements sElement=document.select("div.box-contents span.percent");

            for(int i=0;i<titleElemet.size();i++){
                Element telement=titleElemet.get(i);
                Element pelement=percentElement.get(i);
                Element ielement=imgElement.get(i);
                Element lelement=likeElement.get(i);
                String img=ielement.attr("src");

                Element relement=rElement.get(i);
                Element selement=sElement.get(i);

                MovieDTO movieDTO=new MovieDTO();
                movieDTO.setTitle(telement.text());
                movieDTO.setImage(img);

                int like=Integer.parseInt(lelement.text().replace(",",""));
                movieDTO.setLike(like);
                movieDTO.setRegdate(relement.text().substring(0, relement.text().indexOf("개봉")).trim());

                movieDTO.setPercent(pelement.text().substring(3, pelement.text().indexOf('%')));
                movieDTO.setReserve((Double.parseDouble(sElement.text().substring(0,selement.text().indexOf('%')))));

                list.add(movieDTO);
            }



        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }


        return list;
    }

    public static void main(String[] args) {
        List<MovieDTO> list=movieAllData();

        for(MovieDTO movieDTO:list){
            System.out.println(movieDTO.getTitle());
            System.out.println(movieDTO.getImage());
            System.out.println(movieDTO.getPercent());
            System.out.println(movieDTO.getReserve());
            System.out.println(movieDTO.getRegdate());
            System.out.println(movieDTO.getLike());
        }
    }
}





























