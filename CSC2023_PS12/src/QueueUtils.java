import java.util.*;

public class QueueUtils {
    public static Queue<String> build(String line) {
        Queue<String> QueueData = new LinkedList<>();
        String data = "";
        ArrayList<String> list = new ArrayList<>();

        for (int x = 0; x < line.length(); x++) {
            if (line.charAt(x) == ' ' || line.charAt(x) == '\t') {
                if (data.length() > 0) {
                    list.add(data);
                    data = "";
                }
            } else {
                data += line.charAt(x);
            }

            if (x == line.length() - 1) {
                list.add(data);
            }
        }

        for (String current : list) {
            QueueData.add(current);
        }

        return QueueData;
    }

    private static String operation(String operator, String num1, String num2) {
        int answer = 0;
        switch (operator) {
            case "+" -> answer = Integer.parseInt(num1) + Integer.parseInt(num2);
            case "-" -> answer = Integer.parseInt(num1) - Integer.parseInt(num2);
            case "*" -> answer = Integer.parseInt(num1) * Integer.parseInt(num2);
        }

        return String.valueOf(answer);
    }

    public static int eval(Queue<String> q) {
        int answer = 0;
        if (q.size() == 1) {
            return Integer.parseInt(q.poll());
        } else {
            Queue<String> newQueue = new LinkedList<>();
            while (!q.isEmpty() && !q.peek().equals("")) {
                String operator = q.poll();
                String num1 = "";
                String num2 = "";
                if (!Character.isDigit(operator.charAt(0))) {
                    if (Character.isDigit(q.peek().charAt(0))) {
                        num1 = q.poll();
                        if (Character.isDigit(q.peek().charAt(0))) {
                            num2 = q.poll();
                            newQueue.add(operation(operator, num1, num2));

                            while (!q.isEmpty() && !q.peek().equals("")) {
                                newQueue.add(q.poll());
                            }
                            answer = eval(newQueue);
                            break;

                        } else {
                            newQueue.add(operator);
                            newQueue.add(num1);
                        }
                    } else {
                        newQueue.add(operator);
                    }
                }
            }
        }

        return answer;
    }

        public String toString (Queue < String > q) {
            String output = "[";
            while (!q.isEmpty()) {
                String current = q.poll();
                output += current + ", ";
            }
            output = output.substring(0, output.length() - 2);
            output += "]";

            return output;
        }
    }
