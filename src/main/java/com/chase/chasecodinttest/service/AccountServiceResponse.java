package com.chase.chasecodinttest.service;

import com.chase.chasecodinttest.configuration.Providers;
import com.chase.chasecodinttest.model.dataprovider.DataProviderRequest;
import com.chase.chasecodinttest.model.dataprovider.DataProviderResponse;
import com.chase.chasecodinttest.model.request.IncomingRequest;
import com.chase.chasecodinttest.model.response.ResponseData;
import com.chase.chasecodinttest.model.response.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;



@Service
public class AccountServiceResponse {

    public ServiceResponse  serviceResponse(IncomingRequest incomingRequest) {

        List<String> providerList = incomingRequest.getProviders();
        RestTemplate restTemplate = new RestTemplate();
        DataProviderRequest dataProviderRequest = new DataProviderRequest(incomingRequest.getAccountNumber());

        List<ResponseData> result = new ArrayList<>();

        int providerIndex = 0;
        for(String provider : providerList) {

            providerIndex = providerList.indexOf(provider);
            String url = providers.getUrl().get(providerIndex);

            DataProviderResponse dataProviderResponse = restTemplate.postForObject(url, dataProviderRequest, DataProviderResponse.class);
            ResponseData responseData = new ResponseData(url, dataProviderResponse.getIsValid());
            result.add(responseData);
        }
        return new ServiceResponse(result);
    }
    @Autowired
    private Providers providers;
}
