package com.redis.data;

public class metricValues {
	private int occurrences;
    private int current;
    private int min;
    private int max;
    private String startTimeInMillis;
    private boolean useRange;
    private int count;
    private int sum;
    private int value;
    private int standardDeviation;
    private jsonlet xform;
    
	public int getOccurrences() {
		return occurrences;
	}
	public void setOccurrences(int occurrences) {
		this.occurrences = occurrences;
	}
	public int getCurrent() {
		return current;
	}
	public void setCurrent(int current) {
		this.current = current;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public String getStartTimeInMillis() {
		return startTimeInMillis;
	}
	public void setStartTimeInMillis(String startTimeInMillis) {
		this.startTimeInMillis = startTimeInMillis;
	}
	public boolean isUseRange() {
		return useRange;
	}
	public void setUseRange(boolean useRange) {
		this.useRange = useRange;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getStandardDeviation() {
		return standardDeviation;
	}
	public void setStandardDeviation(int standardDeviation) {
		this.standardDeviation = standardDeviation;
	}
	public jsonlet getXform() {
		return xform;
	}
	public void setXform() {
		this.xform = new jsonlet();
		//this.xform.setCount(count);
		this.xform.setCurrent(current);
		this.xform.setUtc(startTimeInMillis);
	}
}