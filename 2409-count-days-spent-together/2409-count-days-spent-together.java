class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice,
                                 String arriveBob, String leaveBob) {

        int AliceArrMonth = Integer.parseInt(arriveAlice.substring(0, 2));
        int AliceLevMonth = Integer.parseInt(leaveAlice.substring(0, 2));
        int BobArrMonth = Integer.parseInt(arriveBob.substring(0, 2));
        int BobLevMonth = Integer.parseInt(leaveBob.substring(0, 2));

        int AliceArrDate = Integer.parseInt(arriveAlice.substring(3, 5));
        int AliceLevDate = Integer.parseInt(leaveAlice.substring(3, 5));
        int BobArrDate = Integer.parseInt(arriveBob.substring(3, 5));
        int BobLevDate = Integer.parseInt(leaveBob.substring(3, 5));

        if (AliceLevMonth < BobArrMonth || BobLevMonth < AliceArrMonth) {
            return 0;
        }

        int startMonth, startDate, endMonth, endDate;

        if (AliceArrMonth > BobArrMonth ||
            (AliceArrMonth == BobArrMonth && AliceArrDate > BobArrDate)) {
            startMonth = AliceArrMonth;
            startDate = AliceArrDate;
        } else {
            startMonth = BobArrMonth;
            startDate = BobArrDate;
        }

        if (AliceLevMonth < BobLevMonth ||
            (AliceLevMonth == BobLevMonth && AliceLevDate < BobLevDate)) {
            endMonth = AliceLevMonth;
            endDate = AliceLevDate;
        } else {
            endMonth = BobLevMonth;
            endDate = BobLevDate;
        }

        if (startMonth == endMonth) {
            return Math.max(0, endDate - startDate + 1);
        }

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int count = days[startMonth - 1] - startDate + 1;
        for (int i = startMonth + 1; i < endMonth; i++) {
            count += days[i - 1];
        }
        count += endDate;

        return count;
    }
}