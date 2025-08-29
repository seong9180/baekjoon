# 알고리즘 문제풀이 저장소

## 개요
- 목적: 코딩 테스트 및 알고리즘 실력 향상, 풀이 기록 아카이브
- 언어/런타임: Java (JDK 22)
- 빌드 도구: Vanilla javac / IntelliJ Idea
- 스타일: 빠른 입출력(Fast I/O), 가독성 우선, 풀이별 아이디어/복잡도 기록

---

## 폴더 구조 규칙
- 루트 하위에 플랫폼별 디렉터리 생성: `boj/`, `programmers/`, `leetcode/` 등
- 문제 폴더: `{플랫폼}/{문제번호}`
- 자바 파일은 온라인 저지 규칙에 맞게 `Main` 클래스로 제출

---

## 커밋 메시지 규칙
- 형식: `<type>: <플랫폼> <문제번호> <요약> [추가설명/복잡도]`
- type 가이드:
- **feat**: 새 풀이/기능 추가  
  - 예) `feat: BOJ 3040 브루트포스 풀이 추가`
- **refactor**: 동작 동일, 코드 구조/성능 개선  
  - 예) `refactor: BOJ 3040 정렬+투포인터로 개선(v2)`
- **fix**: 오답/버그 수정(결과 교정)  
  - 예) `fix: BOJ 2503 스트라이크/볼 계산 오류 수정`
- **docs**: 주석/README 등 문서 변경  
  - 예) `docs: BOJ 2422 풀이 아이디어와 반례 추가`
- **chore**: 환경/설정/보일러플레이트(코드 동작 미영향)  
  - 예) `chore: .gitignore 업데이트`
- **test**: 테스트 코드/케이스 추가  
  - 예) `test: BOJ 3040 추가 입력 케이스`


---

## Fast I/O 템플릿 (Java)
```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 한 줄에 정수 하나씩일 때
        int n = Integer.parseInt(br.readLine());

        // 공백 구분일 때
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // 출력
        sb.append(a + b).append('\n');
        System.out.print(sb.toString());
    }
}
```



  
