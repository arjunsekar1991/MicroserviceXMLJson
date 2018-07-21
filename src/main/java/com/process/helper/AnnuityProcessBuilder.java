package com.process.helper;

public class AnnuityProcessBuilder extends ProcessBuilderService {

	private String financialRepresentativeName;
	private String financialRepresentativeId;

	public String getFinancialRepresentativeId() {
		return financialRepresentativeId;
	}

	public void setFinancialRepresentativeId(String financialRepresentativeId) {
		this.financialRepresentativeId = financialRepresentativeId;
	}

	public String getFinancialRepresentativeName() {
		return financialRepresentativeName;
	}

	public AnnuityProcessBuilder(String financialRepresentativeName) {
		this.financialRepresentativeName = financialRepresentativeName;
	}
}
