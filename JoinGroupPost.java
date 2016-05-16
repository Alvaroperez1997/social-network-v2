import java.util.ArrayList;
/**
 * Write a description of class joinGroupPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JoinGroupPost extends Post
{
    private ArrayList<String> usuarios;

    /**
     * Constructor for objects of class joinGroupPost
     */
    public JoinGroupPost(String author)
    {
        super(author);
        usuarios = new ArrayList<>();
    }

    /**
     * Añade un usuario al grupo
     */
    public void addUser(String user)
    {
        usuarios.add(user);
    }
}

