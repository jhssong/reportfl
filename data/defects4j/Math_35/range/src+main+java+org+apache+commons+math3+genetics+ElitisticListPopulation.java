{
  "filepath": "/tmp/Math-35b/src/main/java/org/apache/commons/math3/genetics/ElitisticListPopulation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ElitisticListPopulation",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.genetics.ListPopulation"
      ],
      "begin_line": 33,
      "end_line": 112,
      "comment": "\n * Population of chromosomes which uses elitism (certain percentage of the best\n * chromosomes is directly copied to the next generation).\n *\n * @version $Id$\n * @since 2.0\n "
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
      "signature": "org.apache.commons.math3.genetics.ElitisticListPopulation.ElitisticListPopulation(java.util.List\u003corg.apache.commons.math3.genetics.Chromosome\u003e, int, double)",
      "begin_line": 47,
      "end_line": 52,
      "comment": "\n     * Creates a new ElitisticListPopulation instance.\n     *\n     * @param chromosomes list of chromosomes in the population\n     * @param populationLimit maximal size of the population\n     * @param elitismRate how many best chromosomes will be directly transferred to the\n     *                    next generation [in %]\n     * @throws OutOfRangeException if the elitism rate is outside the [0, 1] range\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 44)",
        "(line 51,col 9)-(line 51,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.genetics.ElitisticListPopulation.ElitisticListPopulation(int, double)",
      "begin_line": 63,
      "end_line": 66,
      "comment": "\n     * Creates a new ListPopulation instance and initializes its inner\n     * chromosome list.\n     *\n     * @param populationLimit maximal size of the population\n     * @param elitismRate how many best chromosomes will be directly transferred to the\n     *                    next generation [in %]\n     * @throws OutOfRangeException if the elitism rate is outside the [0, 1] range\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 31)",
        "(line 65,col 9)-(line 65,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.ElitisticListPopulation.nextGeneration()",
      "begin_line": 74,
      "end_line": 87,
      "comment": "\n     * Start the population for the next generation. The \u003ccode\u003e{@link #elitismRate}\u003c/code\u003e\n     * percents of the best chromosomes are directly copied to the next generation.\n     *\n     * @return the beginnings of the next generation.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 127)",
        "(line 78,col 9)-(line 78,col 64)",
        "(line 79,col 9)-(line 79,col 41)",
        "(line 82,col 9)-(line 82,col 100)",
        "(line 83,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.ElitisticListPopulation.setElitismRate(double)",
      "begin_line": 97,
      "end_line": 102,
      "comment": "\n     * Sets the elitism rate, i.e. how many best chromosomes will be directly\n     * transferred to the next generation [in %].\n     *\n     * @param elitismRate how many best chromosomes will be directly transferred to the\n     *                    next generation [in %]\n     * @throws OutOfRangeException if the elitism rate is outside the [0, 1] range\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.ElitisticListPopulation.getElitismRate()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Access the elitism rate.\n     * @return the elitism rate\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 32)"
      ]
    }
  ]
}