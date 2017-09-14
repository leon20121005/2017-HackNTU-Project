public class Term
{
    private String _term; //詞
    private String _tag; //詞性

    public Term(String term, String tag)
    {
        _term = term;
        _tag = tag;
    }

    public String GetTerm()
    {
        return _term;
    }

    public String GetTag()
    {
        return _tag;
    }

    public void SetTerm(String term)
    {
        _term = term;
    }

    public void SetTag(String tag)
    {
        _tag = tag;
    }
}