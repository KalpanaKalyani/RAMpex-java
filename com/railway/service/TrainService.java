package com.railway.service;

import com.railway.model.Train;
import java.util.ArrayList;

public class TrainService {
    public ArrayList<Train> list = new ArrayList<>();

    public TrainService() {
        list.add(new Train(13351, "Dhanbad Alappuzha SF ", "11:20 ➔ 2h 15m ➔ 13:35", new String[]{"ottapalam", "tirupur", "tiruppur"}, 2, 1, 1100, 3, 1, 800, 80, 10, 220));
        list.add(new Train(17230, "Sabari Express       ", "15:40 ➔ 2h 10m ➔ 17:50", new String[]{"ottapalam", "tirupur", "tiruppur"}, 1, 0, 1300, 0, 0, 950, 45, 15, 260));
        list.add(new Train(16348, "Mangalore Express    ", "23:15 ➔ 2h 20m ➔ 01:35", new String[]{"mangalore", "calicut", "ottapalam", "coimbatore", "tirupur", "tiruppur"}, 0, 0, 1200, 5, 1, 850, 0, 0, 240));
        list.add(new Train(12678, "Ernakulam Superfast  ", "08:10 ➔ 2h 05m ➔ 10:15", new String[]{"bangalore", "salem", "tirupur", "tiruppur", "ottapalam", "ernakulam"}, 5, 2, 1400, 4, 1, 1000, 60, 8, 300));
        list.add(new Train(12626, "Kerala Express       ", "14:20 ➔ 2h 12m ➔ 16:32", new String[]{"delhi", "nagpur", "tirupur", "tiruppur", "ottapalam", "trivandrum"}, 3, 1, 1500, 6, 2, 1100, 70, 12, 320));

        list.add(new Train(12675, "Kovai Express        ", "06:10 ➔ 7h 25m ➔ 13:35", new String[]{"chennai", "kovai", "coimbatore", "tirupur", "tiruppur"}, 3, 1, 1500, 4, 2, 1150, 90, 20, 380));
        list.add(new Train(12673, "Cheran Express       ", "22:10 ➔ 6h 50m ➔ 05:00", new String[]{"chennai", "kovai", "coimbatore", "tirupur", "tiruppur"}, 2, 1, 1650, 5, 1, 1200, 50, 10, 400));
        list.add(new Train(12243, "Kovai Shatabdi Exp   ", "07:15 ➔ 6h 00m ➔ 13:15", new String[]{"chennai", "kovai", "coimbatore", "tirupur", "tiruppur"}, 6, 3, 2200, 8, 4, 1600, 110, 25, 550));
    }

    public ArrayList<Train> search(String s, String d) {
        ArrayList<Train> res = new ArrayList<>();
        String srcInput = s.trim().toLowerCase();
        String destInput = d.trim().toLowerCase();

        for (int i = 0; i < list.size(); i++) {
            Train t = list.get(i);
            if (t.route.contains(srcInput) && t.route.contains(destInput)) {
                boolean duplicate = false;
                for (int k = 0; k < res.size(); k++) {
                    if (res.get(k).tNo == t.tNo) duplicate = true;
                }
                if (!duplicate) res.add(t);
            }
        }

        if (res.isEmpty()) {
            String srcCode = srcInput.length() >= 3 ? srcInput.substring(0, 3).toUpperCase() : srcInput.toUpperCase();
            String destCode = destInput.length() >= 3 ? destInput.substring(0, 3).toUpperCase() : destInput.toUpperCase();

            Train dynamicExpress = new Train(12601, srcCode + " " + destCode + " EXP     ", "05:30 ➔ 6h 45m ➔ 11:45", new String[]{srcInput, destInput}, 4, 1, 1400, 5, 2, 950, 75, 15, 300);
            Train dynamicMail    = new Train(12602, srcCode + " " + destCode + " MAIL    ", "19:15 ➔ 7h 10m ➔ 02:25", new String[]{srcInput, destInput}, 2, 0, 1600, 4, 1, 1100, 40, 10, 350);
            Train dynamicSF      = new Train(22601, srcCode + " " + destCode + " SF EXP  ", "21:40 ➔ 6h 12m ➔ 03:52", new String[]{srcInput, destInput}, 1, 0, 1850, 6, 2, 1300, 25, 5, 420);

            res.add(dynamicExpress);
            res.add(dynamicMail);
            res.add(dynamicSF);
        }
        return res;
    }

    public Train find(int no) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).tNo == no) return list.get(i);
        }
        return null;
    }
}
