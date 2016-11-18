package vue.error;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import vue.member.Member;

import javax.validation.Valid;

/**
 * Created by sam on 2016. 11. 19..
 */
@RestController
@RequestMapping("error")
public class ErrorHandlingController {

    @RequestMapping(path="/404", method = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
    @ResponseBody
    public String error() {
        return "ERROR 404";
    }

}
