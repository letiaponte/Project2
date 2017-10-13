/**
 * 
 */
package transcript;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leti
 *
 */
public class Transcript {

	/**
	 * 
	 */
    static public final List<String> stopWords = new ArrayList<String>(); //stores the stopWords in English
    static public final List<String> posetiveLexicons  = new ArrayList<String>(); //keeping a number of posetiveLexicons 
    static public final List<String> negativeLexicons  = new ArrayList<String>(); //keeping a number of negativeLexicons 
    
	public Transcript() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void loadStopWords() {
        //load the stopWords in the ArrayList
		stopWords.clear();
		stopWords.add("a");
		stopWords.add("about");
		stopWords.add("above");
		stopWords.add("after");
		stopWords.add("again");
		stopWords.add("against");
		stopWords.add("all");
		stopWords.add("am");
		stopWords.add("an");
		stopWords.add("and");
		stopWords.add("any");
		stopWords.add("are");
		stopWords.add("aren't");
		stopWords.add("as");
		stopWords.add("at");
		stopWords.add("be");
		stopWords.add("because");
		stopWords.add("been");
		stopWords.add("before");
		stopWords.add("being");
		stopWords.add("below");
		stopWords.add("between");
		stopWords.add("both");
		stopWords.add("but");
		stopWords.add("by");
		stopWords.add("can't");
		stopWords.add("cannot");
		stopWords.add("could");
		stopWords.add("couldn't");
		stopWords.add("did");
		stopWords.add("didn't");
		stopWords.add("do");
		stopWords.add("does");
		stopWords.add("doesn't");
		stopWords.add("doing");
		stopWords.add("don't");
		stopWords.add("down");
		stopWords.add("during");
		stopWords.add("each");
		stopWords.add("few");
		stopWords.add("for");
		stopWords.add("from");
		stopWords.add("further");
		stopWords.add("had");
		stopWords.add("hadn't");
		stopWords.add("has");
		stopWords.add("hasn't");
		stopWords.add("have");
		stopWords.add("haven't");
		stopWords.add("having");
		stopWords.add("he");
		stopWords.add("he'd");
		stopWords.add("he'll");
		stopWords.add("he's");
		stopWords.add("her");
		stopWords.add("here");
		stopWords.add("here's");
		stopWords.add("hers");
		stopWords.add("herself");
		stopWords.add("him");
		stopWords.add("himself");
		stopWords.add("his");
		stopWords.add("how");
		stopWords.add("how's");
		stopWords.add("I");
		stopWords.add("I'd");
		stopWords.add("I'll");
		stopWords.add("I'm");
		stopWords.add("I've");
		stopWords.add("if");
		stopWords.add("in");
		stopWords.add("into");
		stopWords.add("is");
		stopWords.add("isn't");
		stopWords.add("it");
		stopWords.add("it's");
		stopWords.add("its");
		stopWords.add("itself");
		stopWords.add("let's");
		stopWords.add("me");
		stopWords.add("more");
		stopWords.add("most");
		stopWords.add("mustn't");
		stopWords.add("my");
		stopWords.add("myself");
		stopWords.add("no");
		stopWords.add("nor");
		stopWords.add("not");
		stopWords.add("of");
		stopWords.add("off");
		stopWords.add("on");
		stopWords.add("once");
		stopWords.add("only");	
		stopWords.add("or");
		stopWords.add("other");
		stopWords.add("ought");
		stopWords.add("our");
		stopWords.add("ours");
		stopWords.add("ourselves");
		stopWords.add("out");
		stopWords.add("over");
		stopWords.add("own");
		stopWords.add("same");
		stopWords.add("shan't");
		stopWords.add("she");
		stopWords.add("she'd");
		stopWords.add("she'll");
		stopWords.add("she's");
		stopWords.add("should");
		stopWords.add("shouldn't");
		stopWords.add("so");
		stopWords.add("some");
		stopWords.add("such");
		stopWords.add("than");
		stopWords.add("that");
		stopWords.add("that's");
		stopWords.add("the");
		stopWords.add("their");
		stopWords.add("theirs");
		stopWords.add("them");
		stopWords.add("themselves");
		stopWords.add("then");
		stopWords.add("there");
		stopWords.add("there's");
		stopWords.add("these");
		stopWords.add("they");
		stopWords.add("they'd");
		stopWords.add("they'll");
		stopWords.add("they're");
		stopWords.add("they've");
		stopWords.add("this");
		stopWords.add("those");
		stopWords.add("through");
		stopWords.add("to");
		stopWords.add("too");
		stopWords.add("under");
		stopWords.add("until");
		stopWords.add("up");
		stopWords.add("very");
		stopWords.add("was");
		stopWords.add("wasn't");
		stopWords.add("we");
		stopWords.add("we'd");
		stopWords.add("we'll");
		stopWords.add("we're");
		stopWords.add("we've");
		stopWords.add("were");
		stopWords.add("weren't");
		stopWords.add("what");
		stopWords.add("what's");
		stopWords.add("when");
		stopWords.add("when's");
		stopWords.add("where");
		stopWords.add("where's");
		stopWords.add("which");
		stopWords.add("while");
		stopWords.add("who");
		stopWords.add("who's");
		stopWords.add("whom");
		stopWords.add("why");
		stopWords.add("why's");
		stopWords.add("with");
		stopWords.add("won't");
		stopWords.add("would");
		stopWords.add("wouldn't");
		stopWords.add("you");
		stopWords.add("you'd");
		stopWords.add("you'll");
		stopWords.add("you're");
		stopWords.add("you've");
		stopWords.add("your");
		stopWords.add("yours");
		stopWords.add("yourself");
		stopWords.add("yourselves");		     
    }
	
