package vue.member;

import org.springframework.stereotype.Service;

import java.util.HashMap;

import static java.util.Objects.isNull;

/**
 * Created by sam on 2016. 11. 19..
 */
@Service
public class MemberService {

    private HashMap<String, Member> members = new HashMap<String, Member>(){
        {
            put("attdro", new Member("attdro", "rosd0000@gmail.com", "sam"));
        }
    };

    public boolean create(Member object) {
        members.put(object.getId(), object);
        return true;
    }

    public Member findOne(String userId) {
        Member m = members.get(userId);
        if(isNull(m)) return null;

        return m;
    }
}
