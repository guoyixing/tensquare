package com.tensquare.friend.dao;

import com.tensquare.friend.pojo.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * @date 2019-01-09 11:12
 * @since 1.0.0
 */
public interface FriendDao extends JpaRepository<Friend, String> {
    Friend findByUseridAndFriendid(String userid, String friendid);

    @Modifying
    @Query(value = "update tb_friend set islike = ? where userid = ? And friendid = ?" ,nativeQuery = true)
    void updateIsLike(String islike,String userid,String friendid);

    @Modifying
    @Query(value = "DELETE FROM tb_friend where userid = ? And friendid = ?" ,nativeQuery = true)
    void deleteFriend(String userid, String friendid);
}
