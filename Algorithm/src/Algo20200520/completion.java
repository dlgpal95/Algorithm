package Algo20200520;

import java.util.Arrays;

public class completion {
	// class Solution {
//  public String solution(String[] participant, String[] completion) {
//      String answer = "";
//      boolean check = false;

//       for(int i =0; i< participant.length;i++){
	// check=false;
	// for(int j=0;j<completion.length;j++){

	// if(participant[i].equals(completion[j])){
	// completion[j]=null;
	// check = true;
	// break;
	// }
	// }
	// if(check==false){
	// answer += participant[i];
	// }
	// }
	// return answer;
	// }
//}

	class Solution {
		public String solution(String[] participant, String[] completion) {
			Arrays.sort(participant);
			Arrays.sort(completion);
			int i = 0; // a
			for (i = 0; i < completion.length; i++) {
				if (!participant[i].equals(completion[i])) {
					return participant[i];
				}
			}
			return participant[i];
		}
	}
}
