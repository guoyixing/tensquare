package com.tensquare.friend.dao;

import com.tensquare.friend.pojo.Friend;
import com.tensquare.friend.pojo.NoFriend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * @date 2019-01-09 11:12
 * @since 1.0.0
 */
public interface NoFriendDao extends JpaRepository<NoFriend, String> {
    NoFriend findByUseridAndFriendid(String userid, String friendid);

}
