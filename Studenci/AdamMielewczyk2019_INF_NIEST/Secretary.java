import java.util.ArrayList;
import java.util.List;

public class Secretary {
    List<General> savedGenerals;
    List<General> livingGenerals;

    Secretary(List<General> generals) {
        this.livingGenerals = generals;
        savedGenerals=new ArrayList<>();
        for(General general: livingGenerals) {
            savedGenerals.add((General) general.clone());
        }
    }

    String getChanges() {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<savedGenerals.size();i++) {
            str.append("------------------------------------------------------\nZMIANY U GENERALA:   ");
            str.append(savedGenerals.get(i).getName());
            str.append("\n");
            String[] savedGeneralState=savedGenerals.get(i).toString().split("\n");
            String[] livingGeneralState=livingGenerals.get(i).toString().split("\n");
            for(int j=0; j<livingGeneralState.length; j++) {
                if(j>=savedGeneralState.length) {
                    str.append("AFTER:  ");
                    str.append(livingGeneralState[j]);
                    str.append("\n");
                }
                else
                {
                    if(!savedGeneralState[j].equals(livingGeneralState[j])) {
                        str.append("BEFORE:  ");
                        str.append(savedGeneralState[j]);
                        str.append("\n");
                        str.append("AFTER:  ");
                        str.append(livingGeneralState[j]);
                        str.append("\n");
                    }
                }
            }
            str.append("\n\nPODJĘTE DZIALANIA OD POCZĄTKU:\n");
            str.append(livingGenerals.get(i).getAction());
            str.append("\n------------------------------------------------------\n\n");
        }
        savedGenerals=new ArrayList<>();
        for(General general: livingGenerals) {
            savedGenerals.add((General) general.clone());
        }
        return str.toString();
    }
}
