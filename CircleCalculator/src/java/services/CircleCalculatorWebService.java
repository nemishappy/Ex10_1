/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author nemishappy
 */
@WebService(serviceName = "CircleCalculatorWebService")
public class CircleCalculatorWebService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AreaofaCircle")
    public double AreaofaCircle(@WebParam(name = "radius") double radius) {
        //TODO write your implementation code here:
        BigDecimal bd = new BigDecimal(((double)22/7)*(radius*radius)).setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Circumference")
    public double Circumference(@WebParam(name = "radius") double radius) {
        //TODO write your implementation code here:
        BigDecimal bd = new BigDecimal(((double)22/7)*(radius*2)).setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    /**
     * This is a sample web service operation
     */
    
}
