{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/genetics/ListPopulation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ListPopulation",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.genetics.Population"
      ],
      "begin_line": 29,
      "end_line": 150,
      "comment": "\n * Population of chromosomes represented by a {@link List}.\n *\n * @since 2.0\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "chromosomes"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " List of chromosomes "
    },
    {
      "type": "field",
      "varNames": [
        "populationLimit"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " maximial size of the population "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.genetics.ListPopulation.ListPopulation(java.util.List\u003corg.apache.commons.math.genetics.Chromosome\u003e, int)",
      "begin_line": 44,
      "end_line": 54,
      "comment": "\n     * Creates a new ListPopulation instance.\n     *\n     * @param chromosomes list of chromosomes in the population\n     * @param populationLimit maximal size of the population\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 47,col 9)",
        "(line 48,col 9)-(line 50,col 9)",
        "(line 52,col 9)-(line 52,col 39)",
        "(line 53,col 9)-(line 53,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.genetics.ListPopulation.ListPopulation(int)",
      "begin_line": 62,
      "end_line": 68,
      "comment": "\n     * Creates a new ListPopulation instance and initializes its inner\n     * chromosome list.\n     *\n     * @param populationLimit maximal size of the population\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 66,col 47)",
        "(line 67,col 9)-(line 67,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.ListPopulation.setChromosomes(java.util.List\u003corg.apache.commons.math.genetics.Chromosome\u003e)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Sets the list of chromosomes.\n     * @param chromosomes the list of chromosomes\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.ListPopulation.getChromosomes()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Access the list of chromosomes.\n     * @return the list of chromosomes\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.ListPopulation.addChromosome(org.apache.commons.math.genetics.Chromosome)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Add the given chromosome to the population.\n     * @param chromosome the chromosome to add.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.ListPopulation.getFittestChromosome()",
      "begin_line": 98,
      "end_line": 108,
      "comment": "\n     * Access the fittest chromosome in this population.\n     * @return the fittest chromosome.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 60)",
        "(line 101,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.ListPopulation.getPopulationLimit()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Access the maximum population size.\n     * @return the maximum population size.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.ListPopulation.setPopulationLimit(int)",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Sets the maximal population size.\n     * @param populationLimit maximal population size.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.ListPopulation.getPopulationSize()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n     * Access the current population size.\n     * @return the current population size.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.ListPopulation.toString()",
      "begin_line": 137,
      "end_line": 140,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.ListPopulation.iterator()",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n     * Chromosome list iterator\n     *\n     * @return chromosome iterator\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 38)"
      ]
    }
  ]
}