	public static void loadPosetiveLexicons() {
        //load the PosetiveLexicons in the ArrayList
		posetiveLexicons.clear();
		posetiveLexicons.add("great");
		posetiveLexicons.add("grateful");
		posetiveLexicons.add("good");
		posetiveLexicons.add("helpful");
		posetiveLexicons.add("thankful");
		posetiveLexicons.add("best");
		posetiveLexicons.add("better");
		posetiveLexicons.add("best");
		posetiveLexicons.add("beyond");
		posetiveLexicons.add("comfortable");
		posetiveLexicons.add("commitment");
		posetiveLexicons.add("committed");
		posetiveLexicons.add("renew");
		posetiveLexicons.add("register");
		posetiveLexicons.add("unbelievable");
		posetiveLexicons.add("unbelievably");
		posetiveLexicons.add("awesome");
		posetiveLexicons.add("wonderful");
		
	}
	
	public static void loadNegativeLexicons() {
        //load the NegativeLexicons in the ArrayList
		negativeLexicons.clear();
		negativeLexicons.add("bad");
		negativeLexicons.add("worse");
		negativeLexicons.add("worst");
		negativeLexicons.add("crazy");
		negativeLexicons.add("confuse");
		negativeLexicons.add("confused");
		negativeLexicons.add("confusing");
		negativeLexicons.add("disturb");
		negativeLexicons.add("disturbance");
		negativeLexicons.add("disturbed");
		negativeLexicons.add("angry");
		negativeLexicons.add("annoy");
		negativeLexicons.add("annoyed");
		negativeLexicons.add("annoying");
		negativeLexicons.add("annoyingly");
		negativeLexicons.add("refuse");
		negativeLexicons.add("refused");
		negativeLexicons.add("regret");
		negativeLexicons.add("reject");
		negativeLexicons.add("rejected");
		negativeLexicons.add("repetitive");		
		negativeLexicons.add("repetitively");
		negativeLexicons.add("cancel");
		negativeLexicons.add("discontinue");
		negativeLexicons.add("terminate");
		negativeLexicons.add("mad");
		negativeLexicons.add("unhappy");
		negativeLexicons.add("unhelpful");
		negativeLexicons.add("unlucky");
	}

}
