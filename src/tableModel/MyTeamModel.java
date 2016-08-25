package tableModel;

import model.Championship;
import model.Model;
import model.MyTableModel;
import model.Team;

public class MyTeamModel extends MyTableModel {

	private Championship champ;

	public MyTeamModel(Model model, Championship champ) {
		super(model);
		setColumnNames(new String []{"Name","Home Jersey", "Transfer Jersey"});
		this.champ = champ;
	}

	@Override
	public int getRowCount() {
		return model.getTeam(champ).size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Team team = ((Team)model.getTeam(champ).toArray()[rowIndex]);
		switch (columnIndex){
		case 0 :
			return team.getName();
		case 1 : 
			return team.getHomeJerseyColour();
		case 2 : 
			return team.getTransferJerseyColour();
		}
		return null;
	}

}