package com.chase.chasecodinttest.controller;

import com.chase.chasecodinttest.model.request.IncomingRequest;
import com.chase.chasecodinttest.model.response.ServiceResponse;
import com.chase.chasecodinttest.service.AccountServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value="/jpmChase")
public class ChaseController {


    @PostMapping(value="/getResult", consumes="application/json")
    public ServiceResponse retrieveServiceResponse(@RequestBody IncomingRequest incomingRequest)
    {
        return accountServiceResponse.serviceResponse(incomingRequest);
    }

    @Autowired
    private AccountServiceResponse accountServiceResponse;
}
