package domain;

public class ActualProduct {
	private Product genericProduct;
	private boolean active;
	
	public ActualProduct(Product p, boolean b)
	{
		setGenericProduct(p);
		setActive(b);
	}

	public Product getGenericProduct() {
		return genericProduct;
	}

	public void setGenericProduct(Product genericProduct) {
		this.genericProduct = genericProduct;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
}
