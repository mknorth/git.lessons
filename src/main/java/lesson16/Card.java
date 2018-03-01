package lesson16;

public class Card {
    @Override
    public String toString() {
        return "Card{" + "id='" + id + '\'' + ", desc='" + desc + '\'' + ", idBoard='" + idBoard + '\'' + ", idList='" + idList + '\'' + ", name='" + name + '\'' + ", url='" + url + '\'' + '}';
    }

    public String id;
        public String desc;
        public String idBoard;
        public String idList;
        public String name;
        public String url;

}
