public class SandwichBar {
	public int whichOrder(String[] available, String[] orders){
        for(int k=0; k < orders.length; k += 1) {
        	if (makeable(orders[k],available)) {
        		return k;
        	}
        }
        return -1;
     }

	private boolean makeable(String s, String[] ss) {
		String[] ingredients = s.split(" ");
		for(String one : ingredients) {
			if (! cont(one, ss)) {
				return false;
			}
		}
 		return true;
	}

	private boolean cont(String ing, String[] zz) {
		for(String z : zz) {
			if (ing.equals(z)) {
				return true;
			}
		} 
		return false;
	}

	public static void main(String[] args ) {
		SandwichBar sandbar = new SandwichBar();
		String[] available = { "cheese", "cheese", "cheese", "tomato" };
		String[] orders = { "ham ham ham", "water", "pork", 
				            "bread", "cheese tomato cheese", "beef" };
		int dex = sandbar.whichOrder(available, orders);
		System.out.println(dex);
	}
}
