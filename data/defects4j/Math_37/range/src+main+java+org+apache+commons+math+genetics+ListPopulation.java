{
  "filepath": "/tmp/Math-37b/src/main/java/org/apache/commons/math/genetics/ListPopulation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ListPopulation",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.genetics.Population"
      ],
      "begin_line": 33,
      "end_line": 157,
      "comment": "\n * Population of chromosomes represented by a {@link List}.\n *\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "chromosomes"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " List of chromosomes "
    },
    {
      "type": "field",
      "varNames": [
        "populationLimit"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " maximal size of the population "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.genetics.ListPopulation.ListPopulation(java.util.List\u003corg.apache.commons.math.genetics.Chromosome\u003e, int)",
      "begin_line": 50,
      "end_line": 61,
      "comment": "\n     * Creates a new ListPopulation instance.\n     *\n     * @param chromosomes list of chromosomes in the population\n     * @param populationLimit maximal size of the population\n     * @throws NumberIsTooLargeException if the list of chromosomes exceeds the population limit\n     * @throws NotPositiveException if the population limit is not a positive number (\u0026lt; 1)\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 54,col 9)",
        "(line 55,col 9)-(line 57,col 9)",
        "(line 59,col 9)-(line 59,col 39)",
        "(line 60,col 9)-(line 60,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.genetics.ListPopulation.ListPopulation(int)",
      "begin_line": 69,
      "end_line": 75,
      "comment": "\n     * Creates a new ListPopulation instance and initializes its inner chromosome list.\n     *\n     * @param populationLimit maximal size of the population\n     * @throws NotPositiveException if the population limit is not a positive number (\u0026lt; 1)\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 73,col 47)",
        "(line 74,col 9)-(line 74,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.ListPopulation.setChromosomes(java.util.List\u003corg.apache.commons.math.genetics.Chromosome\u003e)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Sets the list of chromosomes.\n     * @param chromosomes the list of chromosomes\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.ListPopulation.getChromosomes()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Access the list of chromosomes.\n     * @return the list of chromosomes\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.ListPopulation.addChromosome(org.apache.commons.math.genetics.Chromosome)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Add the given chromosome to the population.\n     * @param chromosome the chromosome to add.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.ListPopulation.getFittestChromosome()",
      "begin_line": 105,
      "end_line": 115,
      "comment": "\n     * Access the fittest chromosome in this population.\n     * @return the fittest chromosome.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 60)",
        "(line 108,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 114,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.ListPopulation.getPopulationLimit()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Access the maximum population size.\n     * @return the maximum population size.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.ListPopulation.setPopulationLimit(int)",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * Sets the maximal population size.\n     * @param populationLimit maximal population size.\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.ListPopulation.getPopulationSize()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * Access the current population size.\n     * @return the current population size.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.ListPopulation.toString()",
      "begin_line": 144,
      "end_line": 147,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.ListPopulation.iterator()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * Chromosome list iterator\n     *\n     * @return chromosome iterator\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 38)"
      ]
    }
  ]
}