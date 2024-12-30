package Set_Map;

import java.util.*;

public class Set_map2 {

    //ap dung map:
    //+cac bai tap lien quan den tan xuat
    //+cac bai tap them xoa sua tim kiem
    //dung map thay cho cac bai tap mang danh dau khong dep
    public static void main(String[] args) {
        //vi du 1:dem tan xuat cac gia tri xuat hien trong mang
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int x : a) {
            if (map.containsKey(x)) {
                int tx = map.get(x);
                tx++;
                map.put(x, tx);
            } else {
                map.put(x, 1);

            }

        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
