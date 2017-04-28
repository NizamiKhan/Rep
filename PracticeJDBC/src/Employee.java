public class Employee {
    private int empno;
    private String ename;
    private String job;
    private int mgr;
    private String hiredate;
    private double sal;
    private double comm;
    private int deptno;
    private String dname;
    private String loc;
    private int hiredateDay;
    private int hiredateMonth;
    private int hiredateYear;

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getMgr() {
        return mgr;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public int getHiredateDay() {
        return hiredateDay;
    }

    public void setHiredateDay(int hiredateDay) {
        this.hiredateDay = hiredateDay;
    }

    public int getHiredateMonth() {
        return hiredateMonth;
    }

    public void setHiredateMonth(int hiredateMonth) {
        this.hiredateMonth = hiredateMonth;
    }

    public int getHiredateYear() {
        return hiredateYear;
    }

    public void setHiredateYear(int hiredateYear) {
        this.hiredateYear = hiredateYear;
    }

    @Override
    public String toString() {
        return "\nИдентификатор работника: " + empno +
                "\nИмя: " + ename +
                "\nДолжность: " + job +
                "\nМенеджер: " + mgr +
                "\nДата приема на работу: " + hiredate +
                "\nЗарплата: " + sal +
                "\nComm: " + comm +
                "\nНомер отдела: " + deptno +
                "\nНазвание отдела: " + dname +
                "\nРасположение: " + loc;
    }
}
