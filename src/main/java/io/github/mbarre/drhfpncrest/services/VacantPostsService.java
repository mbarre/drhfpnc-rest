package io.github.mbarre.drhfpncrest.services;

import io.github.mbarre.drhfpnc.sdk.Category;
import io.github.mbarre.drhfpnc.sdk.Sector;
import io.github.mbarre.drhfpnc.sdk.VacantPostsServiceWrapper;
import io.github.mbarre.drhfpncrest.domain.Post;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.config.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class VacantPostsService {

    private final Logger log = LoggerFactory.getLogger(VacantPostsService.class);


    public List<Post> getVacantPosts(String sector, String category, List<String> keywords) throws IOException {
        List<Post> posts = new ArrayList<>();
        List<io.github.mbarre.drhfpnc.sdk.Post> listPosts = VacantPostsServiceWrapper.filterAVP(Sector.valueOf(sector), Category.valueOf(category), keywords);
        for (io.github.mbarre.drhfpnc.sdk.Post post: listPosts) {
            Post aPost = new Post();
            aPost.setCadre(post.getCadre());
            aPost.setCategory(post.getCategory());
            aPost.setClosureDate(post.getClosureDate());
            aPost.setDirection(post.getDirection());
            aPost.setEmployer(post.getEmployer());
            aPost.setSector(post.getSector());
            aPost.setPost(post.getPost());
            aPost.setUrlPdf(post.getUrlPdf());
            posts.add(aPost);
        }

        return posts;

    }
}
