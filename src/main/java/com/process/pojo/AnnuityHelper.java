package com.process.pojo;

import java.util.Optional;
import java.util.Set;

public class AnnuityHelper {
public Optional<String> mydata;
public Optional<String> mydata2;
public Optional<Set<String>> multiple;

public Optional<Set<String>> getMultiple() {
	return multiple;
}

public void setMultiple(Optional<Set<String>> multiple) {
	this.multiple = multiple;
}

public Optional<String> getMydata2() {
	return mydata2;
}

public void setMydata2(Optional<String> mydata2) {
	this.mydata2 = mydata2;
}

public Optional<String> getMydata() {
	return mydata;
}

public void setMydata(Optional<String> mydata) {
	this.mydata = mydata;
}

}
