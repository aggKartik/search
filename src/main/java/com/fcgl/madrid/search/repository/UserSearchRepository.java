package com.fcgl.madrid.search.repository;

import com.fcgl.madrid.search.dataModel.UserId;
import com.fcgl.madrid.search.dataModel.UserSearch;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserSearchRepository extends MongoRepository<UserSearch, String> {

    public List<UserSearch> findByUserId(UserId userId);

    public List<UserSearch> findByQuery(String query);

}
