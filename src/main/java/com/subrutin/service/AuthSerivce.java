package com.subrutin.service;

public interface AuthSerivce {

	public Boolean login(String email) throws Exception;

	public Boolean confirmOTP(String sessionId, String otp);
}
