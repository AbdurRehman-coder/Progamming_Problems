void main() {
Solution solution = Solution();
  var test1 = solution.romanToInt('MXLVII');
  print('test 1: $test1');
}

class Solution {
  int romanToInt(String s) {
 Map<String, int> alphabet = {
    'I': 1,
    'V': 5,
    'X': 10,
    'L': 50,
    'C': 100,
    'D': 500,
    'M': 1000,
  };
  int summ = 0;

  for (var i = 0; i < s.length; i++) {
    var j = i + 1;
    
    if (j < s.length && alphabet[s[i]]! < alphabet[s[j]]!) {
      summ += alphabet[s[j]]! -  alphabet[s[i]]!;
      i += 1;
    } else{
      summ += alphabet[s[i]]!;
   
    }
  }
  return summ;
  }
  
}
