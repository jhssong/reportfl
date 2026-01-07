{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/genetics/ListPopulation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ListPopulation",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.genetics.Population"
      ],
      "begin_line": 37,
      "end_line": 223,
      "comment": "\n * Population of chromosomes represented by a {@link List}.\n *\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "chromosomes"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " List of chromosomes "
    },
    {
      "type": "field",
      "varNames": [
        "populationLimit"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " maximal size of the population "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.genetics.ListPopulation.ListPopulation(int)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Creates a new ListPopulation instance and initializes its inner chromosome list.\n     *\n     * @param populationLimit maximal size of the population\n     * @throws NotPositiveException if the population limit is not a positive number (\u0026lt; 1)\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.genetics.ListPopulation.ListPopulation(java.util.List\u003corg.apache.commons.math3.genetics.Chromosome\u003e, int)",
      "begin_line": 66,
      "end_line": 82,
      "comment": "\n     * Creates a new ListPopulation instance.\n     * \u003cp\u003e\n     * Note: the chromosomes of the specified list are added to the population.\n     *\n     * @param chromosomes list of chromosomes to be added to the population\n     * @param populationLimit maximal size of the population\n     * @throws NullArgumentException if the list of chromosomes is {@code null}\n     * @throws NotPositiveException if the population limit is not a positive number (\u0026lt; 1)\n     * @throws NumberIsTooLargeException if the list of chromosomes exceeds the population limit\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 71,col 9)",
        "(line 72,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 79,col 47)",
        "(line 80,col 9)-(line 80,col 70)",
        "(line 81,col 9)-(line 81,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.ListPopulation.setChromosomes(java.util.List\u003corg.apache.commons.math3.genetics.Chromosome\u003e)",
      "begin_line": 95,
      "end_line": 108,
      "comment": "\n     * Sets the list of chromosomes.\n     * \u003cp\u003e\n     * Note: this method removed all existing chromosomes in the population and adds all chromosomes\n     * of the specified list to the population.\n     *\n     * @param chromosomes the list of chromosomes\n     * @throws NullArgumentException if the list of chromosomes is {@code null}\n     * @throws NumberIsTooLargeException if the list of chromosomes exceeds the population limit\n     * @deprecated use {@link #addChromosomes(Collection)} instead\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 33)",
        "(line 107,col 9)-(line 107,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.ListPopulation.addChromosomes(java.util.Collection\u003corg.apache.commons.math3.genetics.Chromosome\u003e)",
      "begin_line": 117,
      "end_line": 123,
      "comment": "\n     * Add a {@link Collection} of chromosomes to this {@link Population}.\n     * @param chromosomeColl a {@link Collection} of chromosomes\n     * @throws NumberIsTooLargeException if the population would exceed the population limit when\n     * adding this chromosome\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.ListPopulation.getChromosomes()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * Returns an unmodifiable list of the chromosomes in this population.\n     * @return the unmodifiable list of chromosomes\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.ListPopulation.getChromosomeList()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * Access the list of chromosomes.\n     * @return the list of chromosomes\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.ListPopulation.addChromosome(org.apache.commons.math3.genetics.Chromosome)",
      "begin_line": 149,
      "end_line": 155,
      "comment": "\n     * Add the given chromosome to the population.\n     *\n     * @param chromosome the chromosome to add.\n     * @throws NumberIsTooLargeException if the population would exceed the {@code populationLimit} after\n     *   adding this chromosome\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.ListPopulation.getFittestChromosome()",
      "begin_line": 161,
      "end_line": 171,
      "comment": "\n     * Access the fittest chromosome in this population.\n     * @return the fittest chromosome.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 60)",
        "(line 164,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.ListPopulation.getPopulationLimit()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n     * Access the maximum population size.\n     * @return the maximum population size.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.ListPopulation.setPopulationLimit(int)",
      "begin_line": 188,
      "end_line": 196,
      "comment": "\n     * Sets the maximal population size.\n     * @param populationLimit maximal population size.\n     * @throws NotPositiveException if the population limit is not a positive number (\u0026lt; 1)\n     * @throws NumberIsTooSmallException if the new population size is smaller than the current number\n     *   of chromosomes in the population\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.ListPopulation.getPopulationSize()",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\n     * Access the current population size.\n     * @return the current population size.\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.ListPopulation.toString()",
      "begin_line": 209,
      "end_line": 212,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.ListPopulation.iterator()",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\n     * Returns an iterator over the unmodifiable list of chromosomes.\n     * \u003cp\u003eAny call to {@link Iterator#remove()} will result in a {@link UnsupportedOperationException}.\u003c/p\u003e\n     *\n     * @return chromosome iterator\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 43)"
      ]
    }
  ]
}