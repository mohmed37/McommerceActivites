package com.clientui.proxies;

import com.clientui.beans.ExpeditionBean;
import com.clientui.beans.ProductBean;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "zuul-server")
@RibbonClient(name = "microservice-expedition")
public interface MicroserviceExpeditionProxy {
    /*
     * Notez ici la notation @PathVariable("id") qui est différente de celle qu'on utlise dans le contrôleur
     **/
    @GetMapping( value = "/microservice-expedition/Expeditions/{id}")
    ExpeditionBean recupererUneExpedition(@PathVariable("id") int id);

}
