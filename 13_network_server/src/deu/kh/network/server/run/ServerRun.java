package deu.kh.network.server.run;

import deu.kh.network.server.model.service.ServerService;

public class ServerRun {

	public static void main(String[] args) {
		new ServerService().serverStart();
	}
}
