/*
Problem: 657. Robot Return to Origin
Pattern: Simulation / Coordinate Tracking
Time Complexity: O(n)
Space Complexity: O(1)
*/

class _657_Robot_Return_to_Origin {
    public boolean judgeCircle(String moves) {
        int x = 0 , y = 0;
        for(int i = 0  ; i < moves.length() ; i++){
            if(moves.charAt(i) == 'U'){
                y++;
            }
            else if(moves.charAt(i) == 'D'){
                y--;
            }
            else if(moves.charAt(i) == 'R'){
                x++;
            }
            else{
                x--;
            }
        }
        return (x == 0 && y == 0);
    }
}