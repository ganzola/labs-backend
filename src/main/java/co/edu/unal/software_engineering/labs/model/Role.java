package co.edu.unal.software_engineering.labs.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the role database table.
 */
@Entity
@Table( name = "role", schema = "public" )
public class Role implements Serializable{

    private static final long serialVersionUID = 1L;

    public static final int ROLE_STUDENT = 1;
    public static final int ROLE_TEACHER = 2;

    /**
     * Attributes
     */

    @Id
    @Column( name = "role_id" )
    private Integer id;

    @Column( name = "role_name" )
    private String roleName;

    /**
     * Constructors
     */

    public Role( ){
        // Default constructor is required
    }

    /**
     * Getters and Setters
     */

    public Integer getId( ){
        return this.id;
    }

    public void setId( Integer id ){
        this.id = id;
    }

    public String getRoleName( ){
        return this.roleName;
    }

    public void setRoleName( String roleName ){
        this.roleName = roleName;
    }

    /**
     * Methods
     */

    @Override
    public boolean equals( Object object ){
        if( !(object instanceof Role) ) return false;
        return id.equals( ((Role) object).getId( ) );
    }

    @Override
    public int hashCode( ){
        return id;
    }

}