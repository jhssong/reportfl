{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/genetics/ElitisticListPopulation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ElitisticListPopulation",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.genetics.ListPopulation"
      ],
      "begin_line": 36,
      "end_line": 120,
      "comment": "\n * Population of chromosomes which uses elitism (certain percentage of the best\n * chromosomes is directly copied to the next generation).\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "elitismRate"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " percentage of chromosomes copied to the next generation "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.genetics.ElitisticListPopulation.ElitisticListPopulation(java.util.List\u003corg.apache.commons.math3.genetics.Chromosome\u003e, int, double)",
      "begin_line": 52,
      "end_line": 59,
      "comment": "\n     * Creates a new {@link ElitisticListPopulation} instance.\n     *\n     * @param chromosomes list of chromosomes in the population\n     * @param populationLimit maximal size of the population\n     * @param elitismRate how many best chromosomes will be directly transferred to the next generation [in %]\n     * @throws NullArgumentException if the list of chromosomes is {@code null}\n     * @throws NotPositiveException if the population limit is not a positive number (\u0026lt; 1)\n     * @throws NumberIsTooLargeException if the list of chromosomes exceeds the population limit\n     * @throws OutOfRangeException if the elitism rate is outside the [0, 1] range\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 44)",
        "(line 57,col 9)-(line 57,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.genetics.ElitisticListPopulation.ElitisticListPopulation(int, double)",
      "begin_line": 69,
      "end_line": 75,
      "comment": "\n     * Creates a new {@link ElitisticListPopulation} instance and initializes its inner chromosome list.\n     *\n     * @param populationLimit maximal size of the population\n     * @param elitismRate how many best chromosomes will be directly transferred to the next generation [in %]\n     * @throws NotPositiveException if the population limit is not a positive number (\u0026lt; 1)\n     * @throws OutOfRangeException if the elitism rate is outside the [0, 1] range\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 31)",
        "(line 73,col 9)-(line 73,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.ElitisticListPopulation.nextGeneration()",
      "begin_line": 83,
      "end_line": 97,
      "comment": "\n     * Start the population for the next generation. The \u003ccode\u003e{@link #elitismRate}\u003c/code\u003e\n     * percents of the best chromosomes are directly copied to the next generation.\n     *\n     * @return the beginnings of the next generation.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 86,col 84)",
        "(line 88,col 9)-(line 88,col 68)",
        "(line 89,col 9)-(line 89,col 41)",
        "(line 92,col 9)-(line 92,col 95)",
        "(line 93,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.ElitisticListPopulation.setElitismRate(double)",
      "begin_line": 105,
      "end_line": 110,
      "comment": "\n     * Sets the elitism rate, i.e. how many best chromosomes will be directly transferred to the next generation [in %].\n     *\n     * @param elitismRate how many best chromosomes will be directly transferred to the next generation [in %]\n     * @throws OutOfRangeException if the elitism rate is outside the [0, 1] range\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.ElitisticListPopulation.getElitismRate()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * Access the elitism rate.\n     * @return the elitism rate\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 32)"
      ]
    }
  ]
}