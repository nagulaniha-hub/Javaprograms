import java.util.*;
public class MeetingScheduleConflictMerger {
    static class TimeSlot {
        int start;
        int end;
        TimeSlot(int start, int end) {
            this.start = start;
            this.end = end;
        }
        @Override
        public String toString() {
            return "[" + start + ":00 - " + end + ":00]";
        }
    }
    public static List<TimeSlot> mergeOverlappingSlots(List<TimeSlot> bookings) {
        bookings.sort((a, b) -> a.start - b.start);
        List<TimeSlot> merged = new ArrayList<>();
        for (TimeSlot slot : bookings) {
            if (merged.isEmpty() || merged.get(merged.size() - 1).end < slot.start) {
                merged.add(slot);
            } else {
                TimeSlot last = merged.get(merged.size() - 1);
                last.end = Math.max(last.end, slot.end);
            }
        }
        return merged;
    }
    public static void main(String[] args) {
        List<TimeSlot> bookings = new ArrayList<>(Arrays.asList(
                new TimeSlot(9, 10),
                new TimeSlot(9, 12),
                new TimeSlot(13, 14),
                new TimeSlot(14, 15),
                new TimeSlot(16, 17)
        ));
        List<TimeSlot> mergedSchedule = mergeOverlappingSlots(bookings);
        System.out.println("Merged conference room schedule:");
        for (TimeSlot slot : mergedSchedule) {
            System.out.println(" - " + slot);
        }
    }
}
