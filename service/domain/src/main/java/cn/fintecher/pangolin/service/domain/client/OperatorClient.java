package cn.fintecher.pangolin.service.domain.client;


import cn.fintecher.pangolin.common.model.OperatorSearchModel;
import cn.fintecher.pangolin.common.model.response.LoginResponse;
import cn.fintecher.pangolin.entity.managentment.Operator;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by ChenChang on 2017/8/28.
 */
@FeignClient("management-service")
public interface OperatorClient {
    @RequestMapping(method = RequestMethod.GET, value = "/api/operators/getUserByToken/{token}")
    ResponseEntity<LoginResponse> getUserByToken(@PathVariable("token") String token);

    @RequestMapping(method = RequestMethod.GET, value = "/api/operators/getUserList")
    ResponseEntity<List<Operator>> getUserList(OperatorSearchModel model);
}
