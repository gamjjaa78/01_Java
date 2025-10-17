package deu.kh.network.server.model.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ServerService {
	//TCP Socket 프로그래밍
	//TCP는 신뢰성있는 연결보장
	//소켓은 이 연결의 끝점 역할, 데이터 송수신 통로됨
	//TCP 통신=소켓 간 연결+데이터 주고받기
	
	/*   TCP
	 * - 서버, 클라이언트간 1:1 소켓통신 (연결 지향적 프로토콜)
	 * - 서버가 먼저 실행되어 있는 상태에서
	 *   클라이언트가 연결해야 함.
	 *  
	 * - 데이터 전송 순서가 보장되고,
	 *   수신 여부를 판단하여 오류 발생 시 재전송함.
	 *  
	 * * java.net 패키지에서 제공하는
	 *   Socket, ServerSocket 클래스를 사용해야함.
	 *  
	 *   Socket
	 * - 프로세스의 양 끝단(프로세스간의 통신을 담당)
	 * - Input/OutputStream 보유하고 있음.
	 *
	 *   ServerSocket
	 * - 포트와 연결되어 외부 요청을 기다리는 객체
	 * - 클라이언트의 연결 요청이 들어오면
	 *   클라이언트의 소켓을 얻어와 연결하게 된다.
	 *
	 * - 하나의 포트에는 하나의 ServerSocket만 연결 가능
	 */

	public void serverStart() {
		//1.서버의 포트번호 정함
		int port=8500;
		//포트는 0~65535 사이 지정가능
		//1023번 이하는 사용중인 경우가 많아 피하는게 좋은
		
		//소켓용 참조변수 선언
		ServerSocket serverSocket=null;
		Socket clientSocket=null; //클라 요청이 올때 클라 소켓도 같이옴
		
		//입/출력용 참조변수 선언
		InputStream is=null;
		OutputStream os=null;
		
		//보조스트림 참조변수 선언
		BufferedReader br=null;
		
		PrintWriter pw=null;
		//PrintWriter : 문자기반 보조스트림 / writer,read=문자기반 / in,output 바이트기반
		//파일,콘솔,네트워크 소켓 등 다양한 출력 스트림에서 데이터 쉽게 출력가능
		
		try {
		//2.서버용 포켓객체생성
		serverSocket=new ServerSocket(8500); //포트번호 아는 클라소켓만 접속가능
		
		//3.클라쪽에서 접속요청오길 기다림
		//4.접속요청오면 수락 후 해당 클라에 대한 소켓객체생성
		System.out.println("[Server]");
		System.out.println("클라 요청 대기 중,,,");
		
		clientSocket=serverSocket.accept();
		//클라요청이 오고, 수락될때까지 무한대기
		//->수락시 클라의 socket 전달받음
		
		System.out.println("[클라 접속 성공]");
		
		//5.연결된 클라와 입출력스트림 생성
		//->클라가 서버로 요청시 소켓전달
		//->소켓에 입/출력 스트림 담겨있음
		is=clientSocket.getInputStream();
		os=clientSocket.getOutputStream();
		
		//6.보조스트림통해 성능개선
		br=new BufferedReader(new InputStreamReader(is)); //is:바이트기반의 최상위부모
		//문자기반 BufferedReader와 바이트기반 InputStream을 연결할 수 있도록
		//InputStreamReader를 함꼐 사용
		
		pw=new PrintWriter(os);
		
		//7.스트림통해 읽고쓰기
		//서버->클라 메세지 전송
		
		//2025년10월16일 10:39:30 [서버 접속 성공]
		Date now=new Date(); //java.util.Date:자바에서 시간을 나타내는 객체
		//new Date() 객체 생성시 현재 시간 저장
		
		//SimpleDateFormat : 날짜 형식을 간단히 지정하는 객체
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
		
		String str=sdf.format(now)+"[서버 접속 성공]";
		
		
		//PrintWriter.println(문자열):주어진 데이터를 문자형태로 출력, 출력 후 줄바꿈 추가
		pw.println(str); //서버->클라로 데이터를 출력(전송)
		pw.flush(); //스트림 내용 밀어냄
		
		
		//----------------------------------------
		
		//클라->서버 메세지 전달받기(읽기:입력)
		
		String clinetMassage=br.readLine();
		
		//서버 콘솔창에 클라가 보낸 메세지와 IP 출력
		
		String clientIP=clientSocket.getInetAddress().getHostAddress();
		//getInetAddress():클라에 대한 IP 주소정보를 포함한 InetAddress() 객체 반환
		//getHostAddress():InetAddress() 객체에서 IP 주소를 문자열 형식으로 반환
		
		
		System.out.println(clientIP+" 가 보낸 메세지:"+clinetMassage);
		
		
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//8.통신종료
			try { //스트림, 소켓 닫기
				if(br!=null) br.close(); //+is.close();
				if(pw!=null) br.close(); //+os.close();
				
				if(serverSocket != null) serverSocket.close();
	            if(clientSocket != null) clientSocket.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
