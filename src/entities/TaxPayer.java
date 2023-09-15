package entities;

public class TaxPayer {
	
	private double salaryIncome;
	private double servicesIncome;
	private double capitalIncome;
	private double healthSpending;
	private double educationSpending;
	
	public TaxPayer() {
		
	}
	public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending,
			double educationSpending) {
		
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public double getServiceIncome() {
		return servicesIncome;
	}

	public void setServiceIncome(double serviceIncome) {
		this.servicesIncome = serviceIncome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(double educationSpending) {
		this.educationSpending = educationSpending;
	}
	
	public double salaryTax() {
		double monthtlyIncome = salaryIncome / 12.0;
		if(salaryIncome < 3000.0) {
			double salaryTax = 0.0;
		}
		else if(salaryIncome < 5000.0) {
			double salaryTax = salaryIncome * 0.1;
			
			}
		
		else {
			 double salaryTax = salaryIncome * 0.2;
		}
		     return salaryTax();
		
		
	}	
	public double servicesTax() {
		return  servicesIncome * 0.15;
	}
	
	public double capitalTax() {
		return capitalIncome * 0.2;
	}

	public double grossTax() {
		return salaryTax() + servicesTax() + capitalTax();
	}
	public double taxRebate() {
	 double maximumDeductible = grossTax() * 0.3;

	double deductibleExpenses = 0;
	if(deductibleExpenses > maximumDeductible) {
		return maximumDeductible;
	}
	else 
		return deductibleExpenses;
	}
	public double netTax() {
		return grossTax() - taxRebate();
			
	}
	
	
	
}


	

