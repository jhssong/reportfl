{
  "filepath": "/tmp/Math-81b/src/main/java/org/apache/commons/math/genetics/TournamentSelection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TournamentSelection",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.genetics.SelectionPolicy"
      ],
      "begin_line": 31,
      "end_line": 114,
      "comment": "\n * Tournament selection scheme. Each of the two selected chromosomes is selected\n * based on n-ary tournament -- this is done by drawing {@link #arity} random\n * chromosomes without replacement from the population, and then selecting the\n * fittest chromosome among them.\n *\n * @since 2.0\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "arity"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " number of chromosomes included in the tournament selections "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.genetics.TournamentSelection.TournamentSelection(int)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Creates a new TournamentSelection instance.\n     *\n     * @param arity\n     *            how many chromosomes will be drawn to the tournament\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.TournamentSelection.select(org.apache.commons.math.genetics.Population)",
      "begin_line": 56,
      "end_line": 61,
      "comment": "\n     * Select two chromosomes from the population. Each of the two selected\n     * chromosomes is selected based on n-ary tournament -- this is done by\n     * drawing {@link #arity} random chromosomes without replacement from the\n     * population, and then selecting the fittest chromosome among them.\n     *\n     * @param population\n     *            the population from which the chromosomes are choosen.\n     * @return the selected chromosomes.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 60,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.TournamentSelection.tournament(org.apache.commons.math.genetics.ListPopulation)",
      "begin_line": 72,
      "end_line": 94,
      "comment": "\n     * Helper for {@link #select(Population)}. Draw {@link #arity} random\n     * chromosomes without replacement from the population, and then select the\n     * fittest chromosome among them.\n     *\n     * @param population\n     *            the population from which the chromosomes are choosen.\n     * @return the selected chromosome.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 74,col 106)",
        "(line 76,col 9)-(line 81,col 10)",
        "(line 84,col 9)-(line 84,col 95)",
        "(line 85,col 9)-(line 91,col 9)",
        "(line 93,col 9)-(line 93,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.TournamentSelection.Anonymous-db5369eb-7aa2-4270-8cf1-c18fcee0d672.nextGeneration()",
      "begin_line": 77,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 17)-(line 79,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.TournamentSelection.getArity()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Gets the arity (number of chromosomes drawn to the tournament).\n     *\n     * @return arity of the tournament\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.TournamentSelection.setArity(int)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Sets the arity (number of chromosomes drawn to the tournament).\n     *\n     * @param arity arity of the tournament\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 27)"
      ]
    }
  ]
}