package Android.controller;


import Android.pojo.Shop;
import Android.service.ShopService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.io.IOException;
import java.util.List;

@Controller
public class ShopController {

    @RequestMapping("qqqqqqqqq")
    public  @ResponseBody
    List<Shop> requestJson() throws IOException {
        ShopService shopService=new ShopService();

            List<Shop> shops= shopService.findAll();//由于@ResponseBody注解，将user转成json格式返回

        return shops;
    }
}
