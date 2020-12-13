package br.com.portalrioclaro.apispring.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1), PAID(2), SHIPPED(3), DELIVERED(4), CANCELED(5);

	private int status;

	private OrderStatus(int status) {
		this.status = status;
	}

	public int getCode() {
		return status;
	}

	public static OrderStatus valueOf(int code) {

		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Ivalid OrderStatus code");
	}

}
