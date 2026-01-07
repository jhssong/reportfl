{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/genetics/TournamentSelection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TournamentSelection",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.genetics.SelectionPolicy"
      ],
      "begin_line": 34,
      "end_line": 115,
      "comment": "\n * Tournament selection scheme. Each of the two selected chromosomes is selected\n * based on n-ary tournament -- this is done by drawing {@link #arity} random\n * chromosomes without replacement from the population, and then selecting the\n * fittest chromosome among them.\n *\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "arity"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " number of chromosomes included in the tournament selections "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.genetics.TournamentSelection.TournamentSelection(int)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Creates a new TournamentSelection instance.\n     *\n     * @param arity how many chromosomes will be drawn to the tournament\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.TournamentSelection.select(org.apache.commons.math3.genetics.Population)",
      "begin_line": 58,
      "end_line": 61,
      "comment": "\n     * Select two chromosomes from the population. Each of the two selected\n     * chromosomes is selected based on n-ary tournament -- this is done by\n     * drawing {@link #arity} random chromosomes without replacement from the\n     * population, and then selecting the fittest chromosome among them.\n     *\n     * @param population the population from which the chromosomes are chosen.\n     * @return the selected chromosomes.\n     * @throws MathIllegalArgumentException if the tournament arity is bigger than the population size\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 60,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.TournamentSelection.tournament(org.apache.commons.math3.genetics.ListPopulation)",
      "begin_line": 71,
      "end_line": 95,
      "comment": "\n     * Helper for {@link #select(Population)}. Draw {@link #arity} random chromosomes without replacement from the\n     * population, and then select the fittest chromosome among them.\n     *\n     * @param population the population from which the chromosomes are choosen.\n     * @return the selected chromosome.\n     * @throws MathIllegalArgumentException if the tournament arity is bigger than the population size\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 75,col 9)",
        "(line 77,col 9)-(line 82,col 10)",
        "(line 85,col 9)-(line 85,col 95)",
        "(line 86,col 9)-(line 92,col 9)",
        "(line 94,col 9)-(line 94,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.TournamentSelection.Anonymous-67e39a6b-a71b-426e-8016-6d91d462594a.nextGeneration()",
      "begin_line": 78,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 17)-(line 80,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.TournamentSelection.getArity()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Gets the arity (number of chromosomes drawn to the tournament).\n     *\n     * @return arity of the tournament\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.TournamentSelection.setArity(int)",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * Sets the arity (number of chromosomes drawn to the tournament).\n     *\n     * @param arity arity of the tournament\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 27)"
      ]
    }
  ]
}