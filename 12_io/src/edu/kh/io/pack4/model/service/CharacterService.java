package edu.kh.io.pack4.model.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CharacterService {
	// 문자기반 스트림
	// 2byte 문자단위로 입출력하는 스트림
	// Reader(입력) / Writer(출력) 최상위 클래스
	// 문자만 작성된 파일, 채팅, 인터넷 요청시 데이터 전달시 사용

	// 문자기반 파일입력(파일읽어오기)
	// 보조스트림 Buffedred 사용
	public void fileInput() {
		// 스트림 참조변수 선언
		FileReader fr = null; // 문자기반 파일입력용 스트림
		BufferedReader br = null; // 문자기반 보조스트림

		try {
			fr = new FileReader("/io_test/20251014/노래가사.txt"); // 문자기반 스트림생성
			br = new BufferedReader(fr); // 보조스트림 생성

			String line = null; // 한 줄 읽어와 저장할 변수

			while (true) {
				// String BufferedReader.readLine()한줄씩 문자열 읽는 역할 (줄단위)
				// 개행문자 나올때까지 문자열 읽음
				line = br.readLine();

				if (line == null)
					break; // 더이상 읽을 내용없음 반복종료

				System.out.println(line);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	// 문자기반 파일출력(파일쓰기)
	// 보조스트림 Buffered 사용
	public void fileOutput() {
		// 스트림 참조변수 선언
		FileWriter fw = null; // 문자기반 파일출력용 스트림
		BufferedWriter bw = null; // 문자출력 보조스트림

		try {
			StringBuilder sb = new StringBuilder();
			sb.append("아직도 수요일이라니\n");
			sb.append("를 긍정의 힘으로!\n");
			sb.append("라고 쓸 수 없어,,,\n");

			// /io_test/20251014/출력테스트.txt 파일로 내보내기
			fw = new FileWriter("/io_test/20251014/출력테스트.txt");
			bw = new BufferedWriter(fw);

			bw.write(sb.toString()); // sb에 저장된 내용을 연결된 파일에 출력(쓰기)
			bw.flush();

			System.out.println("출력완료");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (bw != null)
					bw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}