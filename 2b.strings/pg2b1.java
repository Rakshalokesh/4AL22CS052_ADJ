package github1;

public class pg2b1 {
	
	    public static void main(String[] args) {
	        int iterations = 10000;

	        long startTimeBuffer = System.nanoTime();
	        StringBuffer stringBuffer = new StringBuffer();
	        for (int i = 0; i < iterations; i++) {
	            stringBuffer.append("AIET");
	        }
	        long endTimeBuffer = System.nanoTime();
	        long durationBuffer = endTimeBuffer - startTimeBuffer;
	        System.out.println("Time taken by StringBuffer: " + durationBuffer + " ns");

	        long startTimeBuilder = System.nanoTime();
	        StringBuilder stringBuilder = new StringBuilder();
	        for (int i = 0; i < iterations; i++) {
	            stringBuilder.append("AIET");
	        }
	        long endTimeBuilder = System.nanoTime();
	        long durationBuilder = endTimeBuilder - startTimeBuilder;
	        System.out.println("Time taken by StringBuilder: " + durationBuilder + " ns");

	        if (durationBuffer > durationBuilder) {
	            System.out.println("StringBuilder is faster.");
	        } else {
	            System.out.println("StringBuffer is faster.");
	        }
	    }
	
}
