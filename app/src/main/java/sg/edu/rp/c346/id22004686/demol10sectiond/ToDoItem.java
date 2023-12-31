package sg.edu.rp.c346.id22004686.demol10sectiond;

import java.util.Calendar;

public class ToDoItem {

        private String title;
        private Calendar date;

        public ToDoItem(String title, Calendar date) {
            this.title = title;
            this.date = date;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Calendar getDate() {
            return date;
        }

        public void setDate(Calendar date) {
            this.date = date;
        }

        public String toString() {
            String str = date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)
                    +"/"+date.get(Calendar.YEAR) + " (" + getDay(date.get(Calendar.DAY_OF_WEEK)) + ")";

            return str;
        }

        private String getDay(int day) {
            String dayOfWeek;

            switch (day) {
                case Calendar.SUNDAY:
                    dayOfWeek = "Sunday";
                    break;
                case Calendar.MONDAY:
                    dayOfWeek = "Monday";
                    break;
                case Calendar.TUESDAY:
                    dayOfWeek = "Tuesday";
                    break;
                case Calendar.WEDNESDAY:
                    dayOfWeek = "Wednesday";
                    break;
                case Calendar.THURSDAY:
                    dayOfWeek = "Thursday";
                    break;
                case Calendar.FRIDAY:
                    dayOfWeek = "Friday";
                    break;
                case Calendar.SATURDAY:
                    dayOfWeek = "Saturday";
                    break;
                default:
                    dayOfWeek = "Unknown";
                    break;
            }

            return dayOfWeek;
        }
    }

