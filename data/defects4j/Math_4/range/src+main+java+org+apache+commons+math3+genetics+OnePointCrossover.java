{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/genetics/OnePointCrossover.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OnePointCrossover",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.genetics.CrossoverPolicy"
      ],
      "begin_line": 52,
      "end_line": 129,
      "comment": "\n * One point crossover policy. A random crossover point is selected and the\n * first part from each parent is copied to the corresponding child, and the\n * second parts are copied crosswise.\n *\n * Example:\n * \u003cpre\u003e\n * -C- denotes a crossover point\n *                   -C-                                 -C-\n * p1 \u003d (1 0 1 0 0 1  | 0 1 1)    X    p2 \u003d (0 1 1 0 1 0  | 1 1 1)\n *      \\------------/ \\-----/              \\------------/ \\-----/\n *            ||         (*)                       ||        (**)\n *            VV         (**)                      VV        (*)\n *      /------------\\ /-----\\              /------------\\ /-----\\\n * c1 \u003d (1 0 1 0 0 1  | 1 1 1)    X    c2 \u003d (0 1 1 0 1 0  | 0 1 1)\n * \u003c/pre\u003e\n *\n * This policy works only on {@link AbstractListChromosome}, and therefore it\n * is parameterized by T. Moreover, the chromosomes must have same lengths.\n *\n * @param \u003cT\u003e generic type of the {@link AbstractListChromosome}s for crossover\n * @since 2.0\n * @version $Id$\n *\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.OnePointCrossover.crossover(org.apache.commons.math3.genetics.Chromosome, org.apache.commons.math3.genetics.Chromosome)",
      "begin_line": 78,
      "end_line": 86,
      "comment": "\n     * Performs one point crossover. A random crossover point is selected and the\n     * first part from each parent is copied to the corresponding child, and the\n     * second parts are copied crosswise.\n     *\n     * Example:\n     * \u003cpre\u003e\n     * -C- denotes a crossover point\n     *                   -C-                                 -C-\n     * p1 \u003d (1 0 1 0 0 1  | 0 1 1)    X    p2 \u003d (0 1 1 0 1 0  | 1 1 1)\n     *      \\------------/ \\-----/              \\------------/ \\-----/\n     *            ||         (*)                       ||        (**)\n     *            VV         (**)                      VV        (*)\n     *      /------------\\ /-----\\              /------------\\ /-----\\\n     * c1 \u003d (1 0 1 0 0 1  | 1 1 1)    X    c2 \u003d (0 1 1 0 1 0  | 0 1 1)\n     * \u003c/pre\u003e\n     *\n     * @param first first parent (p1)\n     * @param second second parent (p2)\n     * @return pair of two children (c1,c2)\n     * @throws MathIllegalArgumentException iff one of the chromosomes is\n     *   not an instance of {@link AbstractListChromosome}\n     * @throws DimensionMismatchException if the length of the two chromosomes is different\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 85,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.OnePointCrossover.crossover(org.apache.commons.math3.genetics.AbstractListChromosome\u003cT\u003e, org.apache.commons.math3.genetics.AbstractListChromosome\u003cT\u003e)",
      "begin_line": 97,
      "end_line": 127,
      "comment": "\n     * Helper for {@link #crossover(Chromosome, Chromosome)}. Performs the actual crossover.\n     *\n     * @param first the first chromosome.\n     * @param second the second chromosome.\n     * @return the pair of new chromosomes that resulted from the crossover.\n     * @throws DimensionMismatchException if the length of the two chromosomes is different\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 45)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 105,col 9)-(line 105,col 61)",
        "(line 106,col 9)-(line 106,col 62)",
        "(line 108,col 9)-(line 108,col 76)",
        "(line 109,col 9)-(line 109,col 77)",
        "(line 112,col 9)-(line 112,col 97)",
        "(line 115,col 9)-(line 118,col 9)",
        "(line 120,col 9)-(line 123,col 9)",
        "(line 125,col 9)-(line 126,col 78)"
      ]
    }
  ]
}