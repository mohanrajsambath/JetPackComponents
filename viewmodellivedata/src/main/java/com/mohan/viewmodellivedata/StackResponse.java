package com.mohan.viewmodellivedata;

import java.util.List;

public class StackResponse {
    public List<Item> items;
    public boolean has_more;
    public int quota_max;
    public int quota_remaining;

    public class Item{
        public Owner owner;
        public boolean is_accepted;
        public int score;
        public int last_activity_date;
        public int creation_date;
        public int answer_id;
        public int question_id;
        public String content_license;
        public int last_edit_date;
    }
    public class Owner{
        public int reputation;
        public int user_id;
        public String user_type;
        public String profile_image;
        public String display_name;
        public String link;
    }
}
