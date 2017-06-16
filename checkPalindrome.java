boolean checkPalindrome(String inputString) {
    int l = inputString.length();
    int count=0;
    if(l%2 ==0) return false;
    Stack st = new Stack();
    for(char c:inputString.toCharArray()){
        count++;
        if(count<=l/2 && c!='\0'){
            st.push(c);
            System.out.println(c);
        }
        
        if(count>(l/2)+1 && st.empty() == false){
            if(st.pop().toString().charAt(0) != c) return false;
        }
        
    }
    if(st.empty()) return true;
    else return false;
}