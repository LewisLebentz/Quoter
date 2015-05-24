package im.lew.quoter;

/**
 * Created by lewislebentz on 24/05/2015.
 */
public class Quote {public String quote;
    public String person;
    public Quote(String mQuote, String mPerson){
        super();
        quote = mQuote;
        person = mPerson;
    }
    public String getPerson() {
        return person;
    }
    public String getQuote() {
        return quote;
    }
}
