package com.sat.auth.client;

import api.UserApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author zx
 * @date 2021/04/14
 */
@FeignClient(value = "user-service")
public interface UserClient extends UserApi {
}
