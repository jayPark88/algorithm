import dfs.TargetNumber;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class Dfs {
    @Test
    @DisplayName("targetNumber dfs Test")
    public void targetNumberDfs(){
        TargetNumber targetNumber = new TargetNumber();
        //given :) :)
        int[]numbers={1,1,1,1,1};
        int target = 3;

        // when
        int answer = targetNumber.solution(numbers, 0, target, 0);

        // then
        Assertions.assertEquals(answer, 5);
    }
}
