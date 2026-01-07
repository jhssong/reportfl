{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/genetics/ElitisticListPopulation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ElitisticListPopulation",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.genetics.ListPopulation"
      ],
      "begin_line": 29,
      "end_line": 108,
      "comment": "\n * Population of chromosomes which uses elitism (certain percentace of the best\n * chromosomes is directly copied to the next generation).\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "elitismRate"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " percentage of chromosomes copied to the next generation "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.genetics.ElitisticListPopulation.ElitisticListPopulation(java.util.List\u003corg.apache.commons.math.genetics.Chromosome\u003e, int, double)",
      "begin_line": 45,
      "end_line": 48,
      "comment": "\n     * Creates a new ElitisticListPopulation instance.\n     *\n     * @param chromosomes\n     *            list of chromosomes in the population\n     * @param populationLimit\n     *            maximal size of the population\n     * @param elitismRate\n     *            how many best chromosomes will be directly transferred to the\n     *            next generation [in %]\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 44)",
        "(line 47,col 9)-(line 47,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.genetics.ElitisticListPopulation.ElitisticListPopulation(int, double)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * Creates a new ListPopulation instance and initializes its inner\n     * chromosome list.\n     *\n     * @param populationLimit maximal size of the population\n     * @param elitismRate\n     *            how many best chromosomes will be directly transferred to the\n     *            next generation [in %]\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 31)",
        "(line 61,col 9)-(line 61,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.ElitisticListPopulation.nextGeneration()",
      "begin_line": 71,
      "end_line": 84,
      "comment": "\n     * Start the population for the next generation. The\n     * \u003ccode\u003e{@link #elitismRate}\u003ccode\u003e percents of the best\n     * chromosomes are directly copied to the next generation.\n     *\n     * @return the beginnings of the next generation.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 127)",
        "(line 75,col 9)-(line 75,col 64)",
        "(line 76,col 9)-(line 76,col 41)",
        "(line 79,col 9)-(line 79,col 96)",
        "(line 80,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.ElitisticListPopulation.setElitismRate(double)",
      "begin_line": 94,
      "end_line": 98,
      "comment": "\n     * Sets the elitism rate, i.e. how many best chromosomes will be directly\n     * transferred to the next generation [in %].\n     *\n     * @param elitismRate\n     *            how many best chromosomes will be directly transferred to the\n     *            next generation [in %]\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 96,col 82)",
        "(line 97,col 9)-(line 97,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.ElitisticListPopulation.getElitismRate()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Access the elitism rate.\n     * @return the elitism rate\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 32)"
      ]
    }
  ]
}