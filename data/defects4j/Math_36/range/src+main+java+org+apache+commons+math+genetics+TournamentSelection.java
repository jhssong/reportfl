{
  "filepath": "/tmp/Math-36b/src/main/java/org/apache/commons/math/genetics/TournamentSelection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TournamentSelection",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.genetics.SelectionPolicy"
      ],
      "begin_line": 34,
      "end_line": 116,
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
      "signature": "org.apache.commons.math.genetics.TournamentSelection.TournamentSelection(int)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Creates a new TournamentSelection instance.\n     *\n     * @param arity how many chromosomes will be drawn to the tournament\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.TournamentSelection.select(org.apache.commons.math.genetics.Population)",
      "begin_line": 57,
      "end_line": 60,
      "comment": "\n     * Select two chromosomes from the population. Each of the two selected\n     * chromosomes is selected based on n-ary tournament -- this is done by\n     * drawing {@link #arity} random chromosomes without replacement from the\n     * population, and then selecting the fittest chromosome among them.\n     *\n     * @param population the population from which the chromosomes are choosen.\n     * @return the selected chromosomes.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 59,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.TournamentSelection.tournament(org.apache.commons.math.genetics.ListPopulation)",
      "begin_line": 72,
      "end_line": 96,
      "comment": "\n     * Helper for {@link #select(Population)}. Draw {@link #arity} random\n     * chromosomes without replacement from the population, and then select the\n     * fittest chromosome among them.\n     *\n     * @param population the population from which the chromosomes are choosen.\n     * @return the selected chromosome.\n     * @throws MathIllegalArgumentException if the tournament arity is bigger than the\n     * population size\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 76,col 9)",
        "(line 78,col 9)-(line 83,col 10)",
        "(line 86,col 9)-(line 86,col 95)",
        "(line 87,col 9)-(line 93,col 9)",
        "(line 95,col 9)-(line 95,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.TournamentSelection.Anonymous-ea4a8d79-d79a-4c0d-bb02-9943e0b34fd3.nextGeneration()",
      "begin_line": 79,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 17)-(line 81,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.TournamentSelection.getArity()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Gets the arity (number of chromosomes drawn to the tournament).\n     *\n     * @return arity of the tournament\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.TournamentSelection.setArity(int)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Sets the arity (number of chromosomes drawn to the tournament).\n     *\n     * @param arity arity of the tournament\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 27)"
      ]
    }
  ]
}