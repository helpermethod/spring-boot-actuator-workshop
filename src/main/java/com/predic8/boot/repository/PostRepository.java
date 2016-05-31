package com.predic8.boot.repository;

import com.predic8.boot.domain.Post;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Oliver Weiler (weiler@predic8.de)
 */
public interface PostRepository extends PagingAndSortingRepository<Post, Long>{
}
