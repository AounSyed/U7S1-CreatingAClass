package partC;

public class AlgoChallenge {

     /* Problem 1
      An upcoming artist's concert is coming to town.
      The concert manager is only allowing one person of a pair to be a "teen".
      Your at the front gate checking tickets and verifying ages.
      You allowed to let a pair in as long as only one person is a teen but both can't be a "teen".
      A "teen" is considered someone within the range of 13...19 inclusive.

      Return true if one or the other person in the pair is a teen, but not both.

      Example:
      oneTeen(13, 99) --> true
      oneTeen(21, 19) --> true
      oneTeen(13, 13) --> false
     */

    public static Boolean oneTeen(int person1, int person2) {
        boolean response = false;

        if (person1 >= 13 && person1 <= 19 && person2 > 19)
            response = true;
        else if (person2 >= 13 && person2 <= 19 && person1 > 19)
            response = true;

        return response;
    }


    /* Problem 2
    We're on the look-out for ounces "oz" within a string. You will be given a string,
    and you need to determine if the first two characters yields "oz".
    We need you to return a new string made of the first 2 chars (if present).

    Only include first char if it is 'o' and only include second char if it is 'z'.

    Example:
    beginWithOz("ozymandias") --> "oz"
    beginWithOz("bzoo") --> "z"
    beginWithOz("oxx") --> "o"
     */

    public static String beginWithOz(String ounces) {
        String response = "";

        if (ounces.charAt(0) == 'o' && ounces.charAt(1) == 'z')
            response += "oz";
        else if (ounces.charAt(0) == 'o')
            response += "o";
        else if (ounces.charAt(1) == 'z')
            response += "z";

        return response;
    }

}
