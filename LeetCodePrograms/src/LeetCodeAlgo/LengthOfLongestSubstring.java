package LeetCodeAlgo;
import java.util.HashSet;
public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcabcbb";
		
		System.out.println(longest(s));

	}
	
	public static int longest(String s)
	{
		int start = 0;
		int end = 0;
		int maxlen = Math.min(s.length(),1);
		
		HashSet<Character> seen = new HashSet<>();
		
		while(end < s.length())
		{
			char c = s.charAt(end);
			
			while(seen.contains(c))
			{
				seen.remove(s.charAt(start));
				start += 1;
				
			}
			
			seen.add(c);
			
			int windowSize  = end - start + 1;
			
			maxlen = Math.max(maxlen, windowSize);
			end += 1;
		}
		
		return maxlen;
	}

}
