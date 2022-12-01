import java.sql.SQLOutput;
import java.util.Optional;

public class OptionalL {
    public static void main(String[] args) {

       // optional(5,3);
    }
    public static void optional(Optional<Long> userId,Optional<Long> postId){
        System.out.println("UserId: "+ userId);
        System.out.println("PostId: "+ postId);
        System.out.println("Sum: "+userId+postId);
    }
}
