{
  "filepath": "/tmp/Math-25b/src/main/java/org/apache/commons/math3/genetics/UniformCrossover.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UniformCrossover",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.genetics.CrossoverPolicy"
      ],
      "begin_line": 53,
      "end_line": 130,
      "comment": "\n * Perform Uniform Crossover [UX] on the specified chromosomes. A fixed mixing\n * ratio is used to combine genes from the first and second parents, e.g. using a\n * ratio of 0.5 would result in approximately 50% of genes coming from each\n * parent. This is typically a poor method of crossover, but empirical evidence\n * suggests that it is more exploratory and results in a larger part of the\n * problem space being searched.\n *\n * \u003cp\u003eThis crossover policy evaluates each gene of the parent chromosomes by chosing a\n * uniform random number {@code p} in the range [0, 1]. If {@code p} \u0026lt; {@code ratio},\n * the parent genes are swapped. This means with a ratio of 0.7, 30% of the genes from the\n * first parent and 70% from the second parent will be selected for the first offspring (and\n * vice versa for the second offspring).\u003c/p\u003e\n *\n * \u003cp\u003eThis policy works only on {@link AbstractListChromosome}, and therefore it\n * is parameterized by T. Moreover, the chromosomes must have same lengths.\n * \u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Crossover_%28genetic_algorithm%29\"\u003eCrossover techniques (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://www.obitko.com/tutorials/genetic-algorithms/crossover-mutation.php\"\u003eCrossover (Obitko.com)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://www.tomaszgwiazda.com/uniformX.htm\"\u003eUniform crossover\u003c/a\u003e\n * @param \u003cT\u003e generic type of the {@link AbstractListChromosome}s for crossover\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ratio"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " The mixing ratio. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.genetics.UniformCrossover.UniformCrossover(double)",
      "begin_line": 64,
      "end_line": 69,
      "comment": "\n     * Creates a new {@link UniformCrossover} policy using the given mixing ratio.\n     *\n     * @param ratio the mixing ratio\n     * @throws OutOfRangeException if the mixing ratio is outside the [0, 1] range\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 68,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.UniformCrossover.getRatio()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Returns the mixing ratio used by this {@link CrossoverPolicy}.\n     *\n     * @return the mixing ratio\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.UniformCrossover.crossover(org.apache.commons.math3.genetics.Chromosome, org.apache.commons.math3.genetics.Chromosome)",
      "begin_line": 83,
      "end_line": 89,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 88,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.UniformCrossover.mate(org.apache.commons.math3.genetics.AbstractListChromosome\u003cT\u003e, org.apache.commons.math3.genetics.AbstractListChromosome\u003cT\u003e)",
      "begin_line": 99,
      "end_line": 129,
      "comment": "\n     * Helper for {@link #crossover(Chromosome, Chromosome)}. Performs the actual crossover.\n     *\n     * @param first the first chromosome\n     * @param second the second chromosome\n     * @return the pair of new chromosomes that resulted from the crossover\n     * @throws DimensionMismatchException if the length of the two chromosomes is different\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 45)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 107,col 9)-(line 107,col 61)",
        "(line 108,col 9)-(line 108,col 62)",
        "(line 110,col 9)-(line 110,col 70)",
        "(line 111,col 9)-(line 111,col 71)",
        "(line 113,col 9)-(line 113,col 77)",
        "(line 115,col 9)-(line 125,col 9)",
        "(line 127,col 9)-(line 128,col 78)"
      ]
    }
  ]
}