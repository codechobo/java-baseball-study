package baseball;

import java.util.List;

public class Referee {

    private Rule rule;
    private List<Integer> playerNumbers;

    public Referee(Rule rule) {
        this.rule = rule;
    }

    public void receiveComputerNumbers(List<Integer> numbers) {
        this.rule.selectedNumber(numbers);
    }

    public void receivePlayerNumbers(List<Integer> numbers) {
        this.playerNumbers = numbers;
    }

    public GameMessage answerNumber() {
        return rule.answerNumber(playerNumbers);
    }
}