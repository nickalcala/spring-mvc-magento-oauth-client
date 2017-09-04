package totallister.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import totallister.model.MagentoOrder;

@RestController
public class ShippingCalculator {

    @RequestMapping(value = "/shippingcalculator", method = RequestMethod.POST)
    public double getRequestToken(@RequestBody MagentoOrder order) {
        System.out.println(order);
        return 123.25;
    }

}