package wizut.tpsi.lab9;

public class BlogPost
{
    long id;
    String title;
    String content;

    BlogPost()
    {

    }


    BlogPost(long id, String title, String content)
    {
        this.id = id;
        this.title=title;
        this.content=content;
    }


    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
