# naljava

날잡아

## 개요

상호 유기적 일정 관리 서비스

기존 통보/투표식이 아닌

소거식 일정 관리 지원

## 기능

웹앱 서비스

카카오톡으로 간편로그인
친구목록 조회

- 일정 유형
    - [같만일, 초일]
    - 호스트가 설정 가능
    - 권한부여

- 같이 만들어가능 일정 [여행 , 술약속 등]
    - 일정 생성
        - 로그인 되어있으면 본인의 연락처는 입력x
        - 본인한테도 간편 링크 발송 여부 설정 가능
        - 초대할 인원 전화번호 등록
    - 인원 초대 -> 초대 링크 카톡 발송
    - 각자 가능한 날짜 표시
    - 희망 장소 각자 투표
    - 실시간 단계별 현황 확인
    - 단계별 미참여 인원 재촉 메시지 발송

- 초대하는 일정 [집들이, 생일 등]
    - 호스트가 일정 세부 설정후 초대장 발송
    - 초대장 꾸미기
    - 초대받는 사람은 참석/불참석 여부 등록
    - 불참석시 사유 작성
    - 호스트는 실시간 참여 인원 확인가능
    - 답변 재촉 메시지 발송 가능

- 일정 생성
    - 로그인 되어있으면 본인의 연락처는 입력x
    - 본인한테도 간편 링크 발송 여부 설정 가능
    - 초대할 인원 전화번호 등록
    - 권한부여 여부 설정
    - 전화번호별 코드 설정

- 사용자 인식
    - 전화번호
        - 호스트가 전화번호목록에서 추가
        - 전화번호를 등록후 전용 코드 발급
        - 링크별로 사용자 코드 고정
    - 카카오 친구
        - 접속시 전화번호 입력하면
    - 자신이 기록을 남기고싶으면 추가정보 입력 가능
        - 전화번호, 카카오 로그인

## Infrastructure

- Spring Boot
- MySQL
- Jdk 11
- Spring Data JPA, QueryDSL

### 환경 설정

##### 로컬 환경

- DATABASE
    - RDBMS: mysql
        - module-api.src.main.resources.application-local.yml 참고
        - ```
          CREATE DATABASE naljava DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
          CREATE USER 'naljava'@'%' IDENTIFIED BY 'naljava220801!';
          GRANT ALL PRIVILEGES ON naljava.* TO 'naljava'@'%';
          FLUSH PRIVILEGES;
          ```

##### 운영 환경

- DOMAIN: `naljava.rn00n.com`
- Application 배포: `AWS Elastic Beanstalk`
- DATABASE: `AWS RDS`
- STORAGE: `AWS S3`

#### 실행/디버그 구성

- vm 옵션
    - `-Djava.net.preferIPv4Stack=true`: ip v4 사용 설정
    - `-DSpring.profiles.active=local` or IDE 구성 환경 활성 프로파일 설정
