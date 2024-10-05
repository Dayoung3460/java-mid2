package collection.map.test.member;

public class MemberRepositoryMain {
    public static void main(String[] args) {
        Member member1 = new Member("id1", "member1");
        Member member2 = new Member("id2", "member2");
        Member member3 = new Member("id3", "member3");

        MemberRepository repository = new MemberRepository();
        repository.save(member1);
        repository.save(member2);
        repository.save(member3);

        Member findMember1 = repository.findById("id1");
        System.out.println("findMember1 = " + findMember1);

        Member findMember3 = repository.findByName("member3");
        System.out.println("findMember3 = " + findMember3);

        repository.remove("id1");
        Member removedMember1 = repository.findById("id1");
        System.out.println("removedMember1 = " + removedMember1);

    }
}
