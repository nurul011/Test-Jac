package TestJac.Test.Jac.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Objects;

public class City {

    @JsonIgnore
    private Long id;

    private String name;
    private int population;
    private String area; 
    private String globalrank;
    

    public City() {
    }

    public City(Long id, String name, int population,String area,String globalrank ) {

        this.id = id;
        this.name = name;
        this.population = population;
        this.area=area;
        this.globalrank=globalrank;
    }

    public String getGlobalrank() {
		return globalrank;
	}

	public void setGlobalrank(String globalrank) {
		this.globalrank = globalrank;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + this.population;
        hash = 79 * hash + Objects.hashCode(this.area);
        hash = 79 * hash + Objects.hashCode(this.globalrank);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final City other = (City) obj;
        if (this.population != other.population) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
         if(this.area !=other.area) {
        	 return false;
         }
          if(this.globalrank !=other.globalrank) {
        	  return false;
          }
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("City{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", population=").append(population);
        sb.append(", area=").append(area);
        sb.append(", globalrank=").append(globalrank);
        sb.append('}');
        return sb.toString();
    }
}
