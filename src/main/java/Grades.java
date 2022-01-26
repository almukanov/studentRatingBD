public enum Grades {
    GRADE_9D_PRESS_1("C:\\java\\classReport\\src\\9d.txt"),
    GRADE_9E_PRESS_2("C:\\java\\classReport\\src\\9e.txt"),
    GRADE_9F_PRESS_3("C:\\java\\classReport\\src\\9f.txt"),
    GRADE_9G_PRESS_4("C:\\java\\classReport\\src\\9g.txt"),
    GRADE_11A_PRESS_5("C:\\java\\classReport\\src\\11a.txt"),
    GRADE_11B_PRESS_6("C:\\java\\classReport\\src\\11b.txt"),
    GRADE_11C_PRESS_7("C:\\java\\classReport\\src\\11c.txt"),
    GRADE_11D_PRESS_8("C:\\java\\classReport\\src\\11d.txt"),
    GRADE_12_PRESS_9("C:\\java\\classReport\\src\\12.txt");

    public String getGrade() {
        return grade;
    }

    private String grade;
    Grades(String grade) {
        this.grade = grade;
    }

}
