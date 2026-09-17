package src.vehicles;

import java.util.ArrayList;

import src.parts.Parts;

public class Vehicle
{
    private String type;
    private ArrayList<Parts> builtFrom = new ArrayList<Parts>();

    public Vehicle(String type)
    {
        this.type = type;
    }

    public Vehicle(String type, Parts... part)
    {
        this.type = type;
        for (Parts p : part)
        {
            builtFrom.add(p);
        }
    }

    public Vehicle(String type, ArrayList<Parts> builtFrom)
    {
        this.type = type;
        this.builtFrom = builtFrom;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Type: ").append(type).append("\nBuilt From: [");

        if (builtFrom.isEmpty())
        {
            sb.append("(none)");
        }
        else
        {
            for (int i = 0; i < builtFrom.size(); i++)
            {
                if (i > 0)
                {
                    sb.append(", ");
                }
                sb.append(builtFrom.get(i).summary());
            }
        }

        sb.append("]");

        return sb.toString();
    }
}