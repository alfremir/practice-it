public void removeShorterStrings(ArrayList<String> list) {
		// find current and second pair
		for (int index = 0; index < list.size(); index++) {
				String s1 = list.get(index);
				if (index + 1 == list.size()) {
				
				} else {
					String s2 = list.get(index + 1);
					
					int length1 = s1.length();
					int length2 = s2.length();
					
					// compare values
					// if first is smaller or there is a tie, remove the first. no need for -- as it is comparing consecutive
					if (length1 <= length2) {
						list.remove(index);
						
					// if second is smaller, remove the second index. no need for --. will move to compare the next pair.
					} else if (length2 < length1) {
						list.remove(index + 1);
					}
					
				}
		}
		
	}
