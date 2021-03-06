package com.impetus.client.query;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "client", schema = "KunderaExamples@hbaseTest")
public class TokenClient
{

    @Id
    @Column(name = "client_id")
    private String id;

    @Column(name = "client_name")
    private String clientName;

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    private Set<Token> tokens;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getClientName()
    {
        return clientName;
    }

    public void setClientName(String clientName)
    {
        this.clientName = clientName;
    }

    public Set<Token> getTokens()
    {
        return tokens;
    }

    public void setTokens(Set<Token> tokens)
    {
        this.tokens = tokens;
    }

}
