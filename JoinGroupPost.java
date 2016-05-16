import java.util.ArrayList;
/**
 * Write a description of class joinGroupPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JoinGroupPost extends Post
{
    private String group;

    /**
     * Constructor for objects of class joinGroupPost
     */
    public JoinGroupPost(String author, String group)
    {
        super(author);
        this.group = group;
    }
    
    /**
     * return: group
     */
    public String getGroup() {
        return group;
    }
}

