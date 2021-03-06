package com.kt.cloud.gateway.acl;

import com.kt.cloud.iam.api.access.AccessApi;
import com.kt.cloud.iam.api.access.request.ApiAccessRequest;
import com.kt.cloud.iam.api.access.response.ApiAccessResponse;
import com.kt.component.microservice.rpc.util.RpcUtils;
import org.springframework.stereotype.Component;

@Component
public class AccessApiFacade {

    private final AccessApi accessApi;

    public AccessApiFacade(AccessApi accessApi) {
        this.accessApi = accessApi;
    }

    public ApiAccessResponse getApiAccess(ApiAccessRequest request) {
        return RpcUtils.checkAndGetData(accessApi.getApiAccess(request));
    }

}
