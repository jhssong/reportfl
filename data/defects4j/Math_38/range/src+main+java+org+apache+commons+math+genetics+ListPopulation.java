{
  "filepath": "/tmp/Math-38b/src/main/java/org/apache/commons/math/genetics/ListPopulation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ListPopulation",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.genetics.Population"
      ],
      "begin_line": 33,
      "end_line": 155,
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
      "begin_line": 48,
      "end_line": 59,
      "comment": "\n     * Creates a new ListPopulation instance.\n     *\n     * @param chromosomes list of chromosomes in the population\n     * @param populationLimit maximal size of the population\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 52,col 9)",
        "(line 53,col 9)-(line 55,col 9)",
        "(line 57,col 9)-(line 57,col 39)",
        "(line 58,col 9)-(line 58,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.genetics.ListPopulation.ListPopulation(int)",
      "begin_line": 67,
      "end_line": 73,
      "comment": "\n     * Creates a new ListPopulation instance and initializes its inner\n     * chromosome list.\n     *\n     * @param populationLimit maximal size of the population\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 70,col 9)",
        "(line 71,col 9)-(line 71,col 47)",
        "(line 72,col 9)-(line 72,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.ListPopulation.setChromosomes(java.util.List\u003corg.apache.commons.math.genetics.Chromosome\u003e)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Sets the list of chromosomes.\n     * @param chromosomes the list of chromosomes\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.ListPopulation.getChromosomes()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Access the list of chromosomes.\n     * @return the list of chromosomes\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.ListPopulation.addChromosome(org.apache.commons.math.genetics.Chromosome)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Add the given chromosome to the population.\n     * @param chromosome the chromosome to add.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.ListPopulation.getFittestChromosome()",
      "begin_line": 103,
      "end_line": 113,
      "comment": "\n     * Access the fittest chromosome in this population.\n     * @return the fittest chromosome.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 60)",
        "(line 106,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.ListPopulation.getPopulationLimit()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * Access the maximum population size.\n     * @return the maximum population size.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.ListPopulation.setPopulationLimit(int)",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * Sets the maximal population size.\n     * @param populationLimit maximal population size.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.ListPopulation.getPopulationSize()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * Access the current population size.\n     * @return the current population size.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.ListPopulation.toString()",
      "begin_line": 142,
      "end_line": 145,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.ListPopulation.iterator()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Chromosome list iterator\n     *\n     * @return chromosome iterator\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 38)"
      ]
    }
  ]
}