
    // s={1,3,0,5,8,5}
    // e={2,4,6,7,9,9}
    // arr={(1,2),(3,4),(0,6),(5,7),(8,9),(5,9)}

    // for greedy algo steps
    // 1.from given array we have to make pairs for start and end.
      //  2.Sort the array based on end time.
      //  3.After sorting for sure we will take first meeting.
      //  4.Compare end time to the starting time of next pair. If starting time is strictly greater consider the meeting. if starting time is lesser than end time then dont comapre it move onto next meeting.then follow the same . we have to update the end time each and every time we consider a meeting.

    // --> 19,26,37--ascending order
    // --> 37,26,19 --descending order
    // --> 26,37,19--custom sorting (sorting according to unit place in ascending order).

    // ##Greedy Algorithm:(cutsom sorting)
    // 1.if it is sorting we have only two possiblity ascending or descending and when it comes to custom sorting we can sort the value according to our format.
    
    //#comaparator to sort
import java.util.Scanner;
class Meeting{
  {
    int start;
    int end;
    Meeting(int start, int end)
    {
      this.start=start;
      this.end=end;
    }
  }
}
public class MeetingScheduler{
  public static int maxMeetings(List<Meeting> meetings)
  {
    meetings.sort(Comparator.comparingInt(m -> m.end));
    int count=0, lastEndTime= -1;
    for(Meeting meeting: meetings)
    {
      if(meeting.start > lastEndTime)
      {
        count++;
        lastEndTime=meeting.end;
      }
    }
    return count;
  }
}