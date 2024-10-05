package collection.map.test.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {
    HashMap<String, String> members = new HashMap<>();

    public void save(Member member) {
        members.put(member.getId(), member.getName());

    }

    public void remove(String id) {
        members.remove(id);
    }

    public Member findById(String id) {
        Member result = null;

        if (members.containsKey(id)) {
            result = new Member(id, members.get(id));
        }
        return result;
    }

    public Member findByName(String name) {
        Member result = null;

        for (Map.Entry<String, String> entry : members.entrySet()) {
            if (entry.getValue().equals(name)) {
                result = new Member(entry.getKey(), entry.getValue());
            }
        }
        return result;
    }
}
