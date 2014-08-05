package anotherprojectwhousecommand;

import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.provus.atm.command.StringParser;
import org.provus.atm.command.command.Command;
import org.provus.atm.command.command.CommandFactory;
import org.provus.atm.command.command.ENC;
import org.provus.atm.command.command.Model;
import org.provus.atm.command.command.USER;

public class Test {
	
	public static void createCommand() throws IOException{
		Model model = CommandFactory.eINSTANCE.createModel();
		
		USER user = CommandFactory.eINSTANCE.createUSER();
		user.setUser("serhat");
		
		ENC enc = CommandFactory.eINSTANCE.createENC();
		enc.setPass("pass");
		
		model.getCommands().add(user);
		model.getCommands().add(enc);
		
		System.out.println(model.toString());		
	}
	
	public static void readString(String content){
		Model parser = StringParser.parser(content);
		
		EList<Command> commands = parser.getCommands();
		for (Command command : commands) {
			if(command instanceof ENC){
				System.out.println(((ENC) command).getPass());
			}
			else if(command instanceof USER){
				System.out.println(((USER) command).getUser());
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		readString("user = \"serhat\" ENC{\"pass\"}");
		
		createCommand();
	}
}
