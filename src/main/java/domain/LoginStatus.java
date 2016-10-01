package domain;

public enum LoginStatus {
	SUCCESS(1),
	INVALID_CREDENTIALS(2),
	NAME_ALREADY_EXISTS(3),
	NAME_DOESNT_EXIST(4);
	
    private final int value;
    
    private LoginStatus(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
}
