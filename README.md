# End-Project
졸업프로젝트
안드로이드 스튜디오와 mysql연동 test 앱

mysql의 'milk' database내의 'carton' table의 id(브랜드명)과 product_name(상품명)을
select.php 에서 받아
AndroidStudio로 전달하는 방식으로 진행됨

"https://1d1cblog.tistory.com/129" 참고

현재 test_mysql은
브랜드명(id) 입력시 그에 해당하는 데이터베이스(milk) 내의 상품명(product_name) 전체를 화면에 출력함


test detection을 통해 얻어진 json파일에서
브랜드명을 우선 찾고(milk database내에 brand 테이블 이용)
그 후 carton 테이블에서 해당 id에 존재하는 product_name들과 비교하여
정확도가 가장 높은 제품명을 tts로 전달하면 될듯
