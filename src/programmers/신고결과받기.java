package programmers;

import java.util.*;

public class 신고결과받기 {

    public int[] solution(String[] id_list, String[] report, int k) {

        Map<String, Integer> mapNameToIndex = new HashMap<>();

        int cntId = id_list.length;

        int[] answer = new int[cntId];

        HashSet<String> setReport = new HashSet<>(Arrays.asList(report));
        String[] notDupReport = setReport.toArray(new String[0]);

        int cntReport = notDupReport.length;

        String[][] listReport = new String[cntReport][2];
        int[] listCntReport = new int[cntId];

        List<List<String>> listReportOfUser = new ArrayList<>();

        for (int i = 0; i < cntId; i++) {
            mapNameToIndex.put(id_list[i], i);
            listReportOfUser.add(new ArrayList<>());
        }

        for (int i = 0; i < cntReport; i++) {
            String[] temp = notDupReport[i].split(" ");
            listReport[i][0] = temp[0];
            listReport[i][1] = temp[1];

            listCntReport[mapNameToIndex.get(temp[1])]++;
            listReportOfUser.get(mapNameToIndex.get(temp[0])).add(temp[1]);
        }

        for (int i = 0; i < cntId; i++) {
            for (int j = 0; j < listReportOfUser.get(i).size(); j++) {
                if (listCntReport[mapNameToIndex.get(listReportOfUser.get(i).get(j))] >= k)
                    answer[i]++;
            }
        }

        for (int t : answer) {
            System.out.print(t + " ");
        }

        return answer;
    }

    public static void main(String[] args) {
        신고결과받기 solution = new 신고결과받기();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
//        String[] id_list = {"con", "ryan"};
//        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
//        int k = 3;
        solution.solution(id_list, report, k);
    }
}
