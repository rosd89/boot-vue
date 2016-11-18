package vue.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vue.common.GenericController;

import javax.validation.Valid;

/**
 * Created by sam on 2016. 11. 19..
 */
@RestController
@RequestMapping("members")
public class MemberController implements GenericController<Member, String>{

    @Autowired
    private MemberService memberService;

    @Override
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public boolean create(@Valid Member object) {
        return memberService.create(object);
    }

    @Override
    @RequestMapping(path = "/{memberId}", method = RequestMethod.GET)
    public Member findOne(@PathVariable("memberId") String memberId) {
        return memberService.findOne(memberId);
    }

    @Override
    @RequestMapping(method = RequestMethod.PUT)
    public boolean update(Member object) {
        return memberService.update(object);
    }

    @Override
    @RequestMapping(path = "/{memberId}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable("memberId") String memberId) {
        return memberService.delete(memberId);
    }
}
