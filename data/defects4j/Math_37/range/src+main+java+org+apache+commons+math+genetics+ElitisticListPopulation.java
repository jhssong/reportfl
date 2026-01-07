{
  "filepath": "/tmp/Math-37b/src/main/java/org/apache/commons/math/genetics/ElitisticListPopulation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ElitisticListPopulation",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.genetics.ListPopulation"
      ],
      "begin_line": 33,
      "end_line": 110,
      "comment": "\n * Population of chromosomes which uses elitism (certain percentace of the best\n * chromosomes is directly copied to the next generation).\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "elitismRate"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " percentage of chromosomes copied to the next generation "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.genetics.ElitisticListPopulation.ElitisticListPopulation(java.util.List\u003corg.apache.commons.math.genetics.Chromosome\u003e, int, double)",
      "begin_line": 46,
      "end_line": 51,
      "comment": "\n     * Creates a new ElitisticListPopulation instance.\n     *\n     * @param chromosomes list of chromosomes in the population\n     * @param populationLimit maximal size of the population\n     * @param elitismRate how many best chromosomes will be directly transferred to the\n     *                    next generation [in %]\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 44)",
        "(line 50,col 9)-(line 50,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.genetics.ElitisticListPopulation.ElitisticListPopulation(int, double)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * Creates a new ListPopulation instance and initializes its inner\n     * chromosome list.\n     *\n     * @param populationLimit maximal size of the population\n     * @param elitismRate how many best chromosomes will be directly transferred to the\n     *                    next generation [in %]\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 31)",
        "(line 63,col 9)-(line 63,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.ElitisticListPopulation.nextGeneration()",
      "begin_line": 72,
      "end_line": 85,
      "comment": "\n     * Start the population for the next generation. The \u003ccode\u003e{@link #elitismRate}\u003ccode\u003e\n     * percents of the best chromosomes are directly copied to the next generation.\n     *\n     * @return the beginnings of the next generation.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 127)",
        "(line 76,col 9)-(line 76,col 64)",
        "(line 77,col 9)-(line 77,col 41)",
        "(line 80,col 9)-(line 80,col 100)",
        "(line 81,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.ElitisticListPopulation.setElitismRate(double)",
      "begin_line": 95,
      "end_line": 100,
      "comment": "\n     * Sets the elitism rate, i.e. how many best chromosomes will be directly\n     * transferred to the next generation [in %].\n     *\n     * @param elitismRate how many best chromosomes will be directly transferred to the\n     *                    next generation [in %]\n     * @throws OutOfRangeException if the elitism rate is outside the [0, 1] range\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.ElitisticListPopulation.getElitismRate()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * Access the elitism rate.\n     * @return the elitism rate\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 32)"
      ]
    }
  ]
}