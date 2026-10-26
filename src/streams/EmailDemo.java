package streams;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;


class EmailAnalysis {
    private final String sender;
    private final String riskLevel;
    private final double score;

    EmailAnalysis(String sender, String riskLevel, double score) {
        this.sender = sender;
        this.riskLevel = riskLevel;
        this.score = score;
    }

    String getSender() {
        return sender;
    }

    String getRiskLevel() {
        return riskLevel;
    }

    double getScore() {
        return score;
    }
}

public class EmailDemo {
    public static void main(String[] args) {

        List<EmailAnalysis> emails = Arrays.asList(
                new EmailAnalysis("billing@example.com", "HIGH", 92),
                new EmailAnalysis("team@example.org", "LOW", 15),
                new EmailAnalysis("verify@example.net", "HIGH", 87),
                new EmailAnalysis("news@example.com", "MEDIUM", 50)
        );

        // Filter high-risk emails.
        List<EmailAnalysis> highRisk = emails.stream()
                .filter(email -> email.getScore() >= 80)
                .collect(Collectors.toList());

        // Sort by risk score, highest first.
        highRisk.sort(
                Comparator.comparingDouble(EmailAnalysis::getScore).reversed()
        );

        // Group analyses by risk level.
        Map<String, List<EmailAnalysis>> grouped = emails.stream()
                .collect(Collectors.groupingBy(EmailAnalysis::getRiskLevel));

        System.out.println("High-risk email count: " + highRisk.size());
        highRisk.forEach(email ->
                System.out.println(email.getSender() + " : " + email.getScore())
        );

        System.out.println("Groups: " + grouped.keySet());
        AtomicInteger i = new AtomicInteger();
        List<EmailAnalysis> high = emails.stream().filter(x -> x.getRiskLevel().equals("high")).toList();
        if (!highRisk.isEmpty()) {
            high.stream().forEach(x -> System.out.println((i.getAndIncrement()) + " -->   Sender : " + x.getSender() + " , Risk Lavel : " + x.getRiskLevel() + " , Score : " + x.getScore()));
        }

    }
}
