package com.itheima.stream01.test01;
/*
Artist 类:创作音乐的个人或者乐队
属性:name 艺术家名称 :如甲壳虫乐队
members 乐队成员 (如 约翰列侬 ,保罗麦卡特尼等)
origin: 乐队来自哪里(如利物浦)
Albums:专辑
属性: name 专辑名(如左轮手枪)
songs: 专辑中的所有歌曲
musicians: 参与创作本专辑的艺术家列表(如 列侬,本杰明)
1.把所有艺术家的名称收集到String类型的List里
2.过滤出来自利物浦的乐队
3.挑一个乐队,把乐队的其中一个专辑转换成K为name,V为songs的map (Map<String, List<String>>)
*/

import java.util.ArrayList;

public class Test05 {
    public static void main(String[] args) {
    }
}
class Artist{
    private String name;
    private String members;
    private String origin;
    private class Albums{
        String name;
        String songs;
        String musicians;

        @Override
        public String toString() {
            return "Albums{" +
                    "name='" + name + '\'' +
                    ", songs='" + songs + '\'' +
                    ", musicians='" + musicians + '\'' +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSongs() {
            return songs;
        }

        public void setSongs(String songs) {
            this.songs = songs;
        }

        public String getMusicians() {
            return musicians;
        }

        public void setMusicians(String musicians) {
            this.musicians = musicians;
        }

        public Albums(String name, String songs, String musicians) {
            this.name = name;
            this.songs = songs;
            this.musicians = musicians;
        }
    }

    public Artist() {
    }

    public Artist(String name, String members, String origin) {
        this.name = name;
        this.members = members;
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembers() {
        return members;
    }

    public void setMembers(String members) {
        this.members = members;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", members='" + members + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }
}
