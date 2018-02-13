package io.github.mbarre.drhfpncrest.services;

import io.github.mbarre.drhfpnc.sdk.Category;
import io.github.mbarre.drhfpnc.sdk.Sector;
import io.github.mbarre.drhfpnc.sdk.VacantPostsServiceWrapper;
import io.github.mbarre.drhfpncrest.domain.Post;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class VacantPostsService {

    private final Logger log = LoggerFactory.getLogger(VacantPostsService.class);


    public List<Post> getVacantPosts(String sector, String category, List<String> keywords){
        try {
            List<io.github.mbarre.drhfpnc.sdk.Post> listPosts = VacantPostsServiceWrapper.filterAVP(Sector.valueOf(sector), Category.valueOf(category), keywords);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
