package activities;


abstract class Book 
{
    String title;

    abstract void setTitle(String title);
    String getTitle() 
    {
        return title;
    }
}

class MyBook extends Book 
{

    void setTitle(String title) 
    {
        this.title = title;
    }
}
