package com.tensquare.friend.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @date 2019-01-10 13:31
 * @since 1.0.0
 */
@FeignClient("tensquare-user")
public interface UserClient {

    @RequestMapping(value = "/user/{userid}/{friendid}/{x}" ,method = RequestMethod.PUT)
    public void updateFansCountAndFollowCount(@PathVariable String userid, @PathVariable String friendid, int x);
}
