package data;

import java.util.ArrayList;

import static data.List.ListType.*;

/**
 * Created by diogo on 13/05/2016.
 */
public class List {
    public ArrayList<ArrayList<IconText>> list = new ArrayList<>();
    private ListType type;

    public List() {
    }

    public ListType getType() {
        if (type == null) {
            analyzeType();
        }
        return type;
    }

    public void addHeader(String s) {
        IconText t = new IconText();
        t.setText(s);
        ArrayList<IconText> line = new ArrayList<>();
        line.add(t);
        this.list.add(line);
    }

    public void newListLine() {
        this.list.add(new ArrayList<IconText>());
    }

    public void addListCell(String s, String s1) {
        IconText i = new IconText();

        if (s != null)
            i.setText(Utils.analyseAny(s, Cv.getVariables()));
        if (s1 != null) {
            i.icon.setIconName(s1.substring(1, s1.length() - 1));
            i.icon.divide();
        }
        this.list.get(this.list.size() - 1).add(i);
    }

    private void analyzeType() {
        for (ArrayList<IconText> elem : list) {
            if (elem.size() != 1) {
                if (hasPlace(elem) && hasPos(elem) && hasDescription(elem)) {
                    this.type = HONOR;
                    return;
                } else if (elem.get(0).text.length() < 20) {
                    this.type = SIMPLE;
                } else {
                    this.type = QUALIFICATIONS;
                    return;
                }
            }
        }
    }

    public boolean hasPlace(ArrayList<IconText> list) {
        for (IconText it : list) {
            if (it.icon.name.equals("place")) {
                return true;
            }
        }
        return false;
    }

    public boolean hasDate(ArrayList<IconText> list) {
        for (IconText it : list) {
            if (it.icon.name.equals("date")) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPos(ArrayList<IconText> list) {
        for (IconText it : list) {
            if (it.icon.name.equals("pos")) {
                return true;
            }
        }
        return false;
    }


    public boolean hasDescription(ArrayList<IconText> list) {
        for (IconText it : list) {
            if (it.icon.name.equals("description")) {
                return true;
            }
        }
        return false;
    }


    public IconText getDate(ArrayList<IconText> list) {
        for (IconText it : list) {
            if (it.icon.name.equals("date")) {
                return it;
            }
        }
        return null;
    }

    public IconText getPlace(ArrayList<IconText> list) {
        for (IconText it : list) {
            if (it.icon.name.equals("place")) {
                return it;
            }
        }
        return null;
    }

    public IconText getPos(ArrayList<IconText> list) {
        for (IconText it : list) {
            if (it.icon.name.equals("pos")) {
                return it;
            }
        }
        return null;
    }

    public IconText getDescription(ArrayList<IconText> list) {
        for (IconText it : list) {
            if (it.icon.name.equals("description")) {
                return it;
            }
        }
        return null;
    }


    public IconText getFirstElem(ArrayList<IconText> list) {
        for (int i = 0; i < list.size(); i++) {
            IconText it = list.get(i);
            if (!it.icon.name.equals("date") && !it.icon.name.equals("place") && i != 0) {
                return it;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "List{" +
                "list=" + list +
                ", type=" + type +
                '}';
    }


    public enum ListType {
        SIMPLE, QUALIFICATIONS, HONOR
    }
}
