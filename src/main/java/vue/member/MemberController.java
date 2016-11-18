package vue.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import vue.common.GenericController;

import javax.validation.Valid;
import java.util.List;

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
    public boolean update(Member object) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public List<Member> find(int page, String sortOption) {
        return null;
    }
}
