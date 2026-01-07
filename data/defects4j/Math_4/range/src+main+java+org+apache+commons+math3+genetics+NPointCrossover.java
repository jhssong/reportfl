{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/genetics/NPointCrossover.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NPointCrossover",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.genetics.CrossoverPolicy"
      ],
      "begin_line": 53,
      "end_line": 179,
      "comment": "\n * N-point crossover policy. For each iteration a random crossover point is\n * selected and the first part from each parent is copied to the corresponding\n * child, and the second parts are copied crosswise.\n *\n * Example (2-point crossover):\n * \u003cpre\u003e\n * -C- denotes a crossover point\n *           -C-       -C-                         -C-        -C-\n * p1 \u003d (1 0  | 1 0 0 1 | 0 1 1)    X    p2 \u003d (0 1  | 1 0 1 0  | 1 1 1)\n *      \\----/ \\-------/ \\-----/              \\----/ \\--------/ \\-----/\n *        ||      (*)       ||                  ||      (**)       ||\n *        VV      (**)      VV                  VV      (*)        VV\n *      /----\\ /--------\\ /-----\\             /----\\ /--------\\ /-----\\\n * c1 \u003d (1 0  | 1 0 1 0  | 0 1 1)    X   c2 \u003d (0 1  | 1 0 0 1  | 0 1 1)\n * \u003c/pre\u003e\n *\n * This policy works only on {@link AbstractListChromosome}, and therefore it\n * is parameterized by T. Moreover, the chromosomes must have same lengths.\n *\n * @param \u003cT\u003e generic type of the {@link AbstractListChromosome}s for crossover\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "crossoverPoints"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " The number of crossover points. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.genetics.NPointCrossover.NPointCrossover(int)",
      "begin_line": 67,
      "end_line": 72,
      "comment": "\n     * Creates a new {@link NPointCrossover} policy using the given number of points.\n     * \u003cp\u003e\n     * \u003cb\u003eNote\u003c/b\u003e: the number of crossover points must be \u0026lt; \u003ccode\u003echromosome length - 1\u003c/code\u003e.\n     * This condition can only be checked at runtime, as the chromosome length is not known in advance.\n     *\n     * @param crossoverPoints the number of crossover points\n     * @throws NotStrictlyPositiveException if the number of {@code crossoverPoints} is not strictly positive\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 70,col 9)",
        "(line 71,col 9)-(line 71,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.NPointCrossover.getCrossoverPoints()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Returns the number of crossover points used by this {@link CrossoverPolicy}.\n     *\n     * @return the number of crossover points\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.NPointCrossover.crossover(org.apache.commons.math3.genetics.Chromosome, org.apache.commons.math3.genetics.Chromosome)",
      "begin_line": 107,
      "end_line": 115,
      "comment": "\n     * Performs a N-point crossover. N random crossover points are selected and are used\n     * to divide the parent chromosomes into segments. The segments are copied in alternate\n     * order from the two parents to the corresponding child chromosomes.\n     *\n     * Example (2-point crossover):\n     * \u003cpre\u003e\n     * -C- denotes a crossover point\n     *           -C-       -C-                         -C-        -C-\n     * p1 \u003d (1 0  | 1 0 0 1 | 0 1 1)    X    p2 \u003d (0 1  | 1 0 1 0  | 1 1 1)\n     *      \\----/ \\-------/ \\-----/              \\----/ \\--------/ \\-----/\n     *        ||      (*)       ||                  ||      (**)       ||\n     *        VV      (**)      VV                  VV      (*)        VV\n     *      /----\\ /--------\\ /-----\\             /----\\ /--------\\ /-----\\\n     * c1 \u003d (1 0  | 1 0 1 0  | 0 1 1)    X   c2 \u003d (0 1  | 1 0 0 1  | 0 1 1)\n     * \u003c/pre\u003e\n     *\n     * @param first first parent (p1)\n     * @param second second parent (p2)\n     * @return pair of two children (c1,c2)\n     * @throws MathIllegalArgumentException iff one of the chromosomes is\n     *   not an instance of {@link AbstractListChromosome}\n     * @throws DimensionMismatchException if the length of the two chromosomes is different\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 114,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.NPointCrossover.mate(org.apache.commons.math3.genetics.AbstractListChromosome\u003cT\u003e, org.apache.commons.math3.genetics.AbstractListChromosome\u003cT\u003e)",
      "begin_line": 126,
      "end_line": 178,
      "comment": "\n     * Helper for {@link #crossover(Chromosome, Chromosome)}. Performs the actual crossover.\n     *\n     * @param first the first chromosome\n     * @param second the second chromosome\n     * @return the pair of new chromosomes that resulted from the crossover\n     * @throws DimensionMismatchException if the length of the two chromosomes is different\n     * @throws NumberIsTooLargeException if the number of crossoverPoints is too large for the actual chromosomes\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 45)",
        "(line 131,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 136,col 9)",
        "(line 139,col 9)-(line 139,col 61)",
        "(line 140,col 9)-(line 140,col 62)",
        "(line 142,col 9)-(line 142,col 75)",
        "(line 143,col 9)-(line 143,col 76)",
        "(line 145,col 9)-(line 145,col 77)",
        "(line 147,col 9)-(line 147,col 36)",
        "(line 148,col 9)-(line 148,col 36)",
        "(line 150,col 9)-(line 150,col 46)",
        "(line 151,col 9)-(line 151,col 26)",
        "(line 152,col 9)-(line 168,col 9)",
        "(line 171,col 9)-(line 174,col 9)",
        "(line 176,col 9)-(line 177,col 78)"
      ]
    }
  ]
}