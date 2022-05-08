package com.payments.easypayments.service.proxies;

import com.payments.easypayments.model.RiskScore;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.websocket.server.PathParam;

@FeignClient(name = "riskService", url = "localhost:8000")
public interface RiskServiceProxy {

    @GetMapping("/riskScore/{phoneNos}")
    public RiskScore retrieveRiskScore(@PathVariable String phoneNos);

}
