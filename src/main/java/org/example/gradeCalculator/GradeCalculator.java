package org.example.gradeCalculator;

import java.util.List;

public class GradeCalculator {

    private final Courses courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    public GradeCalculator(Courses courses) {
        this.courses = courses;
    }

    /**
     * 요구사항
     * 평균학점 계산 방법 = (학점수 * 교과목 평점) 의 합계 / 수강신청 총 학점 수
     * 일급 컬렉션 사용
     */
    /**
     * 핵심 포인트
     *
     */
    // 이수한 과목을 전달하여 평균학점 계산 요청 -----> 학점 계산기 ---> (학점수 * 교과목 평점)의 합계 ---> 과목(코스) 일급 컬렉션
    //                                                 ---> 수강신청 총 학점 수         ---> 과목(코스) 일급 컬렉션
    public double calculateGrade() {

        // (학점수 * 교과목 평점)의 합계
        double multipliedCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();
        int totalCompletedCredit = courses.calculateTotalCompletedCredit();

        // 수강신청 총 학점 수

        return multipliedCreditAndCourseGrade / totalCompletedCredit;

    }
}
