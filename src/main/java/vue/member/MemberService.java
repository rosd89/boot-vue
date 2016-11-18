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

    public Member findOne(String memberId) {
        Member m = members.get(memberId);
        if(isNull(m)) return null;

        return m;
    }

    public boolean update(Member object) {
        Member m = members.get(object.getId());
        m.setEmail(object.getEmail());
        m.setName(object.getName());

        members.put(object.getId(), m);
        return true;
    }

    public boolean delete(String memberId) {
        Member m = members.get(memberId);

        if(isNull(m)){
            return false;
        }

        members.remove(memberId);
        return true;
    }
}
