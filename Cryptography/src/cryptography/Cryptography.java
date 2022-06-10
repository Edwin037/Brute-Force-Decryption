
package cryptography;

import java.util.Arrays;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Cryptography 
{
    public static void main(String[] args) 
    {
       char letter[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};//the regular alphabet
        char encrypt[]={'F','R','P','J','U','I','E','Q','M','B','G','W','D','X','A','Y','C','T','O','S','H','K','L','N','V','X'};//what the new letter will be assigned to
 
        System.out.println(Arrays.toString(letter)); 
        System.out.println(Arrays.toString(encrypt)); 
               String str =JOptionPane.showInputDialog("Enter your text to be encrypted: "); //this will store the text to be encrypted 
               str = str.toUpperCase();//this turns every letter uppercase
               System.out.println();
               System.out.println("Original Text:");
               System.out.println(str);//prints out original text
               System.out.println();
               String estr="";//this will store the encrypted text
               
               /*this section will change every letter entered into a new letter
               and leave alone any non-letter chracters.
               */
               for (int x=0; x<str.length();x++)
               {//start encryption 
                   if (str.charAt(x)=='A')
                   {
                           
                      estr = estr+ encrypt[0]; 
                   }
                   else if (str.charAt(x)=='B')
                   {
                      estr = estr+ encrypt[1];
                   }
                   else if (str.charAt(x)=='C')
                   {
                      estr = estr+encrypt[2];
                   }
                   else if (str.charAt(x)=='D')
                   {
                      estr = estr+encrypt[3];
                   }
                   else if (str.charAt(x)=='E')
                   {
                      estr = estr+ encrypt[4];
                   }
                   else if (str.charAt(x)=='F')
                   {
                      estr = estr+ encrypt[5];
                   }
                   else if (str.charAt(x)=='G')
                   {
                      estr = estr+encrypt[6];
                   }
                   else if (str.charAt(x)=='H')
                   {
                      estr = estr+ encrypt[7];
                   }
                   else if (str.charAt(x)=='I')
                   {
                      estr = estr+ encrypt[8];
                   }
                   else if (str.charAt(x)=='J')
                   {
                      estr = estr+ encrypt[9];
                   }
                   else if (str.charAt(x)=='K')
                   {
                      estr = estr+ encrypt[10];
                   }
                   else if (str.charAt(x)=='L')
                   {
                      estr = estr+ encrypt[11];
                   }
                   else if (str.charAt(x)=='M')
                   {
                      estr = estr+ encrypt[12];
                   }
                   else if (str.charAt(x)=='N')
                   {
                      estr = estr+ encrypt[13];
                   }
                   else if (str.charAt(x)=='O')
                   {
                      estr = estr+ encrypt[14];
                   }
                   else if (str.charAt(x)=='P')
                   {
                      estr = estr+ encrypt[15];
                   }
                   else if (str.charAt(x)=='Q')
                   {
                      estr = estr+ encrypt[16];
                   }
                   else if (str.charAt(x)=='R')
                   {
                      estr = estr+ encrypt[17];
                   }
                   else if (str.charAt(x)=='S')
                   {
                      estr = estr+ encrypt[18];
                   }
                   else if (str.charAt(x)=='T')
                   {
                      estr = estr+ encrypt[19];
                   }
                   else if (str.charAt(x)=='U')
                   {
                      estr = estr+ encrypt[20];
                   }
                   else if (str.charAt(x)=='V')
                   {
                      estr = estr+ encrypt[21];
                   }
                   else if (str.charAt(x)=='W')
                   {
                      estr = estr+ encrypt[22];
                   }
                   else if (str.charAt(x)=='X')
                   {
                      estr = estr+ encrypt[23];
                   }
                   else if (str.charAt(x)=='Y')
                   {
                      estr = estr+ encrypt[24];
                   }
                    else if (str.charAt(x)=='Z')
                   {
                      estr = estr+ encrypt[25];
                   }
                    else 
                    {
                        estr = estr + str.charAt(x);
                    }
               }//end encryption
               System.out.println("Encrypted Text:");
               System.out.println(estr);//this will print out the encrypted text
               System.out.println();
               //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
               
               String encryptext;//this will store the encrypted text

		double frequency;
		int ii;
		int numltrs = 0;

		int freq[] = new int[26]; // declare array to store count of occurence of letter

		DecimalFormat df = new DecimalFormat("0.000");

		// load letter array with uppercase only
		for (int y = 0; y < 26; y++) 
                {
                    letter[y] = (char) (y + 65);
		}
                
                //the user will enter the encrypted text to be decrypted
		encryptext = JOptionPane.showInputDialog("Enter encrypted text");

		for (int y = 0; y < encryptext.length(); y++) {// start for y
			if ((encryptext.charAt(y) >= 'A') && (encryptext.charAt(y) <= 'Z')) {
				ii = (int) encryptext.charAt(y) - 65;
				freq[ii]++;
				numltrs++;// count total number of characters
			}
			if ((encryptext.charAt(y) >= 'a') && (encryptext.charAt(y) <= 'z')) {
				ii = (int) encryptext.charAt(y) - 97;
				freq[ii]++;
				numltrs++;// count total number of characters
			}
		} // end for y
		System.out.println("total letters is " + numltrs);
		for (int y = 0; y < 26; y++) {// start for y

			frequency = freq[y] / (numltrs * 1.0) * 100;
			System.out.println(letter[y] + " occurs " + freq[y] + " times freq " + df.format(frequency));
		} // end for y

		// bubble sort that affect the parallel arrays
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < 26 - i - 1; j++)
				if (freq[j] < freq[j + 1]) {
					int freqtemp = freq[j];
					freq[j] = freq[j + 1];
					freq[j + 1] = freqtemp;

					char lettertemp = letter[j];
					letter[j] = letter[j + 1];
					letter[j + 1] = lettertemp;
				}
		}

		// will print the sorted
                System.out.println();
		System.out.println("BUBBLE SORT TEST");
		System.out.println("total letters is " + numltrs);
		for (int y = 0; y < 26; y++) {// start for y
			frequency = freq[y] / (numltrs * 1.0) * 100;
			System.out.println(letter[y] + " occurs " + freq[y] + " times freq " + df.format(frequency));
		} // end for y

		// now we need to order the array of letter frequencies from highest to lowest
		// we will use a reverse bubble sort for this
		// also we need to make sure the letter stays associated with the frequency
		// so we can use parallel arrays

		// using the frequency table substitute letters based on frequency
		String decryptxt = "";
		char tempchar;
		for (int i = 0; i < encryptext.length(); i++) {
			int tempnum = encryptext.charAt(i);
			tempchar = (char) (tempnum);
			if ((tempnum >= 'a') && (tempnum <= 'z')) {
				tempnum = tempnum - 32;
				tempchar = (char) (tempnum);
			}

			if (tempchar == letter[0]) {
				decryptxt = decryptxt + "E";
			} else if (tempchar == letter[1]) {
				decryptxt = decryptxt + "T";
			} else if (tempchar == letter[2]) {
				decryptxt = decryptxt + "A";
			} else if (tempchar == letter[3]) {
				decryptxt = decryptxt + "O";
			} else if (tempchar == letter[4]) {
				decryptxt = decryptxt + "I";
			} else if (tempchar == letter[5]) {
				decryptxt = decryptxt + "N";
			} else if (tempchar == letter[6]) {
				decryptxt = decryptxt + "S";
			} else if (tempchar == letter[7]) {
				decryptxt = decryptxt + "R";
			} else if (tempchar == letter[8]) {
				decryptxt = decryptxt + "H";
			} else if (tempchar == letter[9]) {
				decryptxt = decryptxt + "D";
			} else if (tempchar == letter[10]) {
				decryptxt = decryptxt + "L";
			} else if (tempchar == letter[11]) {
				decryptxt = decryptxt + "U";
			} else if (tempchar == letter[12]) {
				decryptxt = decryptxt + "C";
			} else if (tempchar == letter[13]) {
				decryptxt = decryptxt + "M";
			} else if (tempchar == letter[14]) {
				decryptxt = decryptxt + "F";
			} else if (tempchar == letter[15]) {
				decryptxt = decryptxt + "Y";
			} else if (tempchar == letter[16]) {
				decryptxt = decryptxt + "W";
			} else if (tempchar == letter[17]) {
				decryptxt = decryptxt + "G";
			} else if (tempchar == letter[18]) {
				decryptxt = decryptxt + "P";
			} else if (tempchar == letter[19]) {
				decryptxt = decryptxt + "B";
			} else if (tempchar == letter[20]) {
				decryptxt = decryptxt + "V";
			} else if (tempchar == letter[21]) {
				decryptxt = decryptxt + "K";
			} else if (tempchar == letter[22]) {
				decryptxt = decryptxt + "X";
			} else if (tempchar == letter[23]) {
				decryptxt = decryptxt + "Q";
			} else if (tempchar == letter[24]) {
				decryptxt = decryptxt + "J";
			} else if (tempchar == letter[25]) {
				decryptxt = decryptxt + "Z";
			} else { 
				decryptxt = decryptxt + encryptext.charAt(i);
			}
			

		}
                System.out.println();
                System.out.println("Decrypted Text:");
		System.out.println(decryptxt);
                System.out.println();
                
                
      //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~          
      int match=0;//matched characters counter
      int totalchars=0;//total characters counter
      char alphabet[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
      char lettersmatched[] = {'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-'};
      String original;//original text 
      String dstr;//decrypted text
      original = JOptionPane.showInputDialog("Input the original text");        
      dstr = JOptionPane.showInputDialog("Input the decrypted text");        
      
      /*this for loop will determine how many characters there are, how many of 
      them matched the original text, and determine which letters were decrypted
      accurately.*/
      for (int y=0;y<dstr.length();y++)        
      {//start for        
        if ((original.charAt(y)>='A')&& (original.charAt(y)<='Z'))
        {
         totalchars=totalchars+1;
         if (original.charAt(y)==dstr.charAt(y))
         {
          match=match+1;
          if (original.charAt(y)=='A')
            {               
            lettersmatched[0]= 'Y'; 
            }
          if (original.charAt(y)=='B')
            {               
            lettersmatched[1]= 'Y'; 
            }
          if (original.charAt(y)=='C')
            {               
           lettersmatched[2]= 'Y'; 
            }
          if (original.charAt(y)=='D')
            {               
            lettersmatched[3]= 'Y'; 
            }
          if (original.charAt(y)=='E')
            {               
            lettersmatched[4]= 'Y'; 
            }
          if (original.charAt(y)=='F')
            {               
            lettersmatched[5]= 'Y'; 
            }
          if (original.charAt(y)=='G')
            {               
            lettersmatched[6]= 'Y'; 
            }
          if (original.charAt(y)=='H')
            {               
            lettersmatched[7]= 'Y'; 
            }
          if (original.charAt(y)=='I')
            {               
            lettersmatched[8]= 'Y'; 
            }
          if (original.charAt(y)=='J')
            {               
            lettersmatched[9]= 'Y'; 
            }
          if (original.charAt(y)=='K')
            {               
           lettersmatched[10]= 'Y'; 
            }
          if (original.charAt(y)=='L')
            {               
            lettersmatched[11]= 'Y'; 
            }
          if (original.charAt(y)=='M')
            {               
            lettersmatched[12]= 'Y'; 
            }
          if (original.charAt(y)=='N')
            {               
            lettersmatched[13]= 'Y'; 
            }
          if (original.charAt(y)=='O')
            {               
            lettersmatched[14]= 'Y'; 
            }
          if (original.charAt(y)=='P')
            {               
           lettersmatched[15]= 'Y'; 
            }
          if (original.charAt(y)=='Q')
            {               
            lettersmatched[16]= 'Y'; 
            }
          if (original.charAt(y)=='R')
            {               
           lettersmatched[17]= 'Y'; 
            }
          if (original.charAt(y)=='S')
            {               
           lettersmatched[18]= 'Y'; 
            }
          if (original.charAt(y)=='T')
            {               
            lettersmatched[19]= 'Y'; 
            }
          if (original.charAt(y)=='U')
            {               
            lettersmatched[20]= 'Y'; 
            }
          if (original.charAt(y)=='V')
            {               
            lettersmatched[21]= 'Y'; 
            }
          if (original.charAt(y)=='W')
            {               
            lettersmatched[22]= 'Y'; 
            }
          if (original.charAt(y)=='X')
            {               
            lettersmatched[23]= 'Y'; 
            }
          if (original.charAt(y)=='Y')
            {               
            lettersmatched[24]= 'Y'; 
            }
          if (original.charAt(y)=='Z')
            {               
            lettersmatched[25]= 'Y'; 
            }
         }    
        }
       
      }// end for     
      System.out.println("There were a total of " + totalchars + " characters.");
      System.out.println(match + " characters matched.");
      double proportion=((double)match/totalchars)*100.0;
      System.out.println((df.format(proportion))+"% of the decrypted characters matched the original text.");   
      System.out.println(Arrays.toString(alphabet));
      System.out.println(Arrays.toString(lettersmatched));
      for (int y=0;y<26;y++)        
      {//start for loop
          if (lettersmatched[y]=='Y')
          {
               System.out.println("The letter " + alphabet[y] + " was matched correctly.");
          }
      }// end for loop
    }   
}

