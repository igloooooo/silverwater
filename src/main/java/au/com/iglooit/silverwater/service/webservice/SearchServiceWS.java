package au.com.iglooit.silverwater.service.webservice;

import au.com.iglooit.silverwater.model.entity.Broker;
import au.com.iglooit.silverwater.service.search.BrokerFTSearch;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class SearchServiceWS {
    @Resource
        private BrokerFTSearch brokerFTSearch;

        @RequestMapping(value = "/ws/search", method = RequestMethod.GET)
        public
        @ResponseBody
        java.util.List<Broker> contactUsEmail(@RequestParam("local") String local, @RequestParam("q") String key,
                                    @RequestParam("from") Integer from, @RequestParam("size") Integer size,
                                    @RequestParam("category") String category) {
            if (size == null) {
                size = -1;
            }
            if (from == null) {
                from = 0;
            }
            return brokerFTSearch.searchByKeyWord(key, from, size);
        }
}
