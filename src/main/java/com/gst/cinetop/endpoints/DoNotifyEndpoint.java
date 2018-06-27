package com.gst.cinetop.endpoints;

import com.payment.service.mps.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Created by DerKaiser on 6/13/18.
 */
@Endpoint
public class DoNotifyEndpoint {
    private static Logger logger = LogManager.getLogger(DoNotifyEndpoint.class);
    private static final String NAMESPACE_URI = "http://service.payment.com/mps";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "doNotify")
    @ResponsePayload
    public DoNotifyResponse doNotifyResponse(@RequestPayload DoNotify request) {
        DoNotifyResponse response = new DoNotifyResponse();
        logger.info(request);
        response.setReturn("result | mô tả nội dung của result");
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "moRequest")
    @ResponsePayload
    public MoRequestResponse moRequestResponse(@RequestPayload MoRequest request) {
        MoRequestResponse response = new MoRequestResponse();
        response.setReturn("0|PASSWORD:PPP");
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "contentRequest")
    @ResponsePayload
    public ContentRequestResponse contentRequestResponse(@RequestPayload ContentRequest request) {
        ContentRequestResponse response = new ContentRequestResponse();
        response.setReturn("0|Weather temperature is 30oC");
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "mpschargeRequest")
    @ResponsePayload
    public MpschargeResponse mpschargeResponse(@RequestPayload MpschargeRequest request) {
        MpschargeResponse response = new MpschargeResponse();
        response.setReturn("0");
        return response;
    }
}
