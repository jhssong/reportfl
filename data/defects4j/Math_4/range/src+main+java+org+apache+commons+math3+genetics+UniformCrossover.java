{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/genetics/UniformCrossover.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UniformCrossover",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.genetics.CrossoverPolicy"
      ],
      "begin_line": 52,
      "end_line": 135,
      "comment": "\n * Perform Uniform Crossover [UX] on the specified chromosomes. A fixed mixing\n * ratio is used to combine genes from the first and second parents, e.g. using a\n * ratio of 0.5 would result in approximately 50% of genes coming from each\n * parent. This is typically a poor method of crossover, but empirical evidence\n * suggests that it is more exploratory and results in a larger part of the\n * problem space being searched.\n * \u003cp\u003e\n * This crossover policy evaluates each gene of the parent chromosomes by chosing a\n * uniform random number {@code p} in the range [0, 1]. If {@code p} \u0026lt; {@code ratio},\n * the parent genes are swapped. This means with a ratio of 0.7, 30% of the genes from the\n * first parent and 70% from the second parent will be selected for the first offspring (and\n * vice versa for the second offspring).\n * \u003cp\u003e\n * This policy works only on {@link AbstractListChromosome}, and therefore it\n * is parameterized by T. Moreover, the chromosomes must have same lengths.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Crossover_%28genetic_algorithm%29\"\u003eCrossover techniques (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://www.obitko.com/tutorials/genetic-algorithms/crossover-mutation.php\"\u003eCrossover (Obitko.com)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://www.tomaszgwiazda.com/uniformX.htm\"\u003eUniform crossover\u003c/a\u003e\n * @param \u003cT\u003e generic type of the {@link AbstractListChromosome}s for crossover\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ratio"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " The mixing ratio. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.genetics.UniformCrossover.UniformCrossover(double)",
      "begin_line": 63,
      "end_line": 68,
      "comment": "\n     * Creates a new {@link UniformCrossover} policy using the given mixing ratio.\n     *\n     * @param ratio the mixing ratio\n     * @throws OutOfRangeException if the mixing ratio is outside the [0, 1] range\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 66,col 9)",
        "(line 67,col 9)-(line 67,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.UniformCrossover.getRatio()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Returns the mixing ratio used by this {@link CrossoverPolicy}.\n     *\n     * @return the mixing ratio\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.UniformCrossover.crossover(org.apache.commons.math3.genetics.Chromosome, org.apache.commons.math3.genetics.Chromosome)",
      "begin_line": 86,
      "end_line": 94,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws MathIllegalArgumentException iff one of the chromosomes is\n     *   not an instance of {@link AbstractListChromosome}\n     * @throws DimensionMismatchException if the length of the two chromosomes is different\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.UniformCrossover.mate(org.apache.commons.math3.genetics.AbstractListChromosome\u003cT\u003e, org.apache.commons.math3.genetics.AbstractListChromosome\u003cT\u003e)",
      "begin_line": 104,
      "end_line": 134,
      "comment": "\n     * Helper for {@link #crossover(Chromosome, Chromosome)}. Performs the actual crossover.\n     *\n     * @param first the first chromosome\n     * @param second the second chromosome\n     * @return the pair of new chromosomes that resulted from the crossover\n     * @throws DimensionMismatchException if the length of the two chromosomes is different\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 45)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 112,col 9)-(line 112,col 61)",
        "(line 113,col 9)-(line 113,col 62)",
        "(line 115,col 9)-(line 115,col 70)",
        "(line 116,col 9)-(line 116,col 71)",
        "(line 118,col 9)-(line 118,col 77)",
        "(line 120,col 9)-(line 130,col 9)",
        "(line 132,col 9)-(line 133,col 78)"
      ]
    }
  ]
}