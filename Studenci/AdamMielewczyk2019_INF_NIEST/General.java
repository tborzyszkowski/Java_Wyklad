import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class General implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int gold;
    private List<Soldier> soldiers;
    private StringBuilder actions=new StringBuilder();

    public General(String name, int gold, List<Soldier> soldiers) {
        this.name = name;
        this.gold = gold;
        this.soldiers = soldiers;
    }

    public void buySoldier(Soldier.MilitaryDegree degree) throws IllegalArgumentException {
        if(gold<degree.getValue()*10)
            throw new IllegalArgumentException("za mało pieniędzy");
        gold-=degree.getValue()*10;
        actions.append("\nZakup żołnierza ");
        actions.append(degree);
        soldiers.add(new Soldier(degree));
    }

    public void training(List<Soldier> soldiersToTrain) throws IllegalArgumentException {
        int cost=0;
        for(Soldier soldierToTrain:soldiersToTrain){
            if(!soldiers.contains(soldierToTrain))
                throw new IllegalArgumentException("żołnierz nie należy do tego generała");
            cost+=soldierToTrain.getDegree().getValue();
        }
        if(gold<cost)
            throw new IllegalArgumentException("za mało pieniędzy");
        else
            gold-=cost;
        actions.append("\nSzkolenie żołnierzy ");
        actions.append(soldiersToTrain.size());
        for(Soldier soldierToTrain:soldiersToTrain){
            soldierToTrain.train();
        }
    }

    public void goToWar(General attackedGeneral) {
        actions.append("\nWojna z generałem ");
        actions.append(attackedGeneral.getName());
        attackedGeneral.actions.append("\nWojna z generałem ");
        attackedGeneral.actions.append(attackedGeneral.getName());
        if(this.getStrength()<attackedGeneral.getStrength())
            this.afterWar(attackedGeneral);
        else if(this.getStrength()>attackedGeneral.getStrength())
            attackedGeneral.afterWar(this);
        else{
            int randomSoldierFromThisArmy = (int)(Math.random() * this.soldiers.size());
            this.soldiers.get(randomSoldierFromThisArmy).kill();
            int randomSoldierFromAttackedArmy = (int)(Math.random() * attackedGeneral.soldiers.size());
            attackedGeneral.soldiers.get(randomSoldierFromThisArmy).kill();
        }
    }

    private void afterWar(General winnerGeneral){
        for(Soldier soldier:this.soldiers){
            soldier.demotion();
        }
        for(Soldier soldier:winnerGeneral.soldiers){
            soldier.train();
        }
        int reparation = (int)(0.1*this.gold);
        this.gold-=reparation;
        winnerGeneral.gold+=reparation;
    }

    @Override
    public Object clone() {
        List<Soldier> copyOfSoldiers=new ArrayList<>();
        for(Soldier actualSoldier: soldiers)
            copyOfSoldiers.add((Soldier)actualSoldier.clone());
        General general = new General(this.getName(), this.getGold(), copyOfSoldiers);
        return general;
    }

    @Override
    public boolean equals(Object obj) {
        if(this.toString().equals(((General)obj).toString()))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        StringBuilder strBuild=new StringBuilder();
        strBuild.append("Name: "+name+"\nGold: "+gold+"\nPower: "+getStrength()+"\nSoldiers:\n\n");
        for(int i=0;i<soldiers.size();i++){
            strBuild.append("Soldier number ");
            strBuild.append(i);
            strBuild.append(" - ");
            if(soldiers.get(i).getExperience()!=0)
                strBuild.append(soldiers.get(i).toString());
            else
                strBuild.append("DEAD");
            strBuild.append("\n");
        }
        return strBuild.toString();
    }

    public String getAction() {
        return actions.toString();
    }

    public int getStrength() {
        int strength=0;
        for(Soldier soldier: soldiers){
            strength+=soldier.getStrength();
        }
        return strength;
    }

    public String getName() {
        return name;
    }

    public int getGold() {
        return gold;
    }

    public List<Soldier> getSoldiers() {
        return soldiers;
    }

    public List<Soldier> getLivingSoldiers() {
        List<Soldier> livingSoldiers=new ArrayList<>();
        for(Soldier soldier: soldiers){
            if(soldier.getExperience()>0)
                livingSoldiers.add(soldier);
        }
        return livingSoldiers;
    }
}
