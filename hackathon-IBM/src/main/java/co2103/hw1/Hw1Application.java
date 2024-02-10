package co2103.hw1;

import co2103.hw1.domain.Contestant;
import co2103.hw1.domain.Quiz;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Hw1Application {

    public static List<Quiz> quizzes;

    public static void main(String[] args) {

        ArrayList<Contestant> contestants = new ArrayList<Contestant>();
        Hw1Application.quizzes = new ArrayList<Quiz>();

        //initialising contestants
        Contestant contestant1 = new Contestant();
        contestant1.setName("Clive");
        contestant1.setSkill("Science");
        contestant1.setProfession("I.T.");
        contestant1.setWins(0);

        Contestant contestant2 = new Contestant();
        contestant2.setName("Alec");
        contestant2.setSkill("Literature");
        contestant2.setProfession("Doctor");
        contestant2.setWins(0);

        contestants.add(contestant1);
        contestants.add(contestant2);

        //initialising quiz
        Quiz quiz1 = new Quiz();
        quiz1.setName("Fun Rock Quiz!");
        quiz1.setGenre("Rock");
        quiz1.setId(1);
        quiz1.setContestants(contestants);
        quizzes.add(quiz1);

        SpringApplication.run(Hw1Application.class, args);

    }
}