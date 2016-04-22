package converter;

public class UnitConverter {
	public double converter (double amount, Unit fromUnit, Unit toUnit) {
		return amount * fromUnit.getValue() / toUnit.getValue();
	}
	public Unit[] getUnits() {
		return Length.values();
	}
}
