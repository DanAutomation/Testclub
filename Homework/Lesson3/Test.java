package Lesson3;

	public class Test {
	    public static int convertToRomanian(String roman){
	    	int res = 0;
	    	int middle = 0;
	    	int length = roman.length();
	    	
	    	for(int i = 0; i < length - 1; i++){
	    		if(getInt(roman.charAt(i)) > getInt(roman.charAt(i + 1))){
	    			res = res + getInt(roman.charAt(i)) + middle;
	    			middle = 0;
	    		} else if (getInt(roman.charAt(i)) == getInt(roman.charAt(i + 1))){
	    			middle = middle + getInt(roman.charAt(i + 1));
	    		} else if (getInt(roman.charAt(i)) < getInt(roman.charAt(i + 1))){
	    			middle = middle + getInt(roman.charAt(i + 1));
	    		}
	    	}
	    	res += middle + getInt(roman.charAt(length - 1));
	    	return res;
	    	
	    }

		private static Integer getInt(char romanCh) {
			if(romanCh == 'I')
			return 1;
			else if(romanCh == 'V'){
			return 5;
			}
			else if(romanCh == 'L'){
				return 50;
		    }
			else if(romanCh == 'C'){
				return 100;
		    }
			else if(romanCh == 'D'){
				return 500;
		    }
			else if(romanCh == 'L'){
				return 1000;
		    }
			return (Integer) null;
		}
	}