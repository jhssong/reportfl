{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/genetics/OnePointCrossover.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OnePointCrossover",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.genetics.CrossoverPolicy"
      ],
      "begin_line": 48,
      "end_line": 117,
      "comment": "\n * One point crossover policy. A random crossover point is selected and the\n * first part from each parent is copied to the corresponding child, and the\n * second parts are copied crosswise.\n *\n * Example:\n * \u003cpre\u003e\n * -C- denotes a crossover point\n *                   -C-                                -C-\n * p1 \u003d (1 0 1 0 0 1  | 0 1 1)    X    p2 \u003d (0 1 1 0 1 0  | 1 1 1)\n *         \\------------/ \\-----/              \\------------/ \\-----/\n *            ||         (*)                       ||        (**)\n *            VV         (**)                      VV        (*)\n *      /------------\\ /-----\\              /------------\\ /-----\\\n * c1 \u003d (1 0 1 0 0 1  | 1 1 1)    X    p2 \u003d (0 1 1 0 1 0  | 0 1 1)\n * \u003c/pre\u003e\n *\n * This policy works only on {@link AbstractListChromosome}, and therefore it\n * is parametrized by T. Moreover, the chromosomes must have same lengths.\n *\n * @param \u003cT\u003e generic type of the {@link AbstractListChromosome}s for crossover\n * @since 2.0\n * @version $Revision$ $Date$\n *\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.OnePointCrossover.crossover(org.apache.commons.math.genetics.Chromosome, org.apache.commons.math.genetics.Chromosome)",
      "begin_line": 69,
      "end_line": 75,
      "comment": "\n     * Performs one point crossover. A random crossover point is selected and the\n     * first part from each parent is copied to the corresponding child, and the\n     * second parts are copied crosswise.\n     *\n     * Example:\n     * -C- denotes a crossover point\n     *                   -C-                                -C-\n     * p1 \u003d (1 0 1 0 0 1  | 0 1 1)    X    p2 \u003d (0 1 1 0 1 0  | 1 1 1)\n     *         \\------------/ \\-----/              \\------------/ \\-----/\n     *            ||         (*)                       ||        (**)\n     *            VV         (**)                      VV        (*)\n     *      /------------\\ /-----\\              /------------\\ /-----\\\n     * c1 \u003d (1 0 1 0 0 1  | 1 1 1)    X    p2 \u003d (0 1 1 0 1 0  | 0 1 1)\n     *\n     * @param first first parent (p1)\n     * @param second second parent (p2)\n     * @return pair of two children (c1,c2)\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 74,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.OnePointCrossover.crossover(org.apache.commons.math.genetics.AbstractListChromosome\u003cT\u003e, org.apache.commons.math.genetics.AbstractListChromosome\u003cT\u003e)",
      "begin_line": 85,
      "end_line": 115,
      "comment": "\n     * Helper for {@link #crossover(Chromosome, Chromosome)}. Performs the actual crossover.\n     *\n     * @param first the first chromosome.\n     * @param second the second chromosome.\n     * @return the pair of new chromosomes that resulted from the crossover.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 39)",
        "(line 87,col 9)-(line 88,col 91)",
        "(line 91,col 9)-(line 91,col 55)",
        "(line 92,col 9)-(line 92,col 56)",
        "(line 94,col 9)-(line 94,col 70)",
        "(line 95,col 9)-(line 95,col 71)",
        "(line 98,col 9)-(line 98,col 91)",
        "(line 101,col 9)-(line 104,col 9)",
        "(line 106,col 9)-(line 109,col 9)",
        "(line 111,col 9)-(line 114,col 18)"
      ]
    }
  ]
}