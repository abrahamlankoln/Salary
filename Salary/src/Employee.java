
public class Employee {

	String name;
	int salary;
	int workHours;
	int hireYear;
	public Employee(String name, int salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public double tax() {
		if (this.salary < 1000) {
			return salary;
		} else {
			return salary * 0.03;
		}

	}

	int bonus() {
		if (this.workHours > 40) {
			return (workHours - 40) * 30;
		}
		return 0;
	}

	double raiseSalary() {
		int yılFark = 2021 - this.hireYear;
		if (yılFark < 10) {
			return salary * 0.05 + salary;
		} else if (9 < yılFark && yılFark < 20) {
			return salary * 0.1 + salary;
		} else {
			return salary * 0.15 + salary;
		}

	}

	public String toString() {
		double bonustax=bonus()-tax();
		double rSalary=raiseSalary()+salary;
		System.out.println("adi : " + name);
		System.out.println("maasi : " + salary);
		System.out.println("calisma Saati : " + workHours);
		System.out.println("baslangic Yili : " + hireYear);
		System.out.println("vergi : " + tax());
		System.out.println("bonus : " + bonus());
		System.out.println("maas artisi : " + raiseSalary());
		System.out.println("vergi ve bonuslar ile maas: "+ bonustax);
		System.out.println("toplam maas: "+rSalary);
		return null;
	}
}
