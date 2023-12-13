package accounting;

public class Employee {

    String name ;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name,int salary,int workHours, int hireYear){

        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }

    public double tax(){
        if (this.salary<1000){
            return 0;
        }else {
           return this.salary*3/100;
        }
    }

    public int bonus(){
        if (this.workHours>40){
            return (this.workHours-40)*30;
        }else return 0;
    }

    public int raiseSalary(){
        if (this.hireYear<10){
            return this.salary += this.salary*5/100;
        } else if (9<this.hireYear&&this.hireYear<20) {
            return  this.salary+=this.salary/10;
        } else if (this.hireYear>19) {
            return this.salary+=this.salary*15/100;
        }
        return 0;
    }

    public String toString(){
        System.out.println("*-*-*-*-*-*-*-*-*-*-**-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("Adı : "+ this.name+"\n"+"Maaşı: "+this.salary + "\n" + "Çalışma Saati " + "\n"+ "Firmadaki Çalışma Yılı "+this.hireYear+"\n"+"Vergi : "+tax() + "\n" + "Bonus : " + bonus() +"\n"+ "Maaş Artışı : " +raiseSalary() +"\n" + "Vergi ve Bonuslar ile Birlikte maaş: " + (this.salary+bonus()-tax())+"\n"+"Toplam maaş : " + (this.salary+raiseSalary()+bonus()-tax()));
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        return null;
    }


}